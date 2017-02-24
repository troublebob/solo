package charitywebsite.controller;

import java.io.IOException;

import javax.persistence.RollbackException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import charitywebsite.dao.UserDAO;
import model.User;

/**
 * Servlet implementation class RegisterUserController
 */
public class RegisterUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private User user;
	private UserDAO userDAO;
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegisterUserController() {
		super();
		this.user = new User();
		this.userDAO = new UserDAO();
	}

	public RegisterUserController(User user,UserDAO userDAO){
		this.user = user;
		this.userDAO = userDAO;
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("errormessage");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String confirmpassword = request.getParameter("passwordcon");

		if(password.equals(confirmpassword)){

			user = new User(email,password);
			userDAO = new UserDAO();
			try{
				userDAO.save(user);
			}catch (RollbackException e) {
				request.setAttribute("errormessage", "Sorry Technical Difficulties Please try again later");
				request.getRequestDispatcher("./newuser.jsp").forward(request, response);				
			}
			userDAO.close();
			HttpSession session = request.getSession();
			session.setAttribute("username", email);
			request.setAttribute("signupcomplete", "Welcome " + email);
			request.getRequestDispatcher("./index.jsp").forward(request, response);

		}else{
			request.setAttribute("errormessage", "The Passwords do not match try again!");
			request.getRequestDispatcher("./newuser.jsp").forward(request, response);
		}

	}

}