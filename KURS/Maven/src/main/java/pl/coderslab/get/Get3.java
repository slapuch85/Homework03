package pl.coderslab.get;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Get3")
public class Get3 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int widthNumber = 5;
        int heightNumber = 10;

        String width = request.getParameter("width");
        String height = request.getParameter("height");

        try {
            if (StringUtils.isNotBlank(width) && StringUtils.isNotBlank(height)){
                widthNumber = Integer.parseInt(width);
                heightNumber = Integer.parseInt(height);
            }
        } catch (NumberFormatException e) {
            response.getWriter().append("W parametrach start i end wymagane są wartości liczbowe");
        }

        for (int i = 0; i <= widthNumber; i++) {
            for (int j = 0; j <= heightNumber; j++) {
                response.getWriter().append(String.valueOf(i))
                        .append(" * ")
                        .append(String.valueOf(j))
                        .append(" = ")
                        .append(String.valueOf(i*j))
                        .append("br");
            }
        }
    }
}
