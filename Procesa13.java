package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Daniel
 */
@WebServlet(name = "procesa", urlPatterns = {"/procesa"})
public class procesa extends HttpServlet {

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
        
        String nota = request.getParameter("nota");
        String mensaje = "";
        int notaInt;
        
        if (nota != null && !nota.equals("")){
            
            notaInt = Integer.parseInt(nota);
        
            if (notaInt == 10){
            mensaje = "Felicidades, Matrícula de Honor";
            }
            else if (notaInt == 9){
            mensaje = "Felicidades, Sobresaliente";
            }
            
            else if (notaInt < 9 && notaInt>=7){
            mensaje = "Felicidades, tu nota es Notable";
            }
            
            else if (notaInt ==6){
            mensaje = "Felicidades, tu nota es un Bien";
            }
            
            else if (notaInt ==6){
            mensaje = "Felicidades, tu nota es un Bien";
            }
            
            else if (notaInt ==5){
            mensaje = "Felicidades, tu nota es un aprobado";
            }
            
            else {
            mensaje = "No te desanimes. Habla con tu profesor, necesitas ayuda.";
            }
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Práctica 13 -If-elseif</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Práctica 13</h1>");
            out.println("<h2>Calificaciones</h2>");
            out.println("<p> "+mensaje+"</p>");
            out.println("<a href=\"index.jsp\"><button>Volver</button></a>");
            out.println("</body>");
            out.println("</html>");
            } finally 
            {
            out.close();
             }
            }else{
            getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
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
