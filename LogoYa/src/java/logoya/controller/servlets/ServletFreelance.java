/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logoya.controller.servlets;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logoya.beans.freelance;
import logoya.controller.DAO.DAOFreenlance;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author sebas
 */
public class ServletFreelance extends HttpServlet {
    
     private final String UPLOAD_DIRECTORY = "D:/";

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
            String priceLogo;
            String priceBanner;
            String priceFlayer;
            String priceCard;
            DAOFreenlance dao;
            freelance f;
            
            validation = request.getParameter("validation");
            name = request.getParameter("name");
            email = request.getParameter("email");
            cell_phone = request.getParameter("cell_phone");
            password = request.getParameter("password");
            priceLogo = request.getParameter("priceLogo");
            priceBanner = request.getParameter("priceBanner");
            priceFlayer = request.getParameter("priceFlayer");
            priceCard = request.getParameter("priceCard");
            
            
              if(ServletFileUpload.isMultipartContent(request)){
            try {
                List<FileItem> multiparts = new ServletFileUpload(
                                         new DiskFileItemFactory()).parseRequest(request);
              
                for(FileItem item : multiparts){
                    if(!item.isFormField()){
                        String nameArchive = new File(item.getName()).getName();
                        item.write( new File(UPLOAD_DIRECTORY + File.separator + nameArchive));
                    }
                }
           
               //File uploaded successfully
               request.setAttribute("message", "File Uploaded Successfully");
            } catch (Exception ex) {
               request.setAttribute("message", "File Upload Failed due to " + ex);
            }          
         
        }
    
       



            dao = new DAOFreenlance();
           System.out.println(validation + " "
                   + name + " "+ email + " "
                   + cell_phone +" "
                   + password +" "
                    + priceLogo + " "
                    + priceBanner+ " "
                    + priceFlayer +" "
                    + priceCard);
            
            switch (validation) {
                case "insertFrelance":
                   int flag;
                   f = new freelance();
                   f.setName(name);
                   f.setEmail(email);
                   f.setCell_phone(cell_phone);
                   f.setPassword(password);
                   f.setPriceBanner(Double.parseDouble(priceBanner));
                   f.setPriceCard(Double.parseDouble(priceCard));
                   f.setPriceFlayer(Double.parseDouble(priceFlayer));
                   f.setPriceLogo(Double.parseDouble(priceLogo));
                   
                   // System.out.println();
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
