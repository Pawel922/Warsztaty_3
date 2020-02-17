package pl.coderslab.controller;

import pl.coderslab.dao.SolutionDao;
import pl.coderslab.model.Solution;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/solution/details")
public class SolutionDetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int solutionId = Integer.parseInt(request.getParameter("id"));
        SolutionDao solutionDao = new SolutionDao();
        Solution solution = solutionDao.read(solutionId);
        request.setAttribute("solution", solution);
        getServletContext().getRequestDispatcher("/WEB-INF/solution-details.jsp").forward(request, response);
    }
}
