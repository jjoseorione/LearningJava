package com.orion.cursojpa;

import com.orion.cursojpa.logica.Alumno;
import com.orion.cursojpa.logica.ControladoraLogica;
import java.util.ArrayList;
import java.util.Date;

public class CursoJPA {

    public static void main(String[] args) {
        ControladoraLogica controlLogi = new ControladoraLogica();      //Se crea una instancia de controlador lógico
        
        //Alumno alu1 = new Alumno(20, "Pedro", "Querendón", new Date());   //Se crea el objeto alumno que se guardará en la BD
        //System.out.println("alu1 antes de edit: " + alu1.toString());
        //controlLogi.crearAlumno(alu1);                      //Se crea el alumno en la BD con ayuda del objeto de la clase
                                                            //controladoraLogica. controlLogi lo envía a controlPersis y
                                                            //éste último lo guarda en la base de datos.
        //controlLogi.eliminarAlumno(20);                   //Se elimina el alumno
        
        //alu1.setApellido("Páramo");
        //controlLogi.editarAlumno(alu1);
        
        Alumno alu1 = controlLogi.traerAlumno(15);
        System.out.println("---------------------- BÚSQUEDA INDIVIDUAL ----------------------");
        System.out.println("alu1 { " + alu1.toString() + " } ");
        
        System.out.println("---------------------- BÚSQUEDA GRUPAL ----------------------");
        ArrayList<Alumno> listaAlumnos = controlLogi.traerListaAlumnos();
        for (Alumno al : listaAlumnos){
            System.out.println("Alumno { " + al.toString() + " } ");
        }
    }
}
