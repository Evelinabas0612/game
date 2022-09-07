package com.example.game;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

@WebServlet(name = "NextServlet", value = "/next")
public class NextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String [] answers = request.getParameterValues("answer");
        response.setContentType("text/html");
        if(Arrays.stream(answers).noneMatch(s -> s.equals("no"))){
            response.sendRedirect("winner.jsp");
        }
        else {
            response.sendRedirect("end.jsp");
        }
    }
}
