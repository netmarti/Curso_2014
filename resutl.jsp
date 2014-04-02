

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
String nombre = request.getParameter("nombre");
String edad = request.getParameter("edad");
%>
<HTML>
    <HEAD><TITLE>login.jsp</TITLE></HEAD>
    <BODY BGCOLOR="moccasin">
        <P></P>
           
        <H2>Los parámetros vienen desde un formulario html</H2>
	<UL>
            <li>Te llamas <%=nombre%> </li>
            <li>y tienes <%=edad%> años</li>
        </UL>
        
        <a href="index.jsp"><BUTTON>index.jsp</BUTTON></a>
    
</BODY>
</HTML>
