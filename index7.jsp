

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 7 JSP</title>
    </head>
    <BODY BGCOLOR="moccasin">
        <P></P>
        <H2>Introduce tus datos:</H2><BR>
        <CENTER>
        <form method="post" action="process.jsp">
            <label for="nombre">Nombre:</label>
            <input type="text" name="nombre" class="input" size="20" id="nombre" tabindex="1" />
            <br />
            <br />
            <label for="edad">Edad:</label>
            <input type="text" name="edad" class="input" size="20" id="edad" tabindex="2" />
            <br />
            <br />		
            <input type="submit" name="submit" value="Envia"/>
            Formulario HTML que llamará a una página jsp
        </form>
        </CENTER>
    </body>
</html>
