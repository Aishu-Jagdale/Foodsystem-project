package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import pojo.Customer;
import pojo.Feedback;
import utility.DataConnect;

public class FeedbackDaoImpl implements FeedbackDao  {
	Connection con;
	PreparedStatement ps;
	ResultSet rs;
   
    
	@Override
	public boolean addFeedBack(Feedback fd) {
		
		try {
			
			con = DataConnect.getConnect();
			ps = con.prepareStatement("Insert into FeedBack values(?,?,?,?)");
			ps.setString(1, fd.getEmailid());
			ps.setString(2, fd.getReview());
			ps.setInt(3, fd.getRank());
			ps.setString(4, fd.getSuggestion());
			int row = ps.executeUpdate();
			
			if(row>0)
			{
				return true;
			}
			else
			{
				return false;
			}
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		return false;
	}

	@Override
	public boolean deleteFeedBackById(String emailId) {
		
		try
		{
			con = DataConnect.getConnect();
			ps = con.prepareStatement("delete from FeedBack where EmailId = ?");
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

	@Override
	public List<Feedback> getAllFeedBack() {
		List<Feedback> I = new ArrayList<Feedback>();
		try
		{
			con = DataConnect.getConnect();
			ps= con.prepareStatement("select * from FeedBack");
			rs = ps.executeQuery();
			while(rs.next())
			{
				Feedback fd = new Feedback();

				fd.setEmailid(rs.getString("emailId"));
				fd.setReview(rs.getString("Review"));
				fd.setRank(rs.getInt("Rank"));
				fd.setSuggestion(rs.getString("Suggestion"));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return I;	
	}
	}


