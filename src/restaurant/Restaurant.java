package restaurant;

import java.util.ArrayList;

import main.Food;
import people.Chef;
import people.Visitor;

import java.text.NumberFormat; 

import java.util.Locale; 


public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private int income; 

	
	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	
	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Restaurant(String name) {
		this.name= name;	
	}

	public void addMenu(Menu menu) {
		this.menus.add(menu);
		
	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}
	
	public static String formatIDR(int amount) { 

		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 

	    return formatter.format(amount); 

	 } 

	public void showMenu() {
		System.out.println("===" + this.name + "===");
		System.out.println();
		for (Menu menu : menus) {
			System.out.println(" " + menu.getName() + ":");
			for (Food food : menu.getFoods()) {
				System.out.println(" - " + food.getName() + ", Price: " + formatIDR(food.getPrice()));
			}
			System.out.println();
		}
	
	}
	
	

	public void showChef() {
		System.out.println(" Chefs:");
		for (Chef chef : chefs) {
			System.out.println(" - " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodie, int quantity) {
		String record = " - " + foodie + ", Amount: " + Integer.toString(quantity);
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				
				if(food.getName() == foodie) {
					visitor.setExpense(visitor.getExpense() + quantity * food.getPrice());
					this.income += (quantity * food.getPrice());
				}
				
			}
		}
		chef.getCookRecord().add(record);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.println(this.name + "'s Total Income: " + formatIDR(income));
		
	}

	
}
