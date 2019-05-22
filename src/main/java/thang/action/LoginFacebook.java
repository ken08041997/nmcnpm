package thang.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.restfb.types.User;

import thang.utilities.RestFB;

/**
 * Servlet implementation class LoginFacebook
 */
@WebServlet("/login-facebook")
public class LoginFacebook extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginFacebook() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		
		String accessToken = RestFB.getToken(code);
	      User user = RestFB.getUserInfo(accessToken);
	      request.setAttribute("info1", user.getId());
	      request.setAttribute("info2", user.getName());
	      RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
	      dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

}
