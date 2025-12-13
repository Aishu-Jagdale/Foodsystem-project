package pojo;

public class Cart {
	private int cartId;
	private int foodId;
	private int Quantity;
	private String emailId;
	private String foodName;
	private float price;
	private float totalPrice;
	
	public Cart() {
		super();
	}

	public Cart(int cartId, int foodId, int Quantity, String emailId, String foodName, float price, float totalPrice) {
		super();
		this.cartId = cartId;
		this.foodId = foodId;
		this.Quantity = Quantity;
		this.emailId = emailId;
		this.foodName = foodName;
		this.price = price;
		this.totalPrice = totalPrice;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getFoodId() {
		return foodId;
	}

	public void setFoodId(int foodId) {
		this.foodId = foodId;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int i) {
		this.Quantity = i;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public String toString() {
		return "Cart [cartId=" + cartId + ", foodId=" + foodId + ", Quantity=" + Quantity + ", emailId=" + emailId
				+ ", foodName=" + foodName + ", price=" + price + ", totalPrice=" + totalPrice + "]";
	}
}
