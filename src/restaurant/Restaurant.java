package restaurant;

import people.Chef;
import people.Visitor;

import java.util.ArrayList;

import main.Main;

public class Restaurant {
	private String name;
	private int income;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private ArrayList<Visitor> visitors = new ArrayList<Visitor>();

	public Restaurant(String name) {
		this.name = name;
		this.income = 0;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu menus) {
		this.menus.add(menus);	
	}
	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}
	
	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	

	public void showMenu() {
		System.out.println("Menus: ");
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				System.out.println("  - " + food.getName() + ", Price: " + Main.formatIDR(food.getPrice()));				
			}
		}
	}

	public void showChef() {
		if(chefs.isEmpty()) {
			System.out.println("No chef in this restaurant");
			return;
		}
		System.out.println("\nChefs: ");
		for (Chef chef : chefs) {
			System.out.println("  - " + chef.getChefName());
		}
	System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String food_name, int portion) {
		Food ordered_food = null;
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equalsIgnoreCase(food_name)) {
					ordered_food = food;
					break;
				}
			}
			if(ordered_food != null) {
				break;
			}
		}
		
		if(ordered_food != null) {
			chef.addFood(ordered_food);
			
			int totalPrice = ordered_food.getPrice() * portion;
			visitor.addSpending(totalPrice);
			income += totalPrice;
			
			if (!visitors.contains(visitor)) {
		        visitors.add(visitor);
		    }
			
		    System.out.println(visitor.getName() + " ordered " + portion + "x " + food_name + " (Total: " + Main.formatIDR(totalPrice) + ")");
		    return;
		}
		System.out.println(food_name + " not in the menu!");
		System.out.println("");
	}

	public void showTotalIncome() {
		System.out.println("\nRestaurant: " + this.name);
		System.out.println("Total Income : " + Main.formatIDR(this.income));
	}

	
	
	
	
}
