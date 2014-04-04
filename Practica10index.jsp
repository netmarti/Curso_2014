
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Operaciones matemáticas</title>
    </head>
    <body>
        <h1>Práctica 10 potencia y raíz cuadrada - Servlet</h1>
        <p>Introduce dos numeros:</p>

        <form method="post" action="PotenciaRaizServlet">
            <label for="numero1">Numero 1</label>
            <input type="text" name="numero1" class="input" size="20" id="numero1" tabindex="1" />
            <br />
            <br />
            <label for="numero2">Numero 2</label>
            <input type="text" name="numero2" class="input" size="20" id="numero2" tabindex="1" />
            <br />
            <br />

            <input type="submit" name="submit" value="Calcular"/>

        </form>
    </body>
</html>
