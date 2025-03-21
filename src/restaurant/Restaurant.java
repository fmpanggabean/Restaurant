package restaurant;

import java.util.ArrayList;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private int income = 0;

	public Restaurant(String name) {
		this.name = name;
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

	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
	}

	public void showMenu() {
		System.out.println("Menus:");
		for (Menu menu : menus) {
			System.out.println("   - " + menu.getName() + ":");
			for (Food food : menu.getFoods()) {
				System.out.println("      ~ " + food.getName() + "(Price: " + food.getPrice() + ")");
			}
			System.out.println();
		}
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public void showChef() {
		System.out.println("Chef:");
		for (Chef chef : chefs) {
			System.out.println("   - " + chef.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String foodName, int qty) {
		String order = "Chef " + chef.getName() + " membuat " + qty + " " + foodName + " untuk " + visitor.getName();
		chef.setCookHistory(order);
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(foodName.equals(food.getName())) {
					visitor.setTotalPrice(visitor.getTotalPrice() + qty * food.getPrice());
					income += qty * food.getPrice();
				}
			}
		}
	}

	public void showTotalIncome() {
		System.out.println(this.name + "'s total income: Rp. " + income);
	}

	

	

}
