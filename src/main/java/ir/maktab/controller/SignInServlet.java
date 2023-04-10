package ir.maktab.controller;

import ir.maktab.data.model.Person;
import ir.maktab.service.UserService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.io.PrintWriter;

@Controller
@WebServlet(name = "SignInServlet", value = "/sign-in-servlet")
@RequiredArgsConstructor
public class SignInServlet extends HttpServlet {

    UserService userService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
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
