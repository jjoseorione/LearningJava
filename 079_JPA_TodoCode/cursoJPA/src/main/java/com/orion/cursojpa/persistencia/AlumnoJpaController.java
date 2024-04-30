package com.orion.cursojpa.persistencia;

import com.orion.cursojpa.logica.Alumno;
import com.orion.cursojpa.persistencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AlumnoJpaController implements Serializable {

    public AlumnoJpaController(EntityManagerFactory emf) {
        System.out.println("Entrando a constructor 1 AlumnoJPAController");
        this.emf = emf;
    }
    
    public AlumnoJpaController(){
        System.out.println("Entrando a constructor 0 AlumnoJPAController");
        emf = Persistence.createEntityManagerFactory("cursoJPA_PU");    
                //se crea una instancia de la Interface EntityManagerFactory, 
                //mediante la clase Persistence, ésta última recibe como parámetro
                //el nombre de la unidad de persistencia que definimos en el archivo 
                //persistence.xml (se declara desde el inicio como un atributo de la clase).
    }
    
    private EntityManagerFactory emf = null;        

    public EntityManager getEntityManager() {   
        return emf.createEntityManager();      //una vez con el EntityManagerFactory 
                                               //se obtiene una instancia de EntityManager 
                                               //para finalmente ser retornada para ser utilizada.
    }

    public void create(Alumno alumno) {
        System.out.println("Entrando a método create AlumnoJPAController");
        EntityManager em = null;
        try {
            em = getEntityManager();            //Se crea un em
            em.getTransaction().begin();        
            em.persist(alumno);                 
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();                     //Se cierra la em
            }
        }
    }

    public void edit(Alumno alumno) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            alumno = em.merge(alumno);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = alumno.getId();
                if (findAlumno(id) == null) {
                    throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Alumno alumno;
            try {
                alumno = em.getReference(Alumno.class, id);
                alumno.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The alumno with id " + id + " no longer exists.", enfe);
            }
            em.remove(alumno);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Alumno> findAlumnoEntities() {
        return findAlumnoEntities(true, -1, -1);
    }

    public List<Alumno> findAlumnoEntities(int maxResults, int firstResult) {
        return findAlumnoEntities(false, maxResults, firstResult);
    }

    private List<Alumno> findAlumnoEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Alumno.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Alumno findAlumno(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Alumno.class, id);
        } finally {
            em.close();
        }
    }

    public int getAlumnoCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Alumno> rt = cq.from(Alumno.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
