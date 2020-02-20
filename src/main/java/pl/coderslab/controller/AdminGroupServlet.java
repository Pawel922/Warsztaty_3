package pl.coderslab.controller;

import pl.coderslab.dao.GroupDao;
import pl.coderslab.model.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/admin/groups")
public class AdminGroupServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GroupDao groupDao = new GroupDao();
        Group[] groups = groupDao.findAll();
        request.setAttribute("groups", groups);
        getServletContext().getRequestDispatcher("/WEB-INF/admin-groups.jsp").forward(request, response);
    }
}
