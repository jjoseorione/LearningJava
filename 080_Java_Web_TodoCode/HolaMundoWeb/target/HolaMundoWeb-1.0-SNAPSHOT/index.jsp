<%-- 
    Document   : index
    Created on : 5 jun 2023, 23:44:58
    Author     : xmx7265
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Regístrate gratis</h1>
        <form action="SvUsuario" method="post">
            <p><label>CURP: </label><input type="text" name="curp"></p>
            <p><label>Nombre: </label><input type="text" name="nombre"></p>
            <p><label>Apellido: </label><input type="text" name="apellido"></p>
            <p><label>Correo: </label><input type="email" name="correo"></p>
            <p><label>Telefono: </label><input type="tel" name="telefono"></p>
            <p><button type="submit">Enviar</button>
        </form>
        
        <h1>Ver lista de usuarios</h1>
        <form id="ejemploGet" action="SvUsuario" method="get">
            <p>Para ver lista de usuarios, clic <a href="#" onclick="document.getElementById('ejemploGet').submit();">aquí</a></p>
        </form>
    </body>
</html>
