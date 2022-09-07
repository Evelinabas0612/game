package com.example.game;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "StartGameServlet", value = "/start")
public class StartGameServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String answer = request.getParameter("answer");
        response.setContentType("text/html");
        if(answer.contains("yes")){
            response.sendRedirect("next.jsp");
        }
        if(answer.contains("no")){
            response.sendRedirect("end.jsp");
        }
    }
}
