package restaurant;

import people.Chef;
import people.Visitor;

import java.util.*;
import helper.Formatter;

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
		System.out.println("======================================================");
		System.out.println("                 "+ name + " Menu");
		System.out.println("======================================================");
		System.out.println("");
		for(Menu menu : menus) {
			System.out.println(menu.getName());
			for(String foodName : menu.getFoods().keySet()) {
				Food food = menu.getFoods().get(foodName);
				System.out.println("  " + foodName + "    -  " + Formatter.formatIDR(food.getPrice()));
			}
			System.out.println("");
		}
		System.out.println("======================================================");
	}
	
	public void showChef() {
		System.out.println("                      CHEFS");
		System.out.println("======================================================");
		for(Chef chef : chefs) {
			System.out.println("  - Chef " + chef.getName());
		}
		System.out.println("======================================================");
	}
	
	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		Food food = null;
		for(Menu menu : menus) {
			if(menu.getFoods().containsKey(foodName)) {
				food = menu.getFoods().get(foodName);
				break;
			}
		}
		if(food == null) {
			System.out.println("Menu not found!");
			return;
		}
		visitor.addTotalSpend(quantity, food.getPrice());
		totalIncome += (quantity * food.getPrice());
		chef.getHistory().add("Made " + quantity + " " + foodName + " for " + visitor.getName());
		System.out.println(visitor.getName() + " has ordered " + quantity + " " + foodName + " for " + Formatter.formatIDR(quantity*food.getPrice())+ "!");
	}
	
	public void showTotalIncome() {
		System.out.println("Restaurant's Total Income : " + Formatter.formatIDR(totalIncome));
	}

}
