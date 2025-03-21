package restaurant;

import java.util.ArrayList;
import java.util.List;

import main.Food;
import people.Chef;
import people.Visitor;


public class Restaurant {
	private String name;
	private List<Chef> chefs = new ArrayList<Chef>();
	private List<Menu> menus = new ArrayList<Menu>();
	private int totalIncome = 0;

	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(foodName.equals(food.getName())) {
					chef.addCookHistory("Cooked "+qty+" portion(s) of "+foodName+" for "+visitor.getName());
					visitor.addTotalPrice(qty*food.getPrice());
					totalIncome += qty*food.getPrice();
					return;
				}
			}
		}
		System.out.println("Food was not found in menus!\n");
	}

	public void showMenu() {
		System.out.println(name+"'s Menus: ");
		for (Menu menu : menus) {
			System.out.println("- "+menu.getName());
			for (Food food : menu.getFoods()) {
				System.out.println("  - "+food.getName()+", "+food.getPrice()+"/portion");
			}
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println(name+"'s Chefs: ");
		for (Chef chef : chefs) {
			System.out.println("- "+chef.getName());
		}
		System.out.println();
	}

	public void showTotalIncome() {
		System.out.println(name+"'s Total Income: "+totalIncome);
	}

}
