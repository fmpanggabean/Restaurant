package restaurant;

import java.util.ArrayList;

import helper.Format;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<>();
	private ArrayList<Menu> menus = new ArrayList<>();
	private int totalIncome;

	public String getName() {
		return name;
	}

	public Restaurant(String name) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu type) {
		menus.add(type);
	}

	public void showMenu() {
		System.out.println("Restaurant : " + name);
		System.out.println();
		System.out.println("Menu at " + name + " :");
		for(Menu menu : menus) {
			System.out.println("- " + menu.getType());
			System.out.println("   List " + menu.getType() + ":");
			for(Food food : menu.getFoods()) {
				System.out.println("      - " + food.getName() + " (Price : " + Format.formatIDR(food.getPrice()) + ")");
			}
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("Chef:");
		for(Chef chef : chefs) {
			System.out.println("   - " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String name, int qty) {
		chef.addCookHistory("Chef " +chef.getName() + " Cook " + qty + " " +name + " for " + visitor.getName());
		int price = 0;
		for(Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(name)) {
					price = food.getPrice() * qty;
				}
			}
		}
		
		totalIncome += price;
		visitor.setSpent(price);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println("Total Income " + name + " Restaurant : " + Format.formatIDR(totalIncome));
	}
	
}
