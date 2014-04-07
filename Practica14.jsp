<%-- 
    Document   : index
    Created on : 07-abr-2014, 9:49:07
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Práctica 14 A</title>
    </head>
    <body>
        <h1>Práctica switch-case</h1>
        <form action="proces14a" method="post">
            <label for="nota">NOTA:</label>
            <select id="nota" name="nota">
                <option value= "0">0</option>
                <option value= "1">1</option>
                <option value= "2">2</option>
                <option value= "3">3</option>
                <option value= "4">4</option>
                <option value= "5">5</option>
                <option value= "6">6</option>
                <option value= "7">7</option>
                <option value= "8">8</option>
                <option value= "9">9</option>
                <option value= "10">10</option>
            </select>
            <br><br>
            
            <input type="submit" value="Enviar" name="btenviar" />
            
        </form>
        
    </body>
</html>
