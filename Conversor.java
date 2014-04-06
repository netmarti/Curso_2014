package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author dan
 */
public class convertidor extends HttpServlet {

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
        
        String celsius= request.getParameter("celsius");
        String fahrenheit= request.getParameter("fahrenheit");
        
        double resultadoCel;
        double resultadoFah;
        
        if ((celsius != null && !celsius.equals(""))
                && (fahrenheit != null && !fahrenheit.equals(""))){
            
        
        resultadoCel = ((((Float.parseFloat(fahrenheit)) -32.0) *5.0) /9.0);        
        resultadoFah = ((((Float.parseFloat(celsius)) * 9.0) /5.0) +32.0);   
        
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Conversión de grados</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Resultado</h1>");
            out.println("<p>La conversión resultante es de "+fahrenheit+
                    " Fahrenheit a Celsius es: "+resultadoCel);
            out.println("<p>La conversión resultante es de "+celsius+
                    " Celsius a Fahrenheit es: "+resultadoFah);
            
            out.println("</body>");
            out.println("</html>");
        } finally {
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
