package restaurant;

import people.Chef;
import people.Visitor;

import java.util.ArrayList;

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

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println("List Menu:");
		
		for(Menu m : menus) {
			System.out.println("- Name: " + m.getName());
			
			System.out.println("\tList Food:");
			
			for(Food f : m.getFood()) {
				System.out.println("\t- Name: " + f.getName() + ", Price: " + f.getPrice());
			}
		}
	}

	public void showChef() {
		System.out.println("\nList Chef:");
		
		for(Chef c : chefs) {
			System.out.println("Name: " + c.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String name, int quantity) {		
		for(Menu m : menus) {
			for(Food f : m.getFood()) {
				if(f.getName() == name) {
					income += quantity * f.getPrice();
					chef.cook(visitor, name, quantity);
					visitor.totalSpent(quantity * f.getPrice());
					
					System.out.println(visitor.getName() + " order " + quantity + " " + name + " from " + chef.getName());
				}
			}
		}
		System.out.println();
	}

	public void showTotalIncome() {
		System.out.println("\nTotal Income: " + income);
	}

}
