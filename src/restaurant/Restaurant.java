package restaurant;

import java.text.NumberFormat;
import java.util.*;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	List <Chef> chefs = new ArrayList<>();
	List <Menu> menus = new ArrayList<>();
	int totalPrice;

	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public void showMenu() {
		System.out.println("Menu:");
		for(Menu menu : menus) {
			System.out.println("- " + menu.getType());
		}
		System.out.println();
	}
	
	public void showChef() {
		System.out.println("Chef:");
		for(Chef chef : chefs) {
			System.out.println("- " + chef.getName());
		}
		System.out.println();
	}
	
	public static String formatIDR(int amount) { 
		@SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
	    return formatter.format(amount);
	}
	
	public void order(Chef chef, Visitor visitor, String name, int qty) {
		for(Menu menu : menus) {
			Food food = menu.getMenus(name);
			if(food != null) {
				int price = food.getPrice() * qty;
				visitor.addPrice(price);
				chef.addHistory(name, qty);
				totalPrice += price;
				System.out.println("Visitor: " + visitor.getVisitorName() +
					" ordered " + name + " " + qty + " portion");
			}
		}
	}
	
	public void showTotalIncome() {
		System.out.println();
		System.out.println("Total Income : " + formatIDR(totalPrice));
	}
}
