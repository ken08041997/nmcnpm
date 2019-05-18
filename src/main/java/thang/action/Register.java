package thang.action;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import thang.model.UserTemp;
import thang.userDAO.userDAO;
import thang.utilities.MailSender;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url="/WEB-INF/jsp/register.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
		dispatcher.forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname= request.getParameter("fname");
		String lname= request.getParameter("lname");
		String email= request.getParameter("email");
		String number= request.getParameter("number");
		String password= request.getParameter("password");
		
		Random random = new Random();
        int num = random.nextInt(100000);
        String code = String.format("%05d", num);
        
		userDAO.getListTemp().add(new UserTemp(fname,lname,email,number,password,code));System.out.println(userDAO.getListTemp());
		MailSender.send(email, "Please Confirm", code);
		
		String url = "/confirm?email="+email;
		response.sendRedirect(request.getContextPath() + url);
		
		
		
	}

}
