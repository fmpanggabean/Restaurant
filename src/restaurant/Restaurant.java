package restaurant;

import java.util.ArrayList;

import helper.Format;
import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<>();
	private ArrayList<Menu> menus = new ArrayList<>();
	private int totalIncome;
	
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
		System.out.println(name + " Restaurant");
		System.out.println();
		System.out.println(name + " Menus:");
		for(Menu menu: menus) {
			System.out.println(" - " + menu.getType() + ":");
			for(Food food : menu.getFood()) {
				System.out.println("   - " + food.getName() + " (Price: " + Format.formatIDR(food.getPrice()) + ")");
			}
		}
	}

	public void showChef() {
		System.out.println();
		System.out.println(name + " Chefs:");
		for(Chef chef : chefs)  {
			System.out.println("   - " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		chef.addCookHistory("Chef " + chef.getName() + " Cook " + qty + " " + foodName  + " for " + visitor.getName());
		int spent = 0;
		for(Menu menu : menus) {
			for(Food food : menu.getFood()) {
				if(food.getName().equals(foodName)) {
					spent = food.getPrice() * qty;
				}
			}
		}
		totalIncome += spent;
		visitor.setSpent(spent);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println(name + " Restaurant Total Income: " + Format.formatIDR(totalIncome));
	}
}
