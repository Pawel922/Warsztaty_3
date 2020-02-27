package pl.coderslab.controller;

import pl.coderslab.dao.ExerciseDao;
import pl.coderslab.dao.SolutionDao;
import pl.coderslab.dao.UserDao;
import pl.coderslab.model.Exercise;
import pl.coderslab.model.Solution;
import pl.coderslab.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(value = "")
public class IndexServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SolutionDao solutionDao = new SolutionDao();
        ExerciseDao exerciseDao = new ExerciseDao();
        UserDao userDao = new UserDao();
        String numberSolutions = getServletContext().getInitParameter("number-solutions");
        Solution[] solutions = solutionDao.findRecent(Integer.parseInt(numberSolutions));
        Exercise[] exercises = exerciseDao.findAll();
        User[] users = userDao.findAll();
        for(Solution solution : solutions){
            for(Exercise exercise : exercises){
                if(solution.getExerciseId() == exercise.getId()){
                    solution.setExerciseTitle(exercise.getTitle());
                }
            }
        }
//        List<String> nameList = new LinkedList<String>();
//        for(Solution solution : solutions){
//            User user = userDao.read(solution.getUserId());
//            nameList.add(user.getUserName());
//        }
        request.setAttribute("solutions", solutions);
        request.setAttribute("users", users);
        request.getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
    }
}
