package pl.coderslab.controller;

import pl.coderslab.dao.ExerciseDao;
import pl.coderslab.dao.SolutionDao;
import pl.coderslab.model.Exercise;
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
        ExerciseDao exerciseDao = new ExerciseDao();
        Solution solution = solutionDao.read(solutionId);
        Exercise exercise = exerciseDao.read(solution.getExerciseId());
        request.setAttribute("solution", solution);
        request.setAttribute("exercise", exercise);
        getServletContext().getRequestDispatcher("/WEB-INF/solution-details.jsp").forward(request, response);
    }
}
