package restaurant;

import people.Chef;
import people.Visitor;

import java.util.ArrayList;

import main.Main;

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
		System.out.println("Chef " + chef.getName() + " is hired at " + name);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		System.out.println(menu.getName() + " is added to " + name);
	}

	public void showMenu() {
		System.out.println("List of All Menu(s):");
		for(Menu menu : menus) {
			System.out.println("- " + menu.getName());
			menu.showFood();
		}
	}

	public void showChef() {
		System.out.println("List of All Chef(s):");
		for(Chef chef : chefs) {
			System.out.println("  - " + chef.getName());
		}
	}
	
	private int getPrice(String foodName) {
		for(Menu menu : menus) {
			if(menu.getFoods().containsKey(foodName)) return menu.getFoods().get(foodName).getPrice();
		}
		return 0;
	}
	
	public void showTotalIncome() {
		System.out.println("Total income of " + name + ": " + Main.formatIDR(totalIncome));
	}

	public void order(Chef chef, Visitor visitor, String foodName, int amount) {
		chef.cook(foodName, visitor, amount);
		visitor.addSpent(amount*getPrice(foodName));
		totalIncome += amount*getPrice(foodName);
		System.out.println(visitor.getName() + " ordered " + amount + " " + foodName + ", will be cooked by Chef " + chef.getName());
	} 
	
	
	
	
}
