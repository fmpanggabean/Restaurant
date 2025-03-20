package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.*;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private int income = 0;
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addMenu(Menu newMenu) {
		this.menus.add(newMenu);
	}
	
	public void addChef(Chef newChef) {
		this.chefs.add(newChef);
	}
	
	public static String formatIDR(int amount) { 
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
		return formatter.format(amount); 
	}
	
	public void showMenu() {
		System.out.println("==== " + name + " ====");
		for (Menu menu : this.menus) {
			System.out.println("   " + menu.getType() + ":");
			for (Food food : menu.getFoods()) {
				System.out.printf("      - %s, Price: %s\n", food.getName(), formatIDR(food.getPrice()));
			}
		}
	}
	
	public void showChef() {
		System.out.println("   Chefs: ");
		for (Chef chef : this.chefs) {
			System.out.println("      - " + chef.getName());
		}
		System.out.println();
	}
	
	public Food searchFood(String foodName) {
		for (Menu menu : this.menus) {
			for (Food food : menu.getFoods()) {
				if (food.getName() == foodName) {
					return food;
				}
			}
		}
		
		return null;
	}
	
	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		Food target = searchFood(foodName);
		if (target == null) {
			System.err.println("No food with name " + foodName);
			return;
		}
		chef.addCookedFood(target, qty);
		int totalPrice = target.getPrice() * qty;
		visitor.addExpense(totalPrice);
		this.income += totalPrice;
		
	}
	
	public void showTotalIncome() {
		System.out.printf("%s's Total Income: %s\n", this.name, formatIDR(this.income));
	}
	

}
