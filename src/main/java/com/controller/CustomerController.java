package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Customer;
import pojo.Food;

import java.io.IOException;
import java.util.List;

import Dao.CustomerDaoImpl;
import Dao.FoodDaoImpl;
@WebServlet("/customer")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	CustomerDaoImpl cd = new CustomerDaoImpl();
	Boolean b;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		String action= req.getParameter("action");
		String cEmailId=(String)session.getAttribute("cEmailId");
		
		if(action.equals("delete") && action!=null) {
			b = cd.deleteCustomerById(cEmailId);
			if(b) {
				resp.sendRedirect("success.jsp");
			}else {
				resp.sendRedirect("failed.jsp");
			}
		}else {
			List<Customer> list = cd.getAllCustomer();
			if(list!=null && !(list.isEmpty())) {
				session.setAttribute("clist", list);
				resp.sendRedirect("customerlist.jsp");
			}else {
				resp.sendRedirect("failed.jsp");
			}
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String cname = req.getParameter("cname");
		  String cemailid = req.getParameter("cemailid");
		  String cpassword = req.getParameter("cpassword");
		  String caddress = req.getParameter("caddress");
		  String ccontactno = req.getParameter("ccontactno");
		  String action = req.getParameter("action");
		  
		  if(action.equals("addCustomer") && action!=null) {
		   b = cd.addCustomer(new Customer( cname, cemailid, cpassword, caddress, ccontactno));
		   if(b) {
		    resp.sendRedirect("sucess.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
		  if(action.equals("updateCustomer") && action!=null) {
		   Customer c = new Customer( cname, cemailid, cpassword, caddress, ccontactno);
		   c.setcEmailId(cemailid);
		   cd.updateCustomerById(c);
		   if(b) {
		    resp.sendRedirect("sucess.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
		
	}
	}

