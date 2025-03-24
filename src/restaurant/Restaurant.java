package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	private List<Chef> chefs = new ArrayList<Chef>();
	private List<Menu> menus = new ArrayList<Menu>();
	private List<String> orders = new ArrayList<String>();
	private int totalIncome = 0;

	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addChef(Chef c) {
		chefs.add(c);
	}

	public void addMenu(Menu m) {
		menus.add(m);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(List<Chef> chefs) {
		this.chefs = chefs;
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public int getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(int totalIncome) {
		this.totalIncome = totalIncome;
	}

	public void showMenu() {
		System.out.println("Restaurant : " + name);
		
		System.out.println("\nMenus : ");
		for (Menu m : menus) {
			System.out.println("  " + m.getName());
			
			for (Food f : m.getFoods()) {
				System.out.println("    - " + f.getName() + " (Price : " + formatIDR(f.getPrice()) + ")");
			}
		}
	}
	
	public void showChef() {
		System.out.println("\nChefs : ");
		
		for (Chef c : chefs) {
			System.out.println("  - Chef " + c.getName());
		}
		System.out.println();
	}
	
	public void order(Chef chef1, Visitor visitor1, String foodName, int amount) {
		String order = visitor1.getName() + " is ordering Chef " + chef1.getName() + "'s " + foodName + " for " + amount + " portion(s)";
		
		orders.add(order);
		chef1.addHistory(amount + " portion(s) of " + foodName);
		
		for (Menu m : menus) {
			for (Food f : m.getFoods()) {
				if (f.getName() == foodName) {
					int income = f.getPrice() * amount;
					visitor1.setTotalPrice(visitor1.getTotalPrice() + income);
					totalIncome += income;
				}
			}
		}
		System.out.println(order);
	}
	
	public void showTotalIncome() {
		System.out.println("\nTotal Restaurant Income : " + formatIDR(totalIncome));
	}

	
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}

	
	
}
