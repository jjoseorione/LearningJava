<%-- 
    Document   : mostrarUsuarios
    Created on : 8 jun 2023, 15:42:42
    Author     : xmx7265
--%>

<%@page import="logica.Usuario"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mostrar Usuarios</title>
    </head>
    <body>
        <h1>Lista de Usuarios Registrados:</h1>
        <table>
            <thead>
                <tr>
                    <th>Num.</td>
                    <th>Curp</td>
                    <th>Nombre</td>
                    <th>Apellido</td>
                    <th>Correo</td>
                    <th>Teléfono</td>
                </tr>
            </thead>
            <tbody>
                <%
                List<Usuario> listaUsuarios = (List) request.getSession().getAttribute("listaUsuarios");
                int u = 1;
                for(Usuario usu : listaUsuarios){
                    %>
                    <tr>
                        <td><%=u%></td>
                        <td><%=usu.getCurp()%></td>
                        <td><%=usu.getNombre()%></td>
                        <td><%=usu.getApellido()%></td>
                        <td><%=usu.getCorreo()%></td>
                        <td><%=usu.getTelefono()%></td>
                    </tr>
                    <%
                    u++;
                }
                %>
            </tbody>
        </table>
    </body>
</html>
