package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ProcesaServletCalculadora extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        String operacion = request.getParameter("operacion");
        float mensaje;
        
        float numero1Float, numero2Float;
        char operacionChar;
        char[] operacionCharArray;
        
        if ( (numero1 != null && !numero1.equals("")) && (numero2 != null && !numero2.equals("")) && (operacion != null && !operacion.equals(""))  ) {

            numero1Float = Float.parseFloat(numero1);
            numero2Float = Float.parseFloat(numero2);
            operacionCharArray = operacion.toCharArray();
            operacionChar = operacionCharArray[0];

            switch (operacionChar) {
                case 'S':
                    mensaje = numero1Float + numero2Float;
                    break;
                case 'M':
                    mensaje = numero1Float * numero2Float;
                    break;
                case 'R':
                    mensaje = numero1Float - numero2Float;
                    break;
                case 'D':
                    mensaje = numero1Float / numero2Float;
                    break;
                
                default:
                    mensaje = 0;
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
