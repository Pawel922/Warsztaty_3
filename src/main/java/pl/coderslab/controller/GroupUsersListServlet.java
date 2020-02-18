package pl.coderslab.controller;

import pl.coderslab.dao.UserDao;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/group/users/list")
public class GroupUsersListServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int groupId = Integer.parseInt(request.getParameter("id"));
        UserDao userDao = new UserDao();
        User[] users = userDao.findAllByGroupId(groupId);
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/WEB-INF/group-users-list.jsp").forward(request, response);
    }
}
