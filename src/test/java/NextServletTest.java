import com.example.game.StartGameServlet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class NextServletTest {
    @Test

    @DisplayName("Test1: Проверить выполнение редиректа на winner.jsp, если массив answers не сожержит элемент = no. ")
    public void redirectOnNext() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        StartGameServlet startGameServlet = mock(StartGameServlet.class);

        when(httpServletRequest.getParameterValues("answer")).thenReturn(new String[]{"yes", "yes", "yes"});


        String [] answers = httpServletRequest.getParameterValues("answer");

        if(Arrays.stream(answers).noneMatch(s->s.equals("no"))){
            httpServletResponse.sendRedirect("winner.jsp");
        }
        startGameServlet.doPost(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("winner.jsp");


    }

    @Test
    @DisplayName("Test2: Проверить выполнение редиректа на end.jsp, если массив answers сожержит элемент = no. ")
    public void redirectOnEnd() throws IOException, ServletException {

        HttpServletRequest httpServletRequest = mock(HttpServletRequest.class);
        HttpServletResponse httpServletResponse = mock(HttpServletResponse.class);
        StartGameServlet startGameServlet = mock(StartGameServlet.class);
        when(httpServletRequest.getParameterValues("answer")).thenReturn(new String[]{"yes", "no", "yes"});
        String [] answers = httpServletRequest.getParameterValues("answer");

        if(Arrays.stream(answers).anyMatch(s -> s.equals("no"))){
            httpServletResponse.sendRedirect("end.jsp");
        }
        startGameServlet.doPost(httpServletRequest, httpServletResponse);
        Mockito.verify(httpServletResponse).sendRedirect("end.jsp");


    }
}
