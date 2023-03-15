package ir.maktab.controller;

import ir.maktab.model.Person;
import ir.maktab.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "addNewUserServlet", value = "/add-new-user-servlet")
public class AddNewUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UserService userService = new UserService();
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("userName");
        String country = req.getParameter("country");
        int age = Integer.parseInt(req.getParameter("age"));
        Person person = new Person(firstName, lastName, age, country, userName);
        userService.addNewUser(person);
        req.setAttribute("person", person);
        req.getRequestDispatcher("SignIn.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}
