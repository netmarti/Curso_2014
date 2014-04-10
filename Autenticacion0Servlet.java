/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fjsp.seguridad;

import fjsp.modelo.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dan
 */
@WebServlet(name = "AutenticacionServlet", urlPatterns = {"/autenticacionServlet"})
public class AutenticacionServlet extends HttpServlet {

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
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        RequestDispatcher dispacher;
        try {
            
            String userName = request.getParameter("txtUserName");
            String userPass = request.getParameter("txtUserPas");
            String strError = "";
            
            if (userName != null && !userName.equals("") && userPass != null && !userPass.equals("") ) {
            System.out.println("Están todos los datos");
            Usuario userObj = new Usuario();
            userObj.setUsername(userName);
            userObj.setPassword(userPass);
            boolean esValido = SeguridadDAO.esUsuarioValido(userObj);
            if (esValido){
                dispacher = getServletContext().getRequestDispatcher("/index.jsp");
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("autUsuario", userObj);
                dispacher.forward(request, response);
            
            
            }else{
                strError = "Usuario y pasword incorrecto";
                dispacher = getServletContext().getRequestDispatcher("/index.jsp");
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("autError", strError);
                dispacher.forward(request, response);
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("autUsuario", userObj);
                dispacher.forward(request, response);
                
                
                System.out.println("Hubo un error");
                
            }//cierra el else
            
            
            }//cierra el if
            else{
                strError = "No se especificaron los datos completos del usuario";
                dispacher = getServletContext().getRequestDispatcher("/seguridad/principal.jsp");
                HttpSession sesion = request.getSession(true);
                sesion.setAttribute("autError", strError);
                dispacher.forward(request, response);
                HttpSession sesion = request.getSession(true);
                sesion.setAtribute("autUsuario", userObj);
                dispacher.forward(request, response);
                
                
                System.out.println("Hubo un error");
                
            }//cierra el else
            
        } finally {
            
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
