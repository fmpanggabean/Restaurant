package restaurant;

import java.util.ArrayList;

import main.Food;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String restaurant;
	int income = 0;
	private ArrayList<Menu> menus = new ArrayList<>();
	private ArrayList<Chef> chefs = new ArrayList<>();
//	ArrayList<String> strings = new ArrayList<>();
	public Restaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public void addMenu(Menu menu) {
		menus.add(menu);
	}
	public String getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(String restaurant) {
		this.restaurant = restaurant;
	}
	public ArrayList<Menu> getMenus() {
		return menus;
	}
	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}
	public ArrayList<Chef> getChefs() {
		return chefs;
	}
	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}
	public void order(Chef chef, Visitor visitor, String makanan, int jumlah) {
		int total = 0;
		for(Menu m : menus) {
			for(Food f : m.getFoods()) {
				if(f.getMakanan().equals(makanan)) {
					total = jumlah * f.getHarga();
//					System.out.println(f.getMakanan() + ":");
//					System.out.println(total);
					visitor.setPrice(total);
					income += total;
					String transaction = "Chef Name: "+ chef.getChefName() + ", Visitor: " + visitor.getVisitor() + ", Makanan: " + makanan + ", Jumlah: " + jumlah + ", Harga: " + total;
					chef.addHistory(transaction);
				}
			}
		}
	}
	public void addChef(Chef chef) {
		chefs.add(chef);
	}
	
	public void showMenu() {
		System.out.println("Menu: ");
		
		for(Menu m : menus) {
			System.out.println("- " + m.getMenu() + ":");
			for(Food f : m.getFoods()) {
				System.out.println(f.getMakanan() + " : " + f.getHarga());
			}
		}
		System.out.println("");
	}
	
	public void showChef() {
		System.out.println("Chefs: ");
		for(Chef c : chefs) {
			System.out.println(c.getChefName());
		}
		System.out.println("");
	}
	
	public void showTotalIncome() {
		System.out.println("Total Income " + restaurant + " : " + "Rp." + income);
	}
}
