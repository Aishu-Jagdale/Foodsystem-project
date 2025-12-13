package Dao;

import java.util.List;

import pojo.Order;

public interface OrderDao {
	Order placeOrder(String emailId);
	List<Order>showOrder();
}
