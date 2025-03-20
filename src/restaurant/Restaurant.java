package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private int income;
	private ArrayList<Menu> menus;
	private ArrayList<Chef> chefs;

	public Restaurant(String name) {
		this.name = name;
		this.menus = new ArrayList<Menu>();
		this.chefs = new ArrayList<Chef>();
	}

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

	public void addMenu(Menu menu) {
		this.menus.add(menu);
	}

	public void showMenu() {
		System.out.println("===== SHOW MENU =====");
		for (Menu menu : menus) {
			System.out.println(menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.println("  - " + food.getName() + "(" + formatIDR(food.getPrice()) + ")");
			}
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("===== SHOW CHEF =====");
		for (Chef chef : chefs) {
			System.out.println("  - Name: " + chef.getName());
		}
		System.out.println();
	}

	public Food searchFood(String foodName) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if (food.getName() == foodName) {
					return food;
				}
			}
		}
		return null;
	}

	public void order(Chef chef, Visitor visitor, String foodName, int quantity) {
		Food food = searchFood(foodName);

		if (food == null) {
			System.out.println("\"" + foodName + "\" not found\n");
			return;
		}

		String cookHistoryString = food.getName() + " (Qty: " + quantity + ")";

		chef.addFoodHistory(cookHistoryString);
		visitor.setTotalPrice(visitor.getTotalPrice() + (food.getPrice() * quantity));
		this.income += (food.getPrice() * quantity);
	}

	public void showTotalIncome() {
		System.out.println("===== SHOW TOTAL INCOME =====");
		System.out.println(this.name + "'s Total Income: " + formatIDR(this.income));

	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}

	// Helper method to format currency in IDR
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.of("id", "ID"));
		return formatter.format(amount);
	}

}
