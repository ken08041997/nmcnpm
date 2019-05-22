package thang.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thang.model.User;
import thang.userDAO.userDAO;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		for (User user	: userDAO.getListUser()) {
			if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
				request.setAttribute("info1", user.getFname());
				request.setAttribute("info2", user.getEmail());
				String url="/WEB-INF/jsp/success.jsp";
				RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
				dispatcher.forward(request,response);
				break;}
		}
	}

}
