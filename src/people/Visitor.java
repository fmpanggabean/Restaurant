package people;

import java.util.ArrayList;

import main.Format;
import restaurant.Menu;

public class Visitor {
	private String name;
	private ArrayList<String> orders; 
	private int totalSpent; 
	
	public Visitor(String name) {
		this.name = name; 
		this.orders = new ArrayList<>(); 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int addOrder(String order, int qty, ArrayList<Menu> menus) {
		orders.add(order); 
		int price = 0; 
		for(Menu menu : menus) {
			if(menu.getFoods().containsKey(order)) {
				price = menu.getFoods().get(order).getPrice(); 
			}
		}
		return price; 
	}

	public void showTotalPrice() {
		System.out.println(name + " total spent is " + Format.formatIDR(totalSpent));
		System.out.println();
		
	}

	public int getTotalSpent() {
		return totalSpent; 
		
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent += totalSpent; 
		
	}
	
	

}
