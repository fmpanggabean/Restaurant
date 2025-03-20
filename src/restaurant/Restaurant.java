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
	private int totalIncome;
	
	public Restaurant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public List<Chef> getChefs() {
		return chefs;
	}
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}

	public void addMenu(Menu m) {
		menus.add(m);
	}

	public List<Menu> getMenus() {
		return menus;
	}

	public void setMenus(List<Menu> menus) {
		this.menus = menus;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setChefs(List<Chef> chefs) {
		this.chefs = chefs;
	}
	

	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public void showMenu() {
		System.out.println("Restaurant : " + name);
		
		System.out.println("\nMenu : ");
		for(Menu m : menus) {
			System.out.println(" " + m.getName());
			for(Food f :m.getFoods()) {
				System.out.println("   > " + f.getName() + " (Price : " + formatIDR(f.getPrice()) + ")");
			}
		}
	}
	
	public void showChef() {
		System.out.println("\nChef : ");
		for(Chef c : chefs) {
			System.out.println(" > " + c.getName());
		}
		System.out.println();
	}
	

	public void order(Chef chef1, Visitor visitor1, String foodName, int amount) {
		String order = visitor1.getName() + " is ordering " + foodName + " from " + chef1.getName() + " for " + amount + " portion.";
		
		orders.add(order);
		chef1.addHistory(amount + " portion of " + foodName);
		
		for(Menu m : menus) {
			for(Food f : m.getFoods()) {
				if(f.getName() == foodName) {
					int income = f.getPrice() * amount;
					visitor1.setTotalPrice(visitor1.getTotalPrice() + + income);
					totalIncome += income;
				}
			}
		}
		System.out.println("" + order);
		
	}
	
	public void showTotalIncome() {
		System.out.println("\nTotal Restaurant Income : " + formatIDR(totalIncome));
	}
	
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}






	
	
	
}
