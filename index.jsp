<%-- 
    Document   : index
    Created on : 01-abr-2014, 12:24:41
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Formulario</title>
    </head>
    <body>
       
        <h1>Hola Formulario</h1>
        <form method="post" action="index.jsp">
            <label for="nombre">Nombre</label>
            <input type="text" name="nombre">
            <input type="text" name="apellido">
            <input type="submit">
        </form>
        <%}
        else{
            
        %>
        <h2>Leyendo parámetros desde el formulario</h2>
        <ul>
            <li>
                Te llamas: <%= nombre%>
            </li>
            <li>
                Te apellidas: <%= apellido%>
            </li>
        </ul>
            <% }
            %>
    </body>
</html>
