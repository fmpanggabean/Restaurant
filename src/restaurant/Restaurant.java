package restaurant; 

import restaurant.Menu;
import java.util.*;

import people.Chef; 
import people.Visitor; 

public class Restaurant {
	private String name; 
	private ArrayList<Menu> menus = new ArrayList<>(); 
	private ArrayList<Chef> chefs = new ArrayList<>(); 
	private int income = 0;  
	
	public Restaurant(String name) {
		this.name = name; 
	}
	
	public void addMenu(Menu m) {
		menus.add(m); 
	}
	
	public void addChef(Chef c) {
		chefs.add(c); 
	}
	
	public void showMenu() {
		System.out.println("Restaurant: " + name);  
		System.out.println(); 
		System.out.println("Menus:"); 
		for(Menu menu : menus) {
			System.out.println("- " + menu.getName()); 
			System.out.println("     Dish List: "); 
			for(Food food : menu.getFood()) {
				System.out.println("     - Name: " + food.getName() + ", Price: " + food.getPrice()); 
			}
		}
		System.out.println(); 
	}
	
	public void showChef() {
		System.out.println("Chefs:"); 
		for(Chef chef : chefs) {
			System.out.println("- " + chef.getName()); 
		}
		System.out.println(); 
	}
	
	public int calculateTotalPrice(int quantity, Food food) {
		income += food.getPrice() * quantity; 
		return food.getPrice() * quantity; 
	}
	
	public void order(Chef chef, Visitor visitor, String food, int quantity) {
		int price = 0; 
		for(Menu menu : menus) {
			for(Food f : menu.getFood()) {
				if(f.getName().equals(food)) {
					visitor.setTotalSpent(calculateTotalPrice(quantity, f));  
					price = f.getPrice() * quantity; 
				}
			}
		}
		String processOrder = "Order for " + visitor.getName() + " with a total of " + quantity + " dishes with a price of Rp" + price; 
		chef.getCookHistory().add(processOrder); 
	}
	
	public void showTotalIncome() {
		System.out.println("Total Restaurant Income: Rp" + income); 
	}
}
