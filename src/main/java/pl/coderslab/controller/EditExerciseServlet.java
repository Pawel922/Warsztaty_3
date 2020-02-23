package pl.coderslab.controller;


import pl.coderslab.dao.ExerciseDao;
import pl.coderslab.dao.GroupDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.model.Exercise;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/admin/exercises/edit")
public class EditExerciseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ExerciseDao exerciseDao = new ExerciseDao();
        String title = request.getParameter("title");
        String description = request.getParameter("description");
        Exercise exercise = exerciseDao.read((int) session.getAttribute("exerciseId"));
        exercise.setTitle(title);
        exercise.setDescription(description);
        exerciseDao.update(exercise);
        session.removeAttribute("exerciseId");
        response.sendRedirect("/admin/exercises");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        ExerciseDao exerciseDao = new ExerciseDao();
        int exerciseId = Integer.parseInt(request.getParameter("id"));
        Exercise exercise = exerciseDao.read(exerciseId);
        session.setAttribute("exerciseId", exerciseId);
        request.setAttribute("exercise", exercise);
        getServletContext().getRequestDispatcher("/WEB-INF/exercise-edit.jsp").forward(request, response);
    }
}
