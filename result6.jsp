<%-- 
    Document   : result
    Created on : 01-abr-2014, 12:38:19
    Author     : FO-Mañana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    String nombre=request.getParameter("nombre");
    String apellido=request.getParameter("apellido");
    String edadString=request.getParameter("edad");
    int edad=0;
      if(edadString !=null && edadString != ""){
          edad=Integer.parseInt(edadString);
      }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Resultado de formulario utilizando 3 archivos JSP</h1>
        <ul>
            <li>Tu nombre es: <%=nombre%> </li>
            <li>Tu apellido es: <%=apellido%> </li>
            <li>Tu edad es: <%=edad%> </li>
        </ul>
    </body>
</html>
