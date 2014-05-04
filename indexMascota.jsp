<%-- 
    Document   : index
    Created on : 03-may-2014, 13:55:50
    Author     : dan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Refugio de Mascotas</title>
    </head>
    <body>
        <h1>Añadir mascota</h1>
        <form name="nuevaMascota" action="nuevaMascota" method="POST">
            TIPO: 
                <select name="tipoMascota">
                <option name="tipoMascota" value="ave">Ave</option>
                <option name="tipoMascota" value="mamifero">Mamífero</option>
                <option name="tipoMascota" value="pez">Pez</option>
                <option name="tipoMascota" value="reptil">Reptil</option>
            </select><br><br>
            Número de Chip: <input type="text" name="chip" value="">
            Nombre: <input type="text" name="nomMascota" value="">
            <br><br>
            ALIMENTACION:
            <br>
            Carnívoro<input type="radio" name="alimentacion" value="carnivoro" />
            Herbívoro<input type="radio" name="alimentacion" value="herbivoro" />
            Omnívoro<input type="radio" name="alimentacion" value="omnivoro" />
            <br>
            <br>
            SANGRE:
            <br>
            Caliente<input type="radio" name="tipoSangre" value="caliente" />
            Fría<input type="radio" name="tipoSangre" value="fria" />
            <br>
            <br>
            HABITAT:
            <br>
            Tierra<input type="radio" name="habitat" value="tierra" />
            Mar<input type="radio" name="habitat" value="mar" />
            Aire<input type="radio" name="habitat" value="aire" />
            Anfibio<input type="radio" name="habitat" value="anfibio" />
            <br><br>
            <input type="submit" value="ENVIAR">
        </form>
    </body>
</html>
