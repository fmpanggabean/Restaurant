package restaurant;

import java.util.ArrayList;

import format.Format;
import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private ArrayList<Menu> menus = new ArrayList<>();
	private ArrayList<Chef> chefs = new ArrayList<>();
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
		System.out.println(name + " Menu");
		System.out.println("=================");
		for(Menu m : menus) {
			System.out.println(m.getCategory() + ":");
			for(Food f : m.getFoods()) {
				System.out.println("- " + f.getName() + "\t Rp" + Format.formatIDR(f.getPrice()));
			}
			System.out.println("------------------------------------");
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("Chefs in " + name + ":");
		for(Chef c : chefs) {
			System.out.println("- Chef " + c.getName());
		}
		System.out.println("");
	}
	
	private Food findFood(String foodName) {
		for(Menu m : menus) {
			for(Food f : m.getFoods()) {
				if(f.getName().equalsIgnoreCase(foodName)) {
					return f;
				}
			}
		}
		return null;
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		Food orderedFood = findFood(foodName);
		if(orderedFood != null) {
			visitor.addOrder(orderedFood, qty);
			chef.recordCooking(foodName, qty);
			totalIncome += (qty * orderedFood.getPrice());
			System.out.println(visitor.getName() + " has ordered " + qty + " " + foodName);
		}else {
			System.out.println(foodName + " not found");
		}
		System.out.println("------------------------------------------");
	}

	public void showTotalIncome() {
		System.out.println("\n" + name + " Total Income : " + Format.formatIDR(totalIncome));
		
	}

}
