/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dao.BaseDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Product;
import repository.ProductRepositoty;
import util.DataProvider;
import util.Settings;

/**
 *
 * @author TuanVu1
 */
@WebServlet("/ajaxcheckemail")
public class ApiCheckExistsEmail extends HttpServlet {
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            response.setContentType("application/json");
            PrintWriter out = response.getWriter();
            String email = request.getParameter("email");
            out.println(BaseDAO.checkEmailIsExists(email));
        } catch (SQLException ex) {
            Logger.getLogger(ApiCheckExistsEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
