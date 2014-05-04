package controller;

import beans.Ave;

import beans.Mamifero;
import beans.Mascota;
import beans.Pez;
import beans.Reptil;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dan
 */
public class NuevaMascota extends HttpServlet {

    /**
     *propriedad de la clase nuevaMascota, ArrayList con la listaMascotas
     se necesita para guardar las mascotas que vamos agregando a la lista
     */
    private ArrayList<Mascota> listaMascotas;

    @Override
    public void init() throws ServletException {
        super.init(); 
        listaMascotas = new ArrayList<Mascota>();
    }
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        //guardo los parametros enviados por el formulario
        
        String chip = request.getParameter("chip");
        String tipoMascota = request.getParameter("tipoMascota");
        String nomMascota = request.getParameter("nomMascota");
        String alimentacion = request.getParameter("alimentacion");
        String habitat = request.getParameter("habitat");
        String sangre = request.getParameter("tipoSangre");
        
        //controlo que los datos esten bien definidos
        if ((chip != null && !chip.equals("")) && (tipoMascota != null && !tipoMascota.equals(""))
                && (nomMascota != null && !nomMascota.equals("")) && (alimentacion != null && !alimentacion.equals(""))
                && (habitat != null && !habitat.equals("")) && (sangre != null && !sangre.equals(""))) {
            
            //creo una instancia/objeto de  con los parametros enviado por el formulario
            Mascota mascota = new Mascota(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre);
        
            // creo instancia/objeto con los parámetros enviados del formulario para las mascotas
            
            Ave ave = null;
            Mamifero mamifero = null;
            Reptil reptil = null;
            Pez pez = null;
            
            if (tipoMascota.equals("ave")) {
                ave = new Ave(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre, alimentacion);
            }
            if (tipoMascota.equals("mamifero")) {
                mamifero = new Mamifero(alimentacion, chip, tipoMascota, nomMascota, alimentacion, habitat, sangre, listaMascotas, mascota);
            }
            if (tipoMascota.equals("reptil")) {
                reptil = new Reptil(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre, habitat, true);
            }
            if (tipoMascota.equals("pez")) {
                pez = new Pez(chip, tipoMascota, nomMascota, alimentacion, habitat, sangre, "Acuario grande");
            }
            
            //ahora, lo que no quiero hacer es añadir una mascota a la lista si ésta
            //ya existe en la lista
            //para poder hacer esto, busco la mascota (por chip) en la lista listaMascotas
            int index = -1;
            String mensaje="";  //DECLARO UNA VARIABLE POR SI EXISTE
            
             //llamo una funcion que busca una mascota por chip en la listaMascotas
            
            index= getChip(chip);
            
            //si no encuentra el chip añado la mascota a la lista
            
            if (index == -1) {
                //controlo que tipo de mascota y lo añado a la lista
                if (tipoMascota.equals("ave")) {   
                    listaMascotas.add(ave);
                }
                
                if (tipoMascota.equals("pez")) {
                    
                    listaMascotas.add(pez); 
                }
                
                if (tipoMascota.equals("mamifero")) {
                    
                    listaMascotas.add(mamifero);    
                }
                
                if (tipoMascota.equals("reptil")) {    
                     listaMascotas.add(reptil);  
                }
                
                listaMascotas.add(mascota);
                
            }
            // si la mascota existe
            
            //SI EXISTE NO LA AÑADO
            else{
                
                 mensaje="Tu mascota ya existe";
                
            }
            
            
            
           /* else{
            
                //guardo la mascota existente en una variable mascotaTmp
                Mascota mascotaTmp = listaMascotas.get(index);
                
                //controlo que tipo de mascota añado
               
                if (tipoMascota.equals("ave")) { 
                     //añado la mascota a esta categoria
                    mascotaTmp.addMascota(ave);
                }
                
                if (tipoMascota.equals("mamifero")) {
                     
                    mascotaTmp.addMascota(mamifero);
                }
                
                if (tipoMascota.equals("reptil")) { 
                     //añado la mascota a esta categoria
                    mascotaTmp.addMascota(reptil);
                }
                
                if (tipoMascota.equals("pez")) {
                     
                    mascotaTmp.addMascota(pez);
                }
                
                //vuelvo a guardar la mascota con la mascota añadida en la lista listaMascotas
                //mascota.set(index, mascotaTmp) es un metodo que guarda el objeto mascotaTmp en la posicion
                //index de la listaMascotas
                listaMascotas.set(index, mascotaTmp);
            }*/
            
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet nuevaMascota</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Listado de mascotas por categorias</h1>");
            
            out.println(mensaje+"<br/>);
            //imprimo el contenido de la lista categoriasList en el HTML
                for (int i = 0; i < listaMascotas.size(); i++) {
                    Mascota mascotaTmp = listaMascotas.get(i);
                    out.println(mascotaTmp.toString() + "<br>");
                }
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
        }
        else {
            //instrución para volver a una index.jsp
            request.getRequestDispatcher("/index.jsp").forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    private int getChip(String chip) {
    
       int encontrado=-1;
       
      //HAY QUE DEFINIR LA BUSQUEDA
       
       return encontrado;
    
    }

}//cierra el documento
