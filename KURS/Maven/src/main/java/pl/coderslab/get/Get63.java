package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/Get63")
public class Get63 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");
        String year = request.getParameter("year");
        String mix= request.getParameter("mix");
        int yearNum = Integer.parseInt(year);
        int mixNum = Integer.parseInt(mix);

        String textHtml = "<h3>Rok to " + (yearNum + mixNum)+"</h3>";
        response.getWriter().append(textHtml);
    }
}
