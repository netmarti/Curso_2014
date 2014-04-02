

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
  //processando los datos enviados por formulario en index.jsp  
    String nombre = request.getParameter("nombre");
    String edad = request.getParameter("edad");
    if (nombre != "" && edad != "") {
       
        response.sendRedirect("result.jsp?nombre="+nombre+"&edad="+edad);
    }
    else {
        response.sendRedirect("index.jsp");
    }
%>
