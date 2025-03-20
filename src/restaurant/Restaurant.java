package restaurant;
import java.util.*;
import java.text.*;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	 private String name;
	 private List<Menu> menus = new ArrayList<>();
	 private List<Chef> chefs= new ArrayList<>();
	 private int totalIncome = 0;
	 
	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addMenu(Menu menu) {
	      menus.add(menu);
	 }
	
	public void showMenu() {
		for(Menu menu : menus) {
			System.out.println("nama menu: " + menu.getName());
			for(Food food : menu.getFoods()) {
				System.out.println("- " + food.getName());
			}
		}
	}
	
	public void showChef() {
		for(Chef chef : chefs) {
			System.out.println("chef: " + chef.getName());
		}
	}
	
	public void order(Chef chef, Visitor visitor, String food1, int quantity) {
		Food food = cekFood(food1);
		
		if(food == null) {
			System.out.println("makanan tidak ditemukan!");
		}
		
		else {
			int price = food.getPrice() * quantity;
			visitor.setTotalPrice(price);
			totalIncome += price;
			
			chef.addHistory(food, quantity);
			System.out.println(" - "+visitor.getName() + " memesan " + quantity + " makanan " + food.getName() + " dari chef " + chef.getName());
		}
	}
	
	private Food cekFood(String food1) {
		for(Menu menu: menus) {
			for(Food food: menu.getFoods()) {
				if(food.getName().equalsIgnoreCase(food1)) return food;
			}
		}
		return null;
	}
	
	public void showTotalIncome() {
		System.out.println("total income restaurant: " + formatIDR(totalIncome));
	}
	 
	public static String formatIDR(int amount) { 
		@SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
	    return formatter.format(amount);
	}
}
