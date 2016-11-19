/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogoYa.controller.Servlet;

import LogoYa.beans.freelance;
import LogoYa.controller.DAO.DAOFreenlance;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Familia Mazo
 */
public class ServletFreelance extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
            //variables
            String validation;
            String name;
            String email;
            String cell_phone;
            String password;
            DAOFreenlance dao;
            freelance f;
            
            validation = request.getParameter("validation");
            name = request.getParameter("name");
            email = request.getParameter("email");
            cell_phone = request.getParameter("cell_phone");
            password = request.getParameter("password");
            dao = new DAOFreenlance();
            //System.out.println(validation + " "+ name + " "+ email + " "+ cell_phone +" "+ password);
            
            switch (validation) {
                case "insertFrelance":
                   int flag;
                   f = new freelance();
                   f.setName(name);
                   f.setEmail(email);
                   f.setCell_phone(cell_phone);
                   f.setPassword(password);
                   flag = dao.insertFreenlance(f);
                   
                   if(flag > 0){
                       response.setStatus(200);
                       out.println("¡Se ha guardado con éxito!");
                   }else {
                         response.sendError(500, "Ha ocurrido un error");
                    }    
                    break;
                    case "":
                        out.println("undefined");
                        break;
                default:
                    
            }
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
