package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import utility.DataConnect;

public class AdminDaoImpl implements AdminDao{
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
	
	@Override
	public boolean adminLogin(String aEmailId, String aPassword) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from adminlogin where aEmailId = ? and aPassword = ?");
			ps.setString(1, aEmailId);
			ps.setString(2, aPassword);
			rs = ps.executeQuery();
			
			if(rs.next())
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
	public boolean adminchangepassword(String aEmailId, String aPassword) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("update adminlogin set aPassword=? where aEmailId=?");
			ps.setString(1, aPassword);
			ps.setString(2, aEmailId);
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
	public boolean userLogin(String cEmailId, String cPassword) {
		try 
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("select * from customer where cEmailId=? and cPassword=?");
			ps.setString(1, cEmailId);
			ps.setString(2, cPassword);
			rs = ps.executeQuery();
			
			if(rs.next())
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
	public boolean userchangepassword(String cEmailId, String cPassword) {
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("update customer set cPassword=? where cEmailId = ?");
			ps.setString(1, cPassword);
			ps.setString(2, cEmailId);
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
}
