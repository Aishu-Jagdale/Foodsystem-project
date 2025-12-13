package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import pojo.Food;
import utility.DataConnect;
public class FoodDaoImpl implements FoodDao {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	Food food = null;
	
	@Override
	public boolean addFood(Food food) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("insert into food values(?,?,?,?,?)");
			ps.setInt(1, food.getFoodId());
			ps.setString(2, food.getfName());
			ps.setString(3, food.getfType());
			ps.setString(4, food.getfCategory());
			ps.setFloat(5, food.getfPrice());
			
			int row = ps.executeUpdate();
			if(row>0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;	
	}
	
	
	@Override
	public boolean updateFoodById(Food food) {
		try
		{
			con = DataConnect.getConnect();
			ps.setString(1, food.getfName());
			ps.setString(2, food.getfType());
			ps.setString(3, food.getfCategory());
			ps.setFloat(4, food.getfPrice());
			ps.setInt(5, food.getFoodId());
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
	public boolean deleteFoodById(int foodId) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from food where foodId =?");
			ps.setInt(1,foodId);
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
	public List<Food> getAllFood() {
		List<Food> I = new ArrayList<Food>();
		try
		{
			con = DataConnect.getConnect();
			ps= con.prepareStatement("select * from food");
			rs = ps.executeQuery();
			while(rs.next())
			{
				food = new Food();
				food.setFoodId(rs.getInt("foodId"));
				food.setfName(rs.getString("fName"));
				food.setfType(rs.getString("fType"));
				food.setfCategory(rs.getString("fQuantity"));
				food.setfPrice(rs.getFloat("fPrice"));	
				I.add(food);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return I;
	}
	
	
	@Override
	public Food searchFoodById(int foodId) {
		try
		{
		con = DataConnect.getConnect();
		ps = con.prepareStatement("select * from food where foodId = ?");
		ps.setInt(1, foodId);
		rs = ps.executeQuery();
		
		while(rs.next())
		{
			food = new Food();
			food.setfName(rs.getString("fName"));
			food.setFoodId(rs.getInt("foodId"));
			food.setfCategory(rs.getString("fCategory"));
			food.setfType(rs.getString("fType"));
			food.setfPrice(rs.getFloat("fPrice"));	
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return food;
	}
}
