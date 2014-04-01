<%-- 
    Document   : index
    Created on : 01-abr-2014, 12:37:37
    Author     : FO-Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body BGCOLOR="#CCCCFF">
        <h1>Formulario</h1>
        
            <P></P>
            <H2>Introduce tus datos:</H2><BR>
            <HR></HR>
            <CENTER>
            <form method="post" action="process.jsp">
            <label for="nombre">Nombre</label>
            <input type="text" name="nombre" class="input" size="20" id="nombre" tabindex="1" />
            <br />
            <br />
            <label for="apellido">Apellido</label>
            <input type="text" name="apellido" class="input" size="20" id="nombre" tabindex="1" />
            <br />
            <br />
            <label for="edad">Edad</label>
            <input type="text" name="edad" class="input" size="20" id="edad" tabindex="2" />
            <br />
            <br />
            <input type="submit" name="submit" value="Envia"/>
            <HR></HR>
            Formulario HTML que invocará a process.jsp
            </form>
            
            </CENTER>
    </body>
</html>
