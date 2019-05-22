package thang.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/action")
public class Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url;
		String action = request.getParameter("action");
		switch (action) {
		case "regisform":
			try {
			
				response.sendRedirect(request.getContextPath() + "/register");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
//			String nextJSP = "/register";
//			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//			dispatcher.forward(request,response);
			break;
		case "loginfb":
			System.out.println("move to facebook");
			url = "/login-facebook";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request,response);
			break;
		case "logingg":
			System.out.println("move to google");
			url = "/login-google";
			RequestDispatcher dispatcher1 = getServletContext().getRequestDispatcher(url);
			dispatcher1.forward(request,response);
			break;
		case "valid":
			url = "/validemail";
			RequestDispatcher dispatcher2 = getServletContext().getRequestDispatcher(url);
			dispatcher2.forward(request,response);
			break;
		default:
			break;
		}
//		String nextJSP = "/WEB-INF/jsp/index.jsp";
//		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//		dispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url;
		String action = request.getParameter("action");
	
		switch (action) {
		case "regis":
			url="/register";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(url);
			dispatcher.forward(request,response);
			break;

		default:
			break;
		}
		
		
		
		
		
		
		
		
//		String action = request.getParameter("action");
//		if (action.equals("dn")) {
//			String nextJSP = "/dangnhap";
//			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//			dispatcher.forward(request,response);
//		}
//		if (action.equals("dk")) {
//			String nextJSP = "/dangky";
//			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
//			dispatcher.forward(request,response);
//		}
	}

}

