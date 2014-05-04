<%--PRACTICA 32 TIENDA VEHICULOS--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Practica 32 Clases </h1>
        <form method="post" action="ServletClaseCreacion">
            <p>Categoría
                <label for="tipo">Tipo:</label>
                <input type="text" name="tipo">
                <br>

                <label for="descripcion">Descripción:</label>
                <input type="text" name="descripcion">
                <br>
            </p>

            <p>Tipo de vehículo:
                <select name="vehiculo">
                    <option value="Coche">Coche</option>
                    <option value="Moto">Moto</option>
                </select>   
                <br><br>
                <label for="matricula">Matrícula: </label>
                <input type="text" name="matricula">
                <br>

                <label for="color">Color: </label>
                <input type="text" name="color">
                <br>

                <label for="fabricante">Fabricante: </label>
                <input type="text" name="fabricante">
                <br>
                
                <label for="modelo">Modelo: </label>
                <input type="text" name="modelo">
                <br>
                
                <label for="velocidadMax">Velocidad Máxima: </label>
                <input type="text" name="velocidadMax">
                <br>
                
                 <label for="potencia">Potencia: </label>
                <input type="text" name="potencia">
                <br>
                
                 <label for="cilindros">Cilindros: </label>
                <input type="text" name="cilindros">
                <br>
            </p>

            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
