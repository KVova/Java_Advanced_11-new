package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import domain.User;
import dto.UserLogin;
import service.UserService;
import service.impl.UserServiceImpl;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eMail = request.getParameter("eMail");
		String password = request.getParameter("password");
		User user = userService.getUserByEmail(eMail);

		if(user == null || !user.getPassword().equals(password))
			request.getRequestDispatcher("index.jsp").forward(request, response);
		else {
			request.setAttribute("firstName", user.getFirstName());
			request.setAttribute("lastName", user.getLastName());
			request.getRequestDispatcher("cabinet.jsp").forward(request, response);
			
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("You are logged in!");
		}
	}

}
