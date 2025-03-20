package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	List<Chef> chefs = new ArrayList<Chef>();
	List<Menu> menus = new ArrayList<Menu>();
	List<String> orders = new ArrayList<String>();
	private int totalIncome;
	
	public List<String> getOrders() {
		return orders;
	}

	public void setOrders(List<String> orders) {
		this.orders = orders;
	}

	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addChef(Chef c) {
		chefs.add(c);
	}

	public void addMenu(Menu m) {
		menus.add(m);
	}

	public void showMenu() {
		System.out.println("Restaurant : " + name);
		System.out.println("\nMenu : " );
		for(Menu m : menus){
			System.out.println(m.getName());
			for(Food f : m.getFoods()) {
				System.out.println("   ~ " + f.getName() + " (Price :" + formatIDr(f.getPrice()) + ")");
			}
		}
	}
	
	public static String formatIDr(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);

	}

	public void showChef() {
		System.out.println("\nChef : ");
		for(Chef c : chefs) {
			System.out.println(" ~ " + c.getName());
		}
		System.out.println();
	}

	public void order(Chef chef, Visitor visitor, String name, int amount) {
		String order = visitor.getName() + " is ordering " + name + " amount " + amount + " cooked by " + chef.getName();
		
		orders.add(order);
		chef.addHistory(amount + " portion(s) " + name);
		
		for(Menu m : menus) {
			for(Food f : m.getFoods()) {
				if(f.getName() == name) {
					int income = f.getPrice() * amount;
					
					visitor.setTotalPrice(visitor.getTotalPrice() + income);
					totalIncome += income;
				}
			}
		}
		System.out.println(order);
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

	public void showTotalIncome() {
		System.out.println("\nTotal Income : " + formatIDr(totalIncome));
		
	}
}
