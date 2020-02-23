package pl.coderslab.controller;

import pl.coderslab.dao.GroupDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.model.Group;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/admin/users/edit")
public class EditUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserDao userDao = new UserDao();
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        int groupId = Integer.parseInt(request.getParameter("group"));
        User user = userDao.read((int) session.getAttribute("userId"));
        user.setUserName(name);
        user.setEmail(email);
        user.setUserGroupId(groupId);
        userDao.update(user);
        session.removeAttribute("userId");
        response.sendRedirect("/admin/users");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        UserDao userDao = new UserDao();
        GroupDao groupDao = new GroupDao();
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = userDao.read(userId);
        Group[] groups = groupDao.findAll();
        session.setAttribute("userId", userId);
        request.setAttribute("user", user);
        request.setAttribute("groups", groups);
        getServletContext().getRequestDispatcher("/WEB-INF/user-edit.jsp").forward(request, response);
    }
}
