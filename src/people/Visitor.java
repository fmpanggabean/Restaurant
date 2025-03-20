package people;

import java.util.*;

import format.Formatting;
import restaurant.Menu;

public class Visitor {

	private String name;
	private int totalSpent;

	public Visitor(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println(name + "'s Total Spent: " + Formatting.formatIDR(totalSpent) + "\n");
	}
	
	public int spend(String food, int qty, ArrayList<Menu> menus) {
		int price = 0;
		for(Menu menu : menus) {
			if(menu.getFoods().containsKey(food)) {
				price = qty * menu.getFoods().get(food).getPrice();
				break;
			}
		}
		return price;
	}
	
	public void addTotalSpent(int price) {
		this.totalSpent += price;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

}
