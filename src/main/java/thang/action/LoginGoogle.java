package thang.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thang.model.GooglePojo;
import thang.utilities.GoogleUtils;

/**
 * Servlet implementation class LoginGoogle
 */
@WebServlet("/login-google")
public class LoginGoogle extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginGoogle() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String code = request.getParameter("code");
		String accessToken = GoogleUtils.getToken(code);
	      GooglePojo googlePojo = GoogleUtils.getUserInfo(accessToken);
	      
	      request.setAttribute("info1", googlePojo.getId());
	      request.setAttribute("info2", googlePojo.getEmail());
	      RequestDispatcher dis = request.getRequestDispatcher("/WEB-INF/jsp/success.jsp");
	      dis.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
