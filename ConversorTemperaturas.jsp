<%-- 
    Document   : index
    Created on : 06-abr-2014, 22:06:11
    Author     : dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Conversor</title>
    </head>
    <body>
        <div style="margin: auto; text-align: center; padding-top: 100px">
        <h1>Dame valores para convertir</h1>
        
        
            <form name="formConvertidor" action="convertidor" method="POST">
            
                Celsius:<input type=number name="celsius" value="0" />
                Fahrenheit:<input type=number name="fahrenheit" value="0" />
                <br><br>
                <input type="submit" value="Enviar" name="btcelsius" />
                <td><input type="submit" value="Enviar" name="btfah" />
                
            </form>
        </div>

    </body>
</html>
