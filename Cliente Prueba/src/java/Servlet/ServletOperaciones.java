/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;

/**
 *
 * @author Luis
 */
@WebServlet(name = "ServletOperaciones", urlPatterns = {"/ServletOperaciones"})
public class ServletOperaciones extends HttpServlet {
 @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_21298/WebService/WSOperaciones.wsdl")
    private WSOperaciones_Service service;
    
    
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
     
        String operaciones= request.getParameter("operaciones");
        
        double numero1=Double.parseDouble(request.getParameter("numero1"));
        double numero2= Double.parseDouble(request.getParameter("numero2"));
        
       String valor="";
        
        
        if(operaciones.equalsIgnoreCase("SUMA")){
            
            double resultado=suma(numero1,numero2);
            valor=""+resultado;
        }
        
         HttpSession ses= request.getSession(true);      
       
        ses.setAttribute("lista", valor);
        
       String pag = "/solucion.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(pag);
        rd.forward(request, response);
        
      
    
        
        
        
        
        
        
        
        
        
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

    
    private double suma(double numero1, double numero2){
        
        Servlet.WSOperaciones port=service.getWSOperacionesPort();
        
        return port.suma(numero1, numero2);
        
    }

    }
    

