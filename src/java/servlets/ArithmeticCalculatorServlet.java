package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Densa
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String result = "--";
        request.setAttribute("result", result);
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        return;
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Retrieve parameters
        String first = request.getParameter("first");
        String second = request.getParameter("second");
        String operation = request.getParameter("operation");

        // set attributes
        request.setAttribute("first", first);
        request.setAttribute("second", second);

        // validation - Validates inputs and returns to JSP
        if (first == null || first.equals("") || second == null || second.equals("") || !first.matches("[0-9]+") || !second.matches("[0-9]+")){
            request.setAttribute("result", "Invalid");
        }
        else {
            int firstINT = Integer.parseInt(first);
            int secondINT = Integer.parseInt(second);
            int result = 0;
            switch (operation) {
                case "+":
                    result = firstINT + secondINT;
                    break;
                case "-":
                    result = firstINT - secondINT;
                    break;
                case "*":
                    result = firstINT * secondINT;
                    break;
                case "%":
                    result = firstINT % secondINT;
                    break;
            }
            request.setAttribute("result", result);   
            }
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
        }
    }

