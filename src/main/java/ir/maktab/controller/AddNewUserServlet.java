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

@Controller
@WebServlet(name = "addNewUserServlet", value = "/add-new-user-servlet")
@RequiredArgsConstructor
public class AddNewUserServlet extends HttpServlet {

    UserService userService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Person person = Person.builder()
                .username(req.getParameter("userName"))
                .age(Integer.parseInt(req.getParameter("age")))
                .firstName(req.getParameter("firstName"))
                .lastName(req.getParameter("lastName"))
                .country(req.getParameter("country"))
                .build();
        userService.addNewUser(person);
        req.setAttribute("person", person);
        req.getRequestDispatcher("SignIn.jsp").forward(req, resp);
    }

    public void destroy() {
    }
}
