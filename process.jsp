<%-- 
    Document   : process
    Created on : 01-abr-2014, 12:38:05
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
        <% if((nombre=="" || nombre==null)|| (apellido=="" || apellido==null) || (edadString=="")){
           response.sendRedirect("index.jsp"); 
          
          }
          else{
            
           response.sendRedirect("result.jsp?nombre=" + nombre + "&edad=" + edad);
        
            }
        %>
    </body>
</html>
