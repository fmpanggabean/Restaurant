package restaurant;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String name;
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	
	public ArrayList<Menu> getMenus(){
		return menus;
	}
	
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public static String formatIDR(int amount) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
		return formatter.format(amount);
	}
	
	public void showMenu() {
		System.out.println(name + "'s menu:");
		for(Menu menu : menus) {
			System.out.println(menu.getJenisMakanan() + ":");
			for(Food food : menu.getFoods()) {
				System.out.println("  - " + food.getMakanan() + " - " + formatIDR(food.getHarga()));
			}
		}
	}
	
	public void showChef() {
		System.out.println(name + "'s beloved chef:");
		for(Chef chef : chefs) {
			System.out.println("  - " + chef.getName());
		}
	}
	
	private int totalIncome;
	
	public void order(Chef chef, Visitor visitor, String makanan, int jumlah) {
		int flag = 0;
		int harga = 0;
		for(Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getMakanan().equals(makanan)) {
					flag = 1;
					harga = food.getHarga();
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("There is no such food in this restaurant!");
		}
		else {
			chef.addCookingHistory(visitor, makanan, jumlah);
			visitor.setTotalPrice(harga * jumlah);
			totalIncome += (harga * jumlah);
		}
	}
	
	public void showTotalIncome() {
		System.out.println(name + "'s Total Income: " + formatIDR(totalIncome));
	}
}
