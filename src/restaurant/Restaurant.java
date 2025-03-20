package restaurant;

import people.Chef;
import people.Visitor;

import java.util.*;

import format.Formatting;

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
		System.out.println(menu.getName() + " successfully added");
	}

	public void showMenu() {
		System.out.println("\n" + name + "'s Menu: ");
		for(Menu menu : menus) {
			System.out.println("- " + menu.getName());
			for(String food : menu.getFoods().keySet()) {
				System.out.println("  - " + food);
			}
		}
		System.out.println("");
	}

	public void showChef() {
		System.out.println("Chefs:");
		for(Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String orderedFood, int qty) {
		chef.addCookedHistory(orderedFood, qty);
		int price = visitor.spend(orderedFood, qty, menus);
		visitor.addTotalSpent(price);
		addIncome(price);
		
	}
	
	public void addIncome(int newIncome) {
		totalIncome += newIncome;
	}

	public void showTotalIncome() {
		System.out.println(name + "'s Total Income: " + Formatting.formatIDR(totalIncome));
		
	}

}
