package com.controller;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

import Dao.AdminDaoImpl;

@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   AdminDaoImpl ad= new AdminDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		session.invalidate();
		response.sendRedirect("index.jsp");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String action=request.getParameter("action");
		String type=request.getParameter("type");
		String email=request.getParameter("email");
		String pass=request.getParameter("pass");
		
		if(action!=null && action.equals("login")) {
			
			if(type.equals("admin")) {
				boolean b=ad.adminLogin(email, pass);
				if(b) {
					session.setAttribute("aEmail", email);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
			}
			if(type.equals("user")) {
				boolean b=ad.userLogin(email, pass);
				if(b) {
					session.setAttribute("uEmail", email);
					response.sendRedirect("index.jsp");
				}else {
					response.sendRedirect("failed.jsp");

				}
			}
		}
			if(action!=null && action.equals("Changepass")) {
				String npass=request.getParameter("cpass");
			if(type.equals("admin")) {
				boolean b=ad.adminchangepassword(email, npass);
				if(b) {
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}		
			}
			if(type.equals("user")) {
				boolean b=ad.adminchangepassword(email, npass);
				if(b) {
					response.sendRedirect("success.jsp");
				}else {
					response.sendRedirect("failed.jsp");
				}
		}
			}
	}
}