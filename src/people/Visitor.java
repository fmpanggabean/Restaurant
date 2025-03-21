package people;

import restaurant.Food;

public class Visitor {
	public String name;
	public int totalPrice;

	public Visitor(String name) {
		this.name = name;
	}
	
	public void setTotalPrice(Food food, int quantity) {
		this.totalPrice = food.getPrice() * quantity;
		return;
	}
	
	public void showTotalPrice() {
		System.out.println(this.name + " total price is " + this.totalPrice);
	}
	
	public int getTotalPrice() {
		return totalPrice;
	}
}
