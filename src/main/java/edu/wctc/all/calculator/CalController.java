/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.all.calculator;

import edu.wctc.all.model.CircleModel;
import edu.wctc.all.model.RectangleModel;
import edu.wctc.all.model.TriangleModel;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alancerio18
 */
@WebServlet(name = "CalController", urlPatterns = {"/CalControl"})
public class CalController extends HttpServlet {

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

        String length = request.getParameter("length");
        String width = request.getParameter("width");

        RectangleModel recModel = new RectangleModel();
        String message = recModel.getCalculatedArea(length, width);

        request.setAttribute("message", message);

        CircleModel cirModel = new CircleModel();
        String radius = request.getParameter("radius");
        String CirMsg = cirModel.CalculateRadius(radius);
        request.setAttribute("CirMsg", CirMsg);

        TriangleModel triModel = new TriangleModel();
        String opposite = request.getParameter("opposite");
        String adjacent = request.getParameter("adjacent");

        String TriMsg = triModel.CalculateHypotenuse("hypotenuse");

        request.setAttribute("opposite", opposite);
        request.setAttribute("adjacent", adjacent);

        RequestDispatcher view
                = request.getRequestDispatcher("/CalResults.jsp");
        view.forward(request, response);
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
