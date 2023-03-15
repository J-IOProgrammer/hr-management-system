package ir.maktab.controller;

import ir.maktab.data.model.Person;
import ir.maktab.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SignInServlet", value = "/sign-in-servlet")
public class SignInServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UserService userService = new UserService();
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        Person person = userService.login(userName, password);
        if (person != null) {
            req.setAttribute("person", person);
            req.getRequestDispatcher("Profile.jsp").forward(req, resp);
        } else {
            PrintWriter printWriter = resp.getWriter();
            printWriter.println("Username or password is wrong !");
            req.getRequestDispatcher("SignIn.jsp").include(req, resp);
        }
    }

    public void destroy() {
    }
}
