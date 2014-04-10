<%-- 
    Document   : principal
    Created on : 11-abr-2014, 0:41:23
    Author     : dan
--%>

<%@page import="fjsp.modelo.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
HttpSession sesion  request.getSession();
Usuario userObj =(Usuario).sesion.getAtribute("autUsuario");

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hola <%=userObj.getNombre()%></h1>
    </body>
</html>
