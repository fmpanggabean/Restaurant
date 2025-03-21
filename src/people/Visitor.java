package people;

import java.util.ArrayList;

import format.Format;
import restaurant.Food;

public class Visitor {

	private String name;
	private ArrayList<Food> orders = new ArrayList<>();
	private int totalSpent;

	public Visitor(String name) {
		this.name = name;
		this.totalSpent = 0;
	}

	public String getName() {		
		return name;
	}
	
	public void addOrder(Food food, int qty) {
		for(int i = 0; i < qty; i++) {
			orders.add(food);
		}
		totalSpent += food.getPrice() * qty;
	}

	public void showTotalPrice() {
		System.out.println(name + "'s Total Price: " + Format.formatIDR(totalSpent));
		System.out.println("------------------------------------------");
	}

}
