<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Prácticas 13/14/14b - Estructuras de Control  </h1>
        <h2>Prácticas 13 - If-then-else</h2>
        <form action="ProcesaServletIf" method="post">
            <label for="nota">Nota:</label>
            <select id="nota" name="nota">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option> 
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>
            <input type="submit" value="Enviar">
        </form>
       
        <h2>Practica 14 - Switch </h2>
        <form action="ProcesaServletSwitch" method="post">
            <label for="nota">Nota:</label>
            <select id="nota" name="nota">
                <option value="0">0</option>
                <option value="1">1</option>
                <option value="2">2</option>
                <option value="3">3</option>
                <option value="4">4</option>
                <option value="5">5</option>
                <option value="6">6</option> 
                <option value="7">7</option>
                <option value="8">8</option>
                <option value="9">9</option>
                <option value="10">10</option>
            </select>
            <br /> 
          
            <input type="submit" value="Enviar">
        </form>
        
        <h2>Práctica 14b - Switch </h2>
        <form action="ProcesaServletCalculadora" method="post">
            <p>Dame dos valores para</p>
            <label for="numero1">Número 1:</label>
            <input type="text" name="numero1" size="3">
            <br />
            <label for="numero2">Número 2:</label>
            <input type="text" name="numero2" size="3">
            <br />

            <input type="radio" name="operacion" value="S">S
            <input type="radio" name="operacion" value="M">M
            <input type="radio" name="operacion" value="R">R
            <input type="radio" name="operacion" value="D">D
            <br />
            <input type="reset" value="Borrar">
            <input type="submit" value="Enviar">
        </form>
        
        <h2>Práctica 15 - While </h2>
        <form action="ProcesaServletWhile" method="post">
            <p>Valores hasta donde quieres sumar:</p>
            <label for="numero1">Número:</label>
            <input type="text" name="numero" size="3">
            <br />
            <input type="reset" value="Borrar">
            <input type="submit" value="Enviar">
        </form>
        <h2>Práctica 16 - For </h2>
        <form action="ProcesaServletFor" method="post">
            <p>Valores hasta donde quieres sumar:</p>
            <label for="numero1">Número:</label>
            <input type="text" name="numero" size="3">
            <br />
            <input type="reset" value="Borrar">
            <input type="submit" value="Enviar">
        </form>
        
    </body>
</html>
