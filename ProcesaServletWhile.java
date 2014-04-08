package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ProcesaServletWhile extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String numero = request.getParameter("numero");
        
        int numeroInt;
        int sumaPares = 0, sumaImpares = 0;
        int index = 1;

        if (numero != null && !numero.equals("")) {

            numeroInt = Integer.parseInt(numero);

            while (index <= numeroInt) {
                if (index % 2 ==0)
                    sumaPares = sumaPares + index;
                else 
                    sumaImpares = sumaImpares + index;
                index++;
                
            }

            try {
                /* TODO output your page here. You may use following sample code. */
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Práctica 15 - While</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Servlet Práctica 15 - While </h1>");
                out.println("<h2>Resultado</h2>");
                
                out.println("<p>La suma de los numeros pares desde 1 hasta "+numeroInt+" es:" + sumaPares + "</p>");
                out.println("<p>La suma de los numeros impares desde 1 hasta "+numeroInt+" es:" + sumaImpares + "</p>");
                
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
