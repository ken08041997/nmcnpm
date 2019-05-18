package thang.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thang.model.User;
import thang.model.UserTemp;
import thang.userDAO.userDAO;

/**
 * Servlet implementation class ConfirmReg
 */
@WebServlet("/confirm")
public class ConfirmReg extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfirmReg() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String number = request.getParameter("number");
		if (number ==null) {
			String url="/WEB-INF/jsp/confirmreg.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request,response);
		} else {
			String email = request.getParameter("email");System.out.println(email);
			for (UserTemp user : userDAO.getListTemp()) {
				if (email.equals(user.getEmail())) {
					if (number.equals(user.getCode())) {
						userDAO.getListUser().add(new User(user.getFname(),user.getLname(),user.getEmail(),user.getNumber(),user.getPassword()));
						userDAO.getListTemp().remove(user);System.out.println(userDAO.getListUser());
						String url="/WEB-INF/jsp/success.jsp";
						RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
						dispatcher.forward(request,response);
						break;
					}
					
				}
			}
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
