package com.controller;

import java.io.IOException;
import java.util.List;

import Dao.CustomerDaoImpl;
import Dao.FeedbackDaoImpl;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Customer;
import pojo.Feedback;

public class FeedbackController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 FeedbackDaoImpl fb=new FeedbackDaoImpl();
	   boolean a;
   public FeedbackController() {
       super();
       // TODO Auto-generated constructor stub
   }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session=request.getSession();
		String action=request.getParameter("action");		
		if(action.equals("delete")&& action!=null) {
			a=fb.deleteFeedBackById(action);
			if(a) {
				response.sendRedirect("food");
				
			}else {
				response.sendRedirect("failed.jsp");

			}
		}else {
			List<Feedback> list=fb.getAllFeedBack();
			if(list!=null && !(list.isEmpty())) {
				session.setAttribute("fblist", list);
                 response.sendRedirect("Feedbacklist.jsp");
				
			}else {
				response.sendRedirect("failed.jsp");

			}
			}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String EmailId=request.getParameter("EmailId");
		String suggestion=request.getParameter("suggestion");
		int Rank=Integer.parseInt("Rank");
		String Review=request.getParameter("Review");
		String action=request.getParameter("action");

		if(action.equals("AddFeedback") && action!=null) {
			a=(fb).addFeedBack(new Feedback( EmailId,suggestion,Rank,Review));
			if(a) {
				response.sendRedirect("success.jsp");
			}else {
				response.sendRedirect("failed.jsp");
			}
		}
		if(action.equals("AddFeedback") && action!=null) {
			Feedback fs=new Feedback(EmailId, suggestion,Rank,Review);
			  fs.setEmailid(EmailId);

		if(a) {
			response.sendRedirect("success.jsp");
		}else {
			response.sendRedirect("failed.jsp");
		}
		}
	}
}
