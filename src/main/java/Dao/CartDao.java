package Dao;

import java.util.List;

import pojo.Cart;

public interface CartDao {
	boolean addcart(Cart c);
	boolean deleteCart(int cartId);
	boolean clearCart(String emailId);
	List<Cart> ShowCart(String EmailId);
}
