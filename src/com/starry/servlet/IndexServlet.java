package com.starry.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.starry.dao.UserDao;
import com.starry.dao.UserDaoImp;
import com.starry.entity.User;
import com.starry.service.UserService;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet("/IndexServlet")
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("username");
		String pass=request.getParameter("password");
		User user=new User(name, pass);
		UserService us=new UserService();
		boolean bl= us.select(user);
		System.out.println(bl);
		if(bl) {
			//request.getRequestDispatcher("/pages/index.html").forward(request, response);		
			response.sendRedirect("pages/index.html");
		}else {
			//request.getRequestDispatcher("pages/login.jsp").forward(request, response);		
			response.sendRedirect("pages/login.jsp");
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
