/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.orion.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import logica.Usuario;

/**
 *
 * @author xmx7265
 * 
 * La anotación @WebServlet le da el nombre y la ruta a nuestro Servlet
 */
@WebServlet(name = "SvUsuario", urlPatterns = {"/SvUsuario"})
public class SvUsuario extends HttpServlet {

    /**
     * Este método nos ayuda a mostrar algo en la página de Action. Puede no usarse
     * en caso de no ser necesario.
     * 
     * request es la request (solicitud) por parte del servlet
     * reponse es la respuesta del servlet
     * 
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
    */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");     //Se establece el tipo de contenido en HTML
        try (PrintWriter out = response.getWriter()) {          //Try with resources. Crea un objeto tipo PrintWriter para guardar el writer de la respuesta del Servlet 
            /* Las lineas con el siguiente formato escriben sobre el documento HTML de la respuesta. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SvUsuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SvUsuario at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Se ejecuta al realizar una petición GET
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        //String numUsuario = request.getParameter("numUsuario");
        //System.out.println("numUsuario = " + numUsuario);
        List<Usuario> listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("EIME", "Juan", "Perez", "hola@gmail.com", "5578954226"));        //Creamos una representación de una BD
        listaUsuarios.add(new Usuario("RJNS", "Pedro", "Suarez", "pedro@gmail.com", "654812941"));
        listaUsuarios.add(new Usuario("PLEO", "Luis", "Gonzalez", "luis@gmail.com", "78521489"));
        HttpSession misesion = request.getSession();        //Obtiene la sesión HTTP del request
        misesion.setAttribute("listaUsuarios", listaUsuarios);  //Se crea el atributo listaUsuarios y se añade la lista (clave, valor)
        response.sendRedirect("mostrarUsuarios.jsp");       //Se redirecciona la response al jsp indicado
    }

    /**
     * Se ejecuta al realizar una petición POST
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        String curp = request.getParameter("curp");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String correo = request.getParameter("correo");
        String telefono = request.getParameter("telefono");
        
        System.out.println(curp);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(correo);
        System.out.println(telefono);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
