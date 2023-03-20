/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import dao.UserDao;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.User;

/**
 *
 * @author ADMIN
 */
public class Login extends HttpServlet {

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
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Login</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Login at " + request.getContextPath() + "</h1>");
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
//       Cookie arr[] = request.getCookies();
//      for (Cookie cookie : arr) {
//          if (cookie.getName().equals("userCooki")) {
//               request.setAttribute("userName", cookie.getValue());
//           }
//            if (cookie.getName().equals("passCooki")) {
//               request.setAttribute("passWord", cookie.getValue());
//            }
//       }
        request.getRequestDispatcher("login.jsp").forward(request, response);
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
        // processRequest(request, response);
//       try {
        String user = request.getParameter("name");
        String pass = request.getParameter("pass");
        String checkbox = request.getParameter("checkbox");
        UserDao loginDAO = new UserDao();
        User a = loginDAO.checkLogin(user, pass);
        //            DataAccount acc = loginDAO.getData(user, pass);

//        if (a.getRoleid() == 2) {
//            request.setAttribute("ms1", "You have been blocked! Please contact us to know more");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//
//        }

        if (a == null) {
            request.setAttribute("mess", "wrong account");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            HttpSession session = request.getSession();
            session.setAttribute("acc", a);
            Cookie u = new Cookie("userCooki", user);
            Cookie p = new Cookie("passCooki", pass);
            u.setMaxAge(60);
            p.setMaxAge(60);
            response.addCookie(u);
            response.addCookie(p);

            response.sendRedirect("Home");
//                       Customer cus=d.checkLogin(u, p);
//        if (cus.getRoleId() == 0 ){
//            request.setAttribute("ms1", "You have been blocked! Please contact us to know more");
//            request.getRequestDispatcher("login.jsp").forward(request, response);
//        }{
//          if(cus==null){
//            //khong tim thay
//            String ms="Username or password are incorrect!!!";
//            request.setAttribute("ms", ms);
//            request.getRequestDispatcher("login.jsp").forward(request, response);

//                response.addCookie(u);//save u on chorme
//                if (checkbox != null) {
//                    p.setMaxAge(60);
//                    response.addCookie(p);
//                } else {
//                    p.setMaxAge(0);
//                }
//                request.setAttribute("data", acc.getDisplayName());
//                request.getRequestDispatcher("detail.jsp").forward(request, response);
//            }
//      } catch (Exception e) {
//           System.out.println(e);
//       }
        }
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