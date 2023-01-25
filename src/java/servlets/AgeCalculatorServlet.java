package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Densa
 */
@WebServlet(name = "AgeCalculatorServlet", urlPatterns = {"/age"})
public class AgeCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // retrieve parameters
        String age = request.getParameter("age");
        
        //set attributes from request
        request.setAttribute("age", age);
        
        // validation - Validates inputs and returns to JSP
        if ((age == null) || age.equals("")) {
                request.setAttribute("message", "You must give your current age");
            } 
        else if (!age.matches("[0-9]+")) {
            request.setAttribute("message", "You must enter only numbers");
        }
        else {
            int ageInt = Integer.parseInt(age);
            request.setAttribute("message", "Your age next birthday will be " + (ageInt + 1));
        }
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
    }
}
