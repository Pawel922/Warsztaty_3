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
import java.io.IOException;

@WebServlet(value = "/admin/users")
public class AdminUsersServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        GroupDao groupDao = new GroupDao();
        User[] users = userDao.findAll();
        Group[] groups = groupDao.findAll();
        for (User user : users){
            for(Group group : groups){
                if(user.getUserGroupId() == group.getId()){
                    user.setGroupName(group.getName());
                }
            }
        }
        request.setAttribute("users", users);
        getServletContext().getRequestDispatcher("/WEB-INF/admin-users.jsp").forward(request, response);
    }
}
