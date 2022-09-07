package com.example.game;

import com.example.game.entities.Result;
import com.example.game.entities.User;

import java.io.*;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    HttpSession httpSession = request.getSession();
    response.setCharacterEncoding("UTF-8");
    response.setContentType("text/html");
    Integer count = (Integer) httpSession.getAttribute("count");
    if(count == null){
            count = 1;
        }
        else {
            count ++;
        }

    String ip = request.getHeader("X-FORWARDED-FOR");
    if(ip == null){
        ip = request.getRemoteAddr();
    }
    String firstname = request.getParameter("firstname");
    if(firstname.isEmpty()){
        response.sendRedirect("index.jsp");
    }
    else{
        if(Result.resultList.stream().noneMatch(s -> s.equals(firstname))){
        User user = new User(firstname, count, ip);
        Result.resultList.add(user);
        }

        }

        httpSession.setAttribute("ip", ip);
        httpSession.setAttribute("firstname", firstname);
        httpSession.setAttribute("count", count);
        httpSession.setAttribute("games", Result.resultList.size());

        //request.setAttribute("ip", ip);
        //request.setAttribute("firstname", firstname);
        //request.setAttribute("count", count);
        //request.setAttribute("games",  Result.resultList.size());

        response.sendRedirect("start.jsp");
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}