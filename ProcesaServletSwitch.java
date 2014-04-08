package controller;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author confalonieri
 */
public class ProcesaServletSwitch extends HttpServlet {

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

        if (nota != null && !nota.equals("")) {

            notaInt = Integer.parseInt(nota);

            switch (notaInt) {
                case 10:
                     mensaje = "Felicidades, Matrícula de Honor";
                    break;
                case 9:
                    mensaje = "Felicidades, Sobresaliente";
                    break;
                case 8: case 7:
                     mensaje = "Felicidades, Notable";
                    break;
                case 6:
                     mensaje = "Felicidades, Bien";
                    break;
                case 5:
                     mensaje = "Felicidades, aprobado";
                    break;
                case 4: case 3: case 2: case 1: case 0:
                     mensaje = "Pide ayuda a tu profesor para recuperar tu Suspenso";
                    break;
                     
                default:
                    mensaje = "No definido";
            }
           

            try {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Práctica 14 - Switch</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Práctica 14 - Switch </h1>");
                out.println("<h2>Resultado</h2>");
                out.println("<p>" + mensaje + "</p>");
                out.println("<h2>Volver</h2>");
                out.println("<p><a href=\"index.jsp\"h2>Volver</a></p>");
                out.println("</body>");
                out.println("</html>");
            } finally {
                out.close();
            }
        } else {

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
