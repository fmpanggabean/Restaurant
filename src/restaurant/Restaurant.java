package restaurant;

import java.text.NumberFormat;
import java.util.*;
import people.Chef;
import people.Visitor;;

public class Restaurant {
	private String name;
	int totalCost;
	List<Chef> chefs = new ArrayList<>();
	List<Menu> menus = new ArrayList<>();
	

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
	
	public static String formatIDR(int amount) { 
		@SuppressWarnings("deprecation")
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
	    return formatter.format(amount);
	}
	
	public void showMenu() {
		System.out.println("Menus: ");
		for(Menu menu : menus) {
			System.out.println("-" + menu.getMenu());
		}
		
	}
	
	public void showChef() {
		System.out.println("\nChefs: ");
		for(Chef chef : chefs) {
			System.out.println("-" + chef.getName());
		}
		System.out.println();
	}
	
	public void order(Chef chef, Visitor visitor, String name, int jumlah) {
		for(Menu menu : menus) {
			Food food = menu.getMenus(name);
			if(food!=null) {
				int cost = food.getPrice()*jumlah;
				visitor.addPrice(cost);
				chef.addHistory(name, jumlah);
				totalCost += cost;
	
				System.out.println(visitor.getName() + "ordered " + name + " (" + jumlah + "pcs)");
				return;
			}
		}
	}
	
	public void showTotalIncome() {
		System.out.println("\nRestaurant's total income: " + formatIDR(totalCost));
	}
}
