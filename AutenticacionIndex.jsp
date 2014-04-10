<%-- 
    Document   : index
    Created on : 10-abr-2014, 20:01:17
    Author     : dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    
    <%
       HttpSession sesion = request.getSession();
       String strError = (String)sesion.getAttribute("autError");
       if (strError !=null && !strError.equals("")){
       out.print("<script>alert('"+strError+"');</script>");
       }
    %>
    
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%-- 
        Panel para controlar el error en el login
        --%>
        
        <%if (strError !=null && !strError.equals("")){%>
        <table>
                <tr>
                    <td><%=strError%></td>
                </tr>
           
        </table>
        <%}%>

        
        
        <h1>FORMULARIO LOGIN</h1>
        <form name="formUsuario" action="./autenticacionServlet" method="POST">
            
            <label>Usuario: <input id="txtUserName" type="text" name="txtUserName" value="" /></label>
            <label>Clave: <input id="txtUserPas" type="password" name="txtUserPas" value="" /></label>
            <input id="btGuardar" type="submit" value="Acceder"  />
        </form>
    </body>
</html>
