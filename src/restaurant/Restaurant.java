package restaurant;

import java.util.*;

import helper.Helper;
import people.*;

public class Restaurant {
	private String name;
	private List<Menu> menus = new ArrayList<>();
	private List<Chef> chefs = new ArrayList<>();
	
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void showMenu() {
		System.out.printf("%s's Restaurant Menu:\n", name);
		
		if (menus.size() < 1) {
			System.out.printf("There is no menu in %s's restaurant!\n", name);
			return;
		}
		
		for (Menu menu: menus) {
			System.out.printf("  - %s:\n", menu.getTitle());
			
			int i = 0;
			for (String key: menu.getFoods().keySet()) {
				Food food = menu.getFoods().get(key);
				
				System.out.printf("      %d. %s (Price: %s)\n", i+1, food.getName(), Helper.formatIDR(food.getPrice()));								
			}
		}
	}
	
	public void showChef() {
		System.out.println("Chefs:");
		
		if (chefs.size() < 1) {
			System.out.printf("There is no chef in %s's restaurant!\n", name);
			return;
		}
		
		for (int i = 0; i < chefs.size(); i++) {
			Chef chef = chefs.get(i);
			System.out.printf("  %d. %s\n", i+1, chef.getName());
		}
	}
	
	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		Food food = null;
		
		for (Menu menu: menus) {
			if (menu.getFoods().containsKey(foodName)) {
				food = menu.getFoods().get(foodName);
				break;
			}
		}
		
		if (food == null) {
			System.out.printf("%s's restaurant does not have %s on the menu!\n", name, foodName);
			return;
		}
		
		int cost = quantity * food.getPrice();
		System.out.printf("%s ordered %d %s for %s! Chef %s is ready to cook!\n",
					visitor.getName(), quantity, foodName, Helper.formatIDR(cost), chef.getName());
		
		String history = String.format("Cooking %d %s for %s for %s", quantity
				, foodName, visitor.getName(), Helper.formatIDR(cost));
		
		totalIncome += cost;
		visitor.addTotalSpent(cost);
		chef.addCookHistory(history);
	}
	
	public void showTotalIncome() {
		System.out.printf("Total Restaurant Income: %s", Helper.formatIDR(totalIncome));
	}
}
