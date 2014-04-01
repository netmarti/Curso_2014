<%-- 
    Document   : result
    Created on : 01-abr-2014, 12:26:53
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //procesando los datos enviados por formulario en index.jsp
    
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    
    if ((nombre == "" || nombre == null)|| (apellido =="" || apellido == null)){
            response.sendRedirect("result.jsp?nombre="+nombre+"&apellido="+apellido);
            
        }
        else{
            response.sendRedirect("index.jsp");
            }
%><%-- 
    Document   : result
    Created on : 01-abr-2014, 12:26:53
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    //procesando los datos enviados por formulario en index.jsp
    
    String nombre = request.getParameter("nombre");
    String apellido = request.getParameter("apellido");
    
    if ((nombre == "" || nombre == null)|| (apellido =="" || apellido == null)){
            response.sendRedirect("result.jsp?nombre="+nombre+"&apellido="+apellido);
            
        }
        else{
            response.sendRedirect("index.jsp");
            }
%>
