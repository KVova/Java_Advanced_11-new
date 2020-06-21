package servlet;

import java.io.IOException;
<<<<<<< HEAD
<<<<<<< HEAD

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import domain.UserRole;
import service.UserService;
import service.impl.UserServiceImpl;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private UserService userService = UserServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Integer age = null;
		if(!request.getParameter("age").isEmpty())
			age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		String eMail = request.getParameter("eMail");
		String password = request.getParameter("password");
		String role = UserRole.USER.toString();

		if (!firstName.isEmpty() && !lastName.isEmpty() && !eMail.isEmpty() && !password.isEmpty() && !role.isEmpty() && age != null) {
			userService.create(new User(firstName, lastName, address, eMail, password));
			request.setAttribute("firstName", firstName);
			request.setAttribute("lastName", lastName);
			request.getRequestDispatcher("cabinet.jsp").forward(request, response);
			
			response.setContentType("text/plain");
			response.setCharacterEncoding("UTF-8");
			response.getWriter().write("You are registered!");
		}
		else
			request.getRequestDispatcher("registration.jsp").forward(request, response);
	}
}
=======
=======
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.User;
import service.UserService;
import serviceImpl.UserServiceImpl;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserService userservice = UserServiceImpl.getUserService();

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		Integer age = null;
		if(!request.getParameter("age").isEmpty())
			age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		String eMail = request.getParameter("eMail");
		String password = request.getParameter("password");
		String role = request.getParameter("role");

		if (!firstName.isEmpty() && !lastName.isEmpty() && !eMail.isEmpty() && !password.isEmpty() && !role.isEmpty() && age != null) {
			userservice.create(new User(firstName, lastName, age, address, eMail, password, role));
			request.setAttribute("firstName", firstName);
			request.setAttribute("lastName", lastName);
			request.getRequestDispatcher("cabinet.jsp").forward(request, response);
		}
		else
			request.getRequestDispatcher("registration.jsp").forward(request, response);
	}

<<<<<<< HEAD
}
>>>>>>> branch 'project-1-jsp-servlets-jdbc' of https://github.com/KVova/Java_Advanced_11-new.git
=======
}
>>>>>>> e708fbc78046e666d9fca27a5ab4199925875ce8
