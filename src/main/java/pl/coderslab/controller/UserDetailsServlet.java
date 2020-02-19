package pl.coderslab.controller;

import pl.coderslab.dao.SolutionDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.model.Solution;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/user/details")
public class UserDetailsServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int userId = Integer.parseInt(request.getParameter("id"));
        UserDao userDao = new UserDao();
        SolutionDao solutionDao = new SolutionDao();
        User user = userDao.read(userId);
        Solution[] solutions = solutionDao.findAllByUserId(userId);
        request.setAttribute("user", user);
        request.setAttribute("solutions", solutions);
        getServletContext().getRequestDispatcher("/WEB-INF/user-details.jsp").forward(request, response);
    }
}
