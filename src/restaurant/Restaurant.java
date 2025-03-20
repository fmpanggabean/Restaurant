package restaurant;

import java.util.ArrayList;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<>();
	private ArrayList<Menu> menus = new ArrayList<>();
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println();
		System.out.println("Menu: ");
		for(Menu menu : menus) {
			System.out.println(" - " + menu.getName());
			menu.showFood();
		}
	}

	public void showChef() {
		System.out.println();
		System.out.println("Chef: ");
		for(Chef chef : chefs) {
			System.out.println(" - " + chef.getName());
		}
		
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		chef.addCookHistory(visitor.getName() + " - " + foodName + " " + qty);
		
		for(Menu menu : menus) {
			for(Food food : menu.getFood()) {
				if(food.getName().equals(foodName)) {
					visitor.addPrice(food.getPrice()*qty);
					totalIncome += food.getPrice() * qty;
					return;
				}
			}
		}
		
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println("Total Income: " + totalIncome);
	}

}
