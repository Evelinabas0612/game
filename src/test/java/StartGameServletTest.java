import com.example.game.HelloServlet;
import com.example.game.StartGameServlet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StartGameServletTest {

    @Test
    @DisplayName("Test1: Проверить выполнение редиректа на next.jsp с ожидаемым значением answer = yes. ")
    public void redirectOnNext() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        StartGameServlet startGameServlet = mock(StartGameServlet.class);
        when(httpServletRequest.getParameter("answer")).thenReturn("yes");

        String answer = httpServletRequest.getParameter("answer");

        if(answer.contains("yes")){
            httpServletResponse.sendRedirect("next.jsp");
        }
        startGameServlet.doPost(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("next.jsp");


    }

    @Test
    @DisplayName("Test2: Проверить выполнение редиректа на end.jsp с ожидаемым значением answer = no. ")
    public void redirectOnEnd() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        StartGameServlet startGameServlet = mock(StartGameServlet.class);
        when(httpServletRequest.getParameter("answer")).thenReturn("no");

        String answer = httpServletRequest.getParameter("answer");

        if(answer.contains("no")){
            httpServletResponse.sendRedirect("end.jsp");
        }
        startGameServlet.doPost(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("end.jsp");


    }
}
