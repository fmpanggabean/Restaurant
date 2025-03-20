package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int income;

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}

	public void showMenu() {
		System.out.println("==== " + this.name + " ====");
		System.out.println();
		System.out.println("Menu");
		for (Menu menu : menus) {
			System.out.println("  " + menu.getType());
			for (Food food : menu.getFoods()) {
				System.out.println("    - " + food.getName() + ": " + Restaurant.formatIDR(food.getPrice()));
			}
		}
	}

	public void showChef() {
		System.out.println("Chef List");
		for(Chef chef : chefs) {
			System.out.println("  - " + chef.getName());
		}
		System.out.println();
	}
	
	public Food findFood(String foodName) {
		for(Menu menu : this.menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName() == foodName) {
					return food;
				}
			}
		}
		return null;
	}

	public void order(Chef chef, Visitor visitor, String foodName, int amount) {
		Food cookedFood = findFood(foodName);
		if(cookedFood == null) {
			System.out.println("There is no food named " + foodName);
			return;
		}
		chef.addCookedFoods(cookedFood, amount);
		
		int total = cookedFood.getPrice() * amount;
		visitor.addExpense(total);
		
		this.income += total;
	}

	public void showTotalIncome() {
		System.out.println("Total Income: " + Restaurant.formatIDR(this.income));
		System.out.println();
	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public static String formatIDR(int amount) { 
	    NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

	    return formatter.format(amount); 
    } 
}
