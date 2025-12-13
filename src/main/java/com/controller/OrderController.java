package com.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Order;

import java.io.IOException;

import Dao.CartDaoImpl;
import Dao.OrderDaoImpl;

@WebServlet("/placeorder")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	OrderDaoImpl od= new OrderDaoImpl();
	CartDaoImpl cd=new CartDaoImpl();
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("uEmail");
		Order o=od.placeOrder(email);
		if(o!=null) {
			boolean b=cd.clearCart(email);
			if(b) {
				request.setAttribute("order", o);
				request.getRequestDispatcher("bill.jsp").forward(request, response);
			}
		}else {
			response.sendRedirect("failed.jsp");
		}
	}
	}
