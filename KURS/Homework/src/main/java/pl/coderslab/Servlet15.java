package pl.coderslab;

import org.apache.commons.lang3.ArrayUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html; charset=utf-8");

        Random rand = new Random();
        int number = 0;
        int[] tab = new int[10];
        int[] sortedTab = new int[10];
        int[] tabOrg = new int[10];

        for (int i = 0; i <10 ; i++) {
            number = rand.nextInt(100)+1;
            tab[i]=number;
        }
        tabOrg = Arrays.copyOf(tab,10);
        request.setAttribute("tab", tabOrg);
        sortedTab = Arrays.copyOf(tab, 10);
        Arrays.sort(sortedTab);
        request.setAttribute("sortedTab", sortedTab);

        getServletContext().getRequestDispatcher("/jsp15.jsp").forward(request, response);
    }
}
