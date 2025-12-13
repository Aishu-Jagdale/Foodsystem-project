package com.controller;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import pojo.Food;

import java.io.IOException;
import java.util.List;
import pojo.Food;
import Dao.FoodDaoImpl;
@WebServlet("/food")
public class FoodController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	FoodDaoImpl fd = new FoodDaoImpl();
	Boolean b;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		HttpSession session = req.getSession();
		String action= req.getParameter("action");
		if(action==null)
	{
			List<Food> list = fd.getAllFood();
			if(list!=null && !(list.isEmpty())) {
				session.setAttribute("flist", list);
				resp.sendRedirect("foodlist.jsp");
			}else {
				resp.sendRedirect("failed.jsp");
			}
		}else if(action.equals("delete")&& action!=null) {
int fid=Integer.parseInt(req.getParameter("fid"));
			b = fd.deleteFoodById(fid);
				if(b) {
					resp.sendRedirect("food");
				}else {
					resp.sendRedirect("failed.jsp");
				}
			} 
			
		}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		  String fname = req.getParameter("fname");
		  String ftype = req.getParameter("ftype");
		  String fcategory = req.getParameter("fcategory");
		  float fprice = Float.parseFloat(req.getParameter("fprice"));
		  String action = req.getParameter("action");
		  
		  if(action.equals("addFood") && action!=null) {
		   b = fd.addFood(new Food(  fname,ftype,fcategory,fprice));
		   if(b) {
		    resp.sendRedirect("food.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
		  if(action.equals("updateFood") && action!=null) {
			  int fid=Integer.parseInt(req.getParameter("fid"));

		   Food f = new Food( fname,ftype,fcategory,fprice);
		f.setFoodId(fid);
		   fd.updateFoodById(f);
		   if(b) {
		    resp.sendRedirect("food.jsp");
		   }
		   else {
		    resp.sendRedirect("failed.jsp");
		   }
		  }
		
	}
	
}
