package pl.coderslab.controller;

import pl.coderslab.dao.GroupDao;
import pl.coderslab.model.Group;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(value = "/admin/groups/edit")
public class EditGroupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        GroupDao groupDao = new GroupDao();
        String name = request.getParameter("name");
        Group group = groupDao.read((int) session.getAttribute("groupId"));
        group.setName(name);
        groupDao.update(group);
        session.removeAttribute("groupId");
        response.sendRedirect("/admin/groups");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        GroupDao groupDao = new GroupDao();
        int groupId = Integer.parseInt(request.getParameter("id"));
        Group group = groupDao.read(groupId);
        session.setAttribute("groupId", group.getId());
        request.setAttribute("group", group);
        getServletContext().getRequestDispatcher("/WEB-INF/group-edit.jsp").forward(request, response);
    }
}
