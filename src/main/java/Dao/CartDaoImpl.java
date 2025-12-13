package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pojo.Cart;
import utility.DataConnect;

public class CartDaoImpl implements CartDao  {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	
	
	@Override
	public boolean addcart(Cart c) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("insert into Cart1 values(?,?,?,?,?,?,?)");
			ps.setInt(1, c.getCartId());
			ps.setInt(2, c.getFoodId());
			ps.setInt(3, c.getQuantity());
			ps.setString(4, c.getEmailId());
			ps.setString(5, c.getFoodName());
			ps.setFloat(6, c.getPrice());
			ps.setFloat(7, c.getTotalPrice());
			int	row = ps.executeUpdate();
			
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;	
	}
	
	
	@Override
	public List<Cart> ShowCart(String EmailId) {
		List<Cart> l = new ArrayList<>();
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from Cart1 where emailId = ?");
			ps.setString(1, EmailId);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Cart c = new Cart();
				c.setCartId(rs.getInt("cartId"));
				c.setFoodId(rs.getInt("foodId"));
				c.setQuantity(rs.getInt("quantity"));
				c.setEmailId(rs.getString("emailId"));
				c.setFoodName(rs.getString("foodName"));
				c.setPrice(rs.getFloat("price"));
				c.setTotalPrice(rs.getFloat("totalprice"));	
				
				l.add(c);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
	}
	
	
	@Override
	public boolean deleteCart(int cartId) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from Cart1 where cartId = ?");
			ps.setInt(1, cartId);
			int row = ps.executeUpdate();
			
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
		
	}
	
	
	@Override
	public boolean clearCart(String emailId) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from Cart1 where emailId = ?");
			ps.setString(1, emailId);
			int row = ps.executeUpdate();
			
			if(row>0)
			{
				return true;
			 }
			else
			{
				return false;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}


	public List<Cart> Showcart(String emailId) {
		List<Cart> l = new ArrayList<>();
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from Cart1 where emailId = ?");
			ps.setString(1, emailId);
			rs = ps.executeQuery();
			
			while(rs.next())
			{
				Cart c = new Cart();
				c.setCartId(rs.getInt("cartId"));
				c.setFoodId(rs.getInt("foodId"));
				c.setQuantity(rs.getInt("quantity"));
				c.setEmailId(rs.getString("emailId"));
				c.setFoodName(rs.getString("foodName"));
				c.setPrice(rs.getFloat("price"));
				c.setTotalPrice(rs.getFloat("totalprice"));	
				
				l.add(c);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return l;
		
	}
	
	

}
