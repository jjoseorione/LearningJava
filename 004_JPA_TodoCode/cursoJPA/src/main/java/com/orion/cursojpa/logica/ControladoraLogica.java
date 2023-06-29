package com.orion.cursojpa.logica;

import com.orion.cursojpa.persistencia.ControladoraPersistencia;
import java.util.ArrayList;

public class ControladoraLogica {
    //Esta clase debe permanecer en el paquete de lógica debido a que este proyecto sigue un modelo
    //de capas. Sin embargo, está ligada a la clase controladoraPersistencia, mapeándola por completo,
    //ya que esta clase es la que permite conectar con los controladores de persistencia de cada objeto.
    
    //Se crea el objeto controlPersis para que sea mapeado por ControladoraPersistencia
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    //Se mapea el método crearAlumno de una clase a la otra.
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    public Alumno traerAlumno(int id){
        return controlPersis.traerAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        return controlPersis.traerListaAlumnos();
    }

}
