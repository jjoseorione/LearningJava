package com.orion.cursojpa.persistencia;

import com.orion.cursojpa.logica.Alumno;
import com.orion.cursojpa.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    //Esta clase crea todos los  los JPAControllers y administra sus métodos CRUD
    AlumnoJpaController alumnoController = new AlumnoJpaController();

    public void crearAlumno(Alumno alu) {
        alumnoController.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoController.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alumnoController.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alumnoController.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        List<Alumno> lista = alumnoController.findAlumnoEntities();
        return new ArrayList<Alumno> (lista);
    }
    
}
