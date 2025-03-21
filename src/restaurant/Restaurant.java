package restaurant;

import java.util.ArrayList;

import main.Food;
import main.Helper;
import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private ArrayList<Chef> chefs = new ArrayList<>();
	private ArrayList<Menu> menus = new ArrayList<>();
	private int income = 0;

	public Restaurant(String name) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu course) {
		menus.add(course);
	}

	public String getName() {
		return name;
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void showMenu() {
		System.out.println("=============================");
		System.out.println("   Welcome to " + name);
		System.out.println("=============================");
		System.out.println("");
		System.out.println(name + "'s Menu:");
		for (Menu menu : menus) {
			System.out.println("   " + menu.getName() + "(s):");
			for (Food food : menu.getFoods()) {
				System.out.println("      - " + food.getName() + " (Price: " + Helper.formatIDR(food.getPrice()) + ")");
			}
		}
	}

	public void showChef() {
	System.out.println("");
	System.out.println(name + "'s Chef:");
		for (Chef chef : chefs) {
			System.out.println("   - " + chef.getName());
		}
		System.out.println("");
	}

	public void order(Chef chef, Visitor visitor, String food, int qty) {
		chef.setHistory("- Cooked " + food + " for " + visitor.getName() + " | Quantity: " + qty);
		for (Menu menu : menus) {
			if(menu.getHashMap().containsKey(food)) {
				visitor.setBill(qty, menu.getHashMap().get(food));
				income = income + (menu.getHashMap().get(food) * qty);
			}
		}
	}

	public void showTotalIncome() {
		System.out.println("");
		System.out.println(name + "'s Income: " + Helper.formatIDR(income));
	}

}
