package util;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.oreilly.servlet.MultipartRequest;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author mtech
 */
public class UploadServlet extends HttpServlet {

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
           
           MultipartRequest m=new MultipartRequest(request,"/home/mtech/UploadedfFiles");
     
          out.print("file uploaded");
         Enumeration files = m.getFileNames();
                String filename[]=new String[2];
              int i=0; 
    while (files.hasMoreElements()) {
        String name = (String) files.nextElement();
        filename[i]= m.getFilesystemName(name);
      i++;
    }
     
    /*HttpSession ses=request.getSession();
          
            ses.setAttribute("file1", "C:\\Users\\admin\\Desktop\\new\\"+filename[0]);
            ses.setAttribute("file2", "C:\\Users\\admin\\Desktop\\new\\"+filename[1]);
      */      
            
            out.print("<html>");
           
            out.print("<body>");
            out.print("<p>"+filename[0]+"</p>");
           // out.print("<p>"+filename[1]+"</p>");
      
       out.print("<a href='cityjsp.jsp'>Check</a>");
       
       out.println("</body>");
            out.println("</html>");
     
           
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
// HSSFSheet sheet = workbook.getSheetAt(0);