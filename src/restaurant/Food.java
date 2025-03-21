package restaurant;

public class Food {
	private String foodName;
	private int price;

	public Food(String foodName, int price) {
		this.foodName = foodName;
		this.price = price;
	}

	public String getFoodName() {
		return foodName;
	}

	public int getPrice() {
		return price;
	}
	
}
