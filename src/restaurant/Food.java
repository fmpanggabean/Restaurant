package restaurant;

public class Food {
	private String nameFood;
	private int price;
	public Food(String nameFood, int price) {
		super();
		this.nameFood = nameFood;
		this.price = price;
	}
	
	public String getNameFood() {
		return nameFood;
	}
	
	public int getPrice() {
		return price;
	}
	
	
}
