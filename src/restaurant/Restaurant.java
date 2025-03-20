package restaurant;

import java.util.ArrayList;

import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int totalIncome = 0;
	
	public Restaurant(String name) {
		this.name = name;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println("================================================================================");
		System.out.println("\t\t\tWelcome to Restaurant: " + this.name);
		System.out.println("================================================================================\n");
		System.out.println("MENU:");
		int i = 1;
		for (Menu menu : menus) {
			System.out.println("  "+ i + ". " + menu.getName() + ":");
			i++;
			for (Food food : menu.getFoods()) {
				System.out.println("     - " + food.getName() + ", Price: " + Main.formatIDR(food.getPrice()));
			}
		}
		System.out.println("\n================================================================================\n");
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}
 
	public void showChef() {
		System.out.println("DAFTAR CHEF:");
		int i = 1;
		for (Chef chef : chefs) {
			System.out.println("  " + i + ". " + chef.getName());
			i++;
		}
		System.out.println("\n================================================================================\n");
	}

	public void order(Chef chef, Visitor visitor, String name, int qty) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getName().equals(name)) {
					visitor.setTotalPrice(visitor.getTotalPrice() + (qty * food.getPrice()));
					totalIncome += qty * food.getPrice();
				}				
			}
		}
		chef.setOrders("  - Chef " + chef.getName() + " membuat " + name + " untuk" + visitor.getName() + " Sejumlah " + qty);
	}

	public void showTotalIncome() {
		System.out.println("\n================================================================================\n");
		System.out.println("Total Income " + this.name + ": "+ Main.formatIDR(totalIncome));		
		System.out.println("\n================================================================================");
	}
}