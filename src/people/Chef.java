package people;

import java.util.ArrayList;

import restaurant.Food;
import restaurant.Restaurant;

public class Chef {
	private String name;
	private int totalIncome = 0;
	ArrayList<String> histories = new ArrayList<String>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addHistory(Food food, int qty) {
		this.totalIncome = this.totalIncome + food.getPrice()*qty;
		String history = "Cook: " + food.getName() + ", Quantity: " + qty + ", Total Price: " + Restaurant.formatIDR(food.getPrice()*qty); 
		histories.add(history);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("Chef " + name + " cooks history:");
		for(String history : histories) {
			System.out.println("  - " + history);
		}
		System.out.println("Total Income: " + Restaurant.formatIDR(totalIncome));
		
	}

}
