package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Cart;

import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.NumberOfDocuments;
import javax.swing.text.html.CSS;

import Dao.CartDaoImpl;

public class CartController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   CartDaoImpl cd=new CartDaoImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
String action =request.getParameter("action");
if(action !=null && action.equals("delete")) {
	int CartId=Integer.parseInt(request.getParameter("CartId"));
	boolean b=cd.deleteCart(CartId);
	if(b) {
		response.sendRedirect("cart");
	}else {
		response.sendRedirect("failed.jsp");
	}
}
else {
	String emailId=(String)session.getAttribute("uEmail");
	List<Cart>l=cd.Showcart(emailId);
	if(l!=null &&(l.isEmpty())) {
		session.setAttribute("clist", l);
		response.sendRedirect("Cartlist.jsp");
	}else {
		response.sendRedirect("failed.jsp");
	}
} 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int cartId=Integer.parseInt(request.getParameter("cartId"));
		int foodId=Integer.parseInt(request.getParameter("foodId"));
		int Quantity=Integer.parseInt(request.getParameter("Quantity"));
		String emailId=request.getParameter("emailId");
		String foodName=request.getParameter("foodName");
		float price=Float.parseFloat(request.getParameter("price"));
		float totalPrice=Float.parseFloat(request.getParameter("totalPrice"));
		String action=request.getParameter("action");
		if(action!=null && action.equals("AddToCart")) {
			boolean b=cd.addcart(new Cart (cartId,foodId,Quantity,emailId,foodName,price,totalPrice));
					if(b) {
						response.sendRedirect("Cart");
					}else {
						response.sendRedirect("failed.jsp");		
		}
	}
	}
}

		
	