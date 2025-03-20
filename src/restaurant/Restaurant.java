package restaurant;

import java.util.ArrayList;
import java.util.List;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Chef> chefs = new ArrayList<Chef>();
	private List<Menu> menus = new ArrayList<Menu>();
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
		System.out.println(name + "'s menu:");
		for (Menu menu : menus) {
			System.out.println(menu.getName() + ":");
			for (Food food : menu.getFoods()) {
				System.out.println("\t- " + food.getName());
			}
		}
	}

	public void showChef() {
		int i = 1;
		for (Chef chef : chefs) {
			System.out.println("Chef " + i + ": " + chef.getName());
			i++;
		}
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		for (Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName() == foodName) {
					int totalPrice = food.getPrice() * qty;
					chef.addCookHistory(foodName + " (quantity: " + qty + ")");
					visitor.addTotalSpend(totalPrice);
					totalIncome += totalPrice;
					return;
				}
			}
		}
		System.out.println("No menu for " + foodName);
	}

	public void showTotalIncome() {
		System.out.println("Total income: " + totalIncome);
	}
	
}
