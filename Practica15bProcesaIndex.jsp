<%-- 
    Document   : index
    Created on : 07-abr-2014, 11:48:11
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 15b</title>
    </head>
    <body>
        <h1>Suma los 100 primeros números enteros positivos</h1>
        <form action="practica15bProcesa" method="post">
            Dame un valor: <input type="text" name="num" value="0" />
            <input type="submit" value="Enviar" name="btenviar" />
        </form>
    </body>
</html>
