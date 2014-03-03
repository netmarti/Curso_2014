// ALGUNOS EJEMPLOS DE FUNCIONES USADAS FRECUENTEMENTE EN JS


<script>
// concatenar cadenas de texto y número

var nombre = “Pepito”;
var apellido = “Pio”;
var socio = 13;

var mensaje= nombre + “ “ + apellido + “ ” +socio; 
// usamos “ “ que nos crea un espacio en blanco

document.write(mensaje);
</script>

//------------------------------------
<script>

/*calcular la longitud de una cadena nos será muy útil para los Arrays usamos .length
recordemos que cuenta los espacios */
var nombre = “Pepito Pio”;
var numero_letras= nombre.length();

document.write(numero_letras);

</script>

// ------------------------------------
<script>
// obtener un carácter que se encuentra en la posición especificada.

var mensaje = “Hola Pepito”;
var numero = 5 // podemos recibir este valor desde un prompt u otra parte del programa

var letra = mensaje.charAt(numero); 
/* En el paréntesis (parámetro) indicamos la posición que queremos obtener
 recordemos que los espacios también nos los cuenta */

document.write(letra);

</script>

//----------------------------------------

<script>
// calcular la posición en la que se encuentra el carácter indicado, dentro del texto. Usamos .indexOf();
// empieza la búsqueda desde la izquierda

var mensaje = “Hola”;
var caracter = “a”;
var posicion = mensaje.indexOf(caracter);

var letra = mensaje.charAt(caracter); 

//En el paréntesis (parámetro) indicamos la posición que queremos obtener


document.write(posicion);

</script>

//-----------------------------------------

<script>
// calcular la posición en la que se encuentra el carácter indicado, dentro del texto. Usamos .lastIndexOf();
// empieza la búsqueda desde la derecha

var mensaje = “casa”;
var caracter = “a”;
var posicion = mensaje.indexOf(caracter);

var letra = mensaje.charAt(caracter); 
//En el paréntesis (parámetro) indicamos el carácter que queremos obtener

document.write(posicion);

// si no contiene el carácter especificado nos devolvería -1
</script>

//--------------------------------------------

// extraer una porción de la cadena de texto con la función .substring();

// extraer una porción de la cadena de texto con la función .substring();
<script>
var mensaje = "Dame una porción de este texto como ejemplo.";
var porcion = mensaje.substring(5,25); // pasamos números o variables
document.write(porcion);
</script>

//-----------------------------------------------

// separa las palabras o letras de la cadena de texto y la convierte en elementos de un Array .split();

<script>
var mensaje = "Convertir en un Array este texto de ejemplo.";
var palabras = mensaje.split(" "); // toma las palabras y las pasa a elementos del Array

/* pasamos las palabras de la cadena a elementos de un Array, para que nos separe las palabras por el espacio
   debemos colocar de este modo el argumento (" ") con unas comillas dobles y dejando un espacio entre ellas 
   nos crearía el siguiente Array(palabras);
   
   palabras = ["Convertir", "en", "un", "Array", "este", "mensaje", "de", "ejemplo."];
*/

document.write(palabras);
</script>
