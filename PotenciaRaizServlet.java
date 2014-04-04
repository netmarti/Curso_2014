package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PotenciaRaizServlet extends HttpServlet {

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

        String numero1 = request.getParameter("numero1");
        String numero2 = request.getParameter("numero2");
        int base;
        int exponente;
        int resultadoPotenciaInt, resultadoRaizInt1, resultadoRaizInt2;
        float resultadoPotenciaFloat, resultadoRaizFloat1, resultadoRaizFloat2;
        double resultadoPotenciaDouble, resultadoRaizDouble1, resultadoRaizDouble2;
        
        //controlamos que todos los parametros esten definidos
        if ((numero1 != null && !numero1.equals(""))
                && (numero2 != null && !numero2.equals(""))) {

            base = Integer.parseInt(numero1);
            exponente = Integer.parseInt(numero2);

            //calculamos la potencia
            resultadoPotenciaInt = (int) Math.pow(base, exponente);
            resultadoPotenciaFloat = (float) Math.pow(base, exponente);
            resultadoPotenciaDouble = Math.pow(base, exponente);
            
            //calculamos la raiz cuadrada
            resultadoRaizInt1 = (int) Math.sqrt(base);
            resultadoRaizInt2 = (int) Math.sqrt(base);

            resultadoRaizFloat1 = (float) Math.sqrt(base);
            resultadoRaizFloat2 = (float) Math.sqrt(exponente);

            resultadoRaizDouble1 = Math.sqrt(base);
            resultadoRaizDouble2 = Math.sqrt(exponente);

            try {

                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Practica10Servlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Práctica 10 Operaciones matemáticas Servlet</h1>");

                out.println("<h2>Datos enviados</h1>");
                out.println("<ul>");
                out.println("<li>La base es: " + base + "</li>");
                out.println("<li>El exponente es: " + exponente + "</li>");
                out.println("</ul>");

                out.println("<h2>Calculos con int</h1>");
                out.println("<ul>");
                out.println("<li>La potencia de " + base + " elevado a " + exponente + " es: " + resultadoPotenciaInt + "</li>");
                out.println("<li>La raíz cuadrada de " + base + " es: " + resultadoRaizInt1 + "</li>");
                out.println("<li>La raíz cuadrada de " + exponente + " es: " + resultadoRaizInt2 + "</li>");
                out.println("</ul>");
                
                out.println("<h2>Calculos con float</h1>");
                out.println("<ul>");
                out.println("<li>La potencia de " + base + " elevado a " + exponente + " es: " + resultadoPotenciaFloat + "</li>");
                out.println("<li>La raiz cuadrada de " + base + " es: " + resultadoRaizFloat1 + "</li>");
                out.println("<li>La raiz cuadrada de " + exponente + " es: " + resultadoRaizFloat2 + "</li>");
                out.println("</ul>");

                out.println("<h2>Calculos con double</h1>");
                out.println("<ul>");
                out.println("<li>La potencia de " + base + " elevado a " + exponente + " es: " + resultadoPotenciaDouble + "</li>");
                out.println("<li>La raíz cuadrada de " + base + " es: " + resultadoRaizDouble1 + "</li>");
                out.println("<li>La raíz cuadrada de " + exponente + " es: " + resultadoRaizDouble2 + "</li>");
                out.println("</ul>");
                
                
                out.println("<h2>Volver a enviar</h1>");
                out.println("<a href=\"index.jsp\">volver</a>");
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
