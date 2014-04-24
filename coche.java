/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import beans.Categoria;
import beans.Coche;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ma Jesús
 */
public class coche extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
        Categoria categoria1 = new Categoria("Berlina","Un coche de empresa");
        Categoria categoria2 = new Categoria("Familiar","Un coche para la familia");
        Categoria categoria3 = new Categoria("Deportivo","Un coche para presumir");
        
        Coche coche1 = new Coche("AX 572 PH", "rojo", "BMW", 240);
        Coche coche2 = new Coche("AB 542 PD", "verde", "Seat", 120);
        Coche coche3 = new Coche("AP 582 PF", "Amarillo", "Fiat", 100);
        categoria1.addCoche(coche1);
        categoria1.addCoche(coche2);
        categoria1.addCoche(coche3);
        
        Coche coche4 = new Coche("AX 512 PS", "azul", "Audi", 200);
        Coche coche5 = new Coche("AX 513 PS", "turquesa", "Mercedes", 250);
        Coche coche6 = new Coche("AB 514 PD", "blanco", "Seat", 120);
        categoria2.addCoche(coche4);
        categoria2.addCoche(coche5);
        categoria2.addCoche(coche6);
        
        Coche coche7 = new Coche("AP 515 PF", "negro", "Fiat", 100);
        Coche coche8 = new Coche("AX 516 PS", "plata", "Audi", 200);
        Coche coche9 = new Coche("AX 517 PS", "burdeos", "Mercedes", 250);
        categoria3.addCoche(coche7);
        categoria3.addCoche(coche8);
        categoria3.addCoche(coche9);
        
        ArrayList<Categoria> categorias = new ArrayList<Categoria>();
        
        categorias.add(categoria3);
        categorias.add(categoria2);
        categorias.add(categoria1);
           
        
                
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet coche</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet coche at " + request.getContextPath() + "</h1>");
            
            for (int i=0;i<categorias.size();i++){
            Categoria categoria = categorias.get(i);
            out.println("<p>"+categoria.toString()+"</p>");
            }
               
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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

    
}
