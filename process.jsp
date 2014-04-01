<%-- 
    Document   : process
    Created on : 01-abr-2014, 12:27:38
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

 <%
     //procesamos los datos enviados por el formulario index.jsp
     
     String nombre = request.getParameter("nombre");
     String apellido = request.getParameter("apellido");
     
     if ((nombre == "" || nombre == null)|| (apellido =="" || apellido == null)){
            response.sendRedirect("result.jsp?nombre="+nombre+"&edad="+apellido);
            
        }
        else{
            response.sendRedirect("index.jsp");
            }
        %>
