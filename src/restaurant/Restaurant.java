package restaurant;

import java.util.LinkedHashSet;
import java.util.Set;

import main.FormatUtils;
import people.Chef;
import people.Visitor;

public class Restaurant {

	private String name;
	private Set<Chef> chefs = new LinkedHashSet<>();
	private Set<Menu> menus = new LinkedHashSet<>();
	int totalIncome = 0;

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
		System.out.println(name + " Menus:");
		menus.forEach(Menu::show);
	}

	public void showChef() {
		System.out.println(name + " Chefs:");
		chefs.forEach(Chef::show);
	}

	public void order(Chef chef, Visitor visitor, String food, int quantity) {
		Food f = getFood(food);
		Order order = new Order(visitor, f, quantity);
		
		chef.order(order);
		visitor.order(order);
		totalIncome += order.getPrice();
	}

	public void showTotalIncome() {
		System.out.println(name + " Total Income: " + FormatUtils.formatIDR(totalIncome));
	}
	
	private Food getFood(String name) {
		for (Menu m : menus) {
			Food f = m.getFood(name);
			if (f != null) return f;
		}
		return null;
	}

}
