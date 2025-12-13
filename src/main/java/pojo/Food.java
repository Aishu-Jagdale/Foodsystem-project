package pojo;

public class Food {
	private int FoodId;
	private String fName;
	private String fType;
	private String fCategory;
	private float fPrice;
	
	public Food()
	{
		super();
	}
	public Food(String fName, String fType, String fCategory, float fPrice) {
		super();
		this.FoodId = FoodId;
		this.fName = fName;
		this.fType = fType;
		this.fCategory=fCategory;
		this.fPrice = fPrice;
		
	}


	public int getFoodId() {
		return FoodId;
	}

	public void setFoodId(int FoodId) {
		this.FoodId = FoodId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getfType() {
		return fType;
	}

	public void setfType(String fType) {
		this.fType = fType;
	}

	public String getfCategory() {
		return fCategory;
	}

	public void setfCategory(String fCategory) {
		this.fCategory = fCategory;
	}

	public float getfPrice() {
		return fPrice;
	}

	public void setfPrice(float fPrice) {
		this.fPrice = fPrice;
	}
	

	@Override
	public String toString() {
		return "Food [FoodId=" + FoodId + ", fName=" + fName + ", fType=" + fType + ", fCategory=" + fCategory
				+ ", fPrice=" + fPrice + "]";
	}

	}
	