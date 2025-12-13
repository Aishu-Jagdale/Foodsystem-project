package Dao;

import java.util.List;

import pojo.Feedback;


public interface FeedbackDao {

	boolean addFeedBack(Feedback fd);
	boolean deleteFeedBackById(String emailId);
	List<Feedback>getAllFeedBack();



}
