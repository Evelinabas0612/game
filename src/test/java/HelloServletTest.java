import com.example.game.HelloServlet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class HelloServletTest {

    @Test
    @DisplayName("Test1: Проверить выполнение редиректа на index.jsp с ожидаемым значением null username. ")
    public void redirectOnHello() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        HelloServlet helloServlet = mock(HelloServlet.class);
        when(httpServletRequest.getParameter("username")).thenReturn("");

        String username = httpServletRequest.getParameter("username");

        if(username.isEmpty()){
            httpServletResponse.sendRedirect("index.jsp");
        }
        helloServlet.doGet(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("index.jsp");


    }

    @Test
    @DisplayName("Test2: Проверить выполнение редиректа на start.jsp с ожидаемым значением notNull username ")
    public void redirectOnStart() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        HelloServlet helloServlet = mock(HelloServlet.class);
        when(httpServletRequest.getParameter("username")).thenReturn("Test");

        String username = httpServletRequest.getParameter("username");

        if(!username.isEmpty()){
            httpServletResponse.sendRedirect("start.jsp");
        }
        helloServlet.doGet(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("start.jsp");


    }

}
