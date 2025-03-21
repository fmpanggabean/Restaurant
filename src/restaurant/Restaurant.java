package restaurant;

import java.util.ArrayList;

import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Chef> chefs = new ArrayList<>();
	private ArrayList<Menu> menus = new ArrayList<>();
	private int totalIncome;

	public Restaurant(String restaurant) {
		this.name = name;
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		if(menus.isEmpty()) {
			System.out.println("Menu kosong..\n");
		}
		System.out.println("List Menu");
		for(Menu menu : menus) {
			menu.showMenu();
		}
	}

	public void showChef() {
		if(chefs.isEmpty()) {
			System.out.println("Saat ini sedang tidak ada chef..\n");
			return;
		}
		System.out.println("List Chef");
		for(Chef chef : chefs) {
			System.out.println("- Chef "+chef.getName());
		}
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		for(Menu menu : menus) {
			Food food = menu.getFood(foodName);
			if(food != null) {
				int price = food.getPrice() * qty;
				visitor.addTotal(price);
				String history = "Telah memasak "+foodName+" sebanyak "+qty+" piring";
				chef.addCookHistory(history);
				totalIncome += price;
				System.out.println(visitor.getName()+" telah memesan "+
						qty+" piring "+food.getName()+" yang dimasak oleh Chef "+
						chef.getName());
				return;
			}
		}
		System.out.println("Makanan "+foodName+" tidak ada di menu");
	}

	public void showTotalIncome() {
		System.out.println("Total pendapatan: "+Main.formatIDR(totalIncome));
	}

}
