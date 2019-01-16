package pl.coderslab;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@WebServlet("/Servlet13")
public class Servlet13 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<String> oop = new ArrayList<>();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("oop.txt").getFile());

        Scanner scan = new Scanner(file);
        while (scan.hasNextLine()){
            oop.add(scan.nextLine());
        }

        request.setAttribute("oop", oop);

        getServletContext().getRequestDispatcher("/jsp13.jsp").forward(request, response);
    }
}

