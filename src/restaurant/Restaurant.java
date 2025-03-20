package restaurant;

import java.util.ArrayList;

import main.Food;
import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String nama;
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private ArrayList<Chef> chefs = new ArrayList<>();
	int totalIncome = 0;

	public Restaurant(String nama) {
		
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}

	public void showMenu() {
		System.out.println("==================|" + this.nama + "|==================");
		for (Menu menu : menus) {
			System.out.println("====" + menu.getMenu() + ": ");
			for(Food food : menu.getFoods()) {
				System.out.println("-" + food.getName() + "(Harga: " + Main.formatIDR(food.getPrice())+ ")");
			}
		}
		
	}

	public void showChef() {
		System.out.println("\n ==== List Chef di " + this.nama +" ======");
		for (Chef chef : chefs) {
			System.out.println("- Nama chef: " + chef.getName());
		}
		
	}

	public void order(Chef chef, Visitor visitor, String namaMenu, int quantity) {
		for (Menu menu : menus) {
			for(Food food : menu.getFoods()) {
				if(food.getName().equals(namaMenu)) {
					chef.setOrderHistory("Nama Chef: " + chef.getName() + ", Nama visitor: " + visitor.getName() + " Nama Menu: " + food.getName() + " ,Kuantiti: " + quantity);
					visitor.setTotalPrice((quantity * food.getPrice()) + visitor.getTotalPrice());
					totalIncome += (quantity * food.getPrice());
				}
			}
		}
	}

	public void showTotalIncome() {
		System.out.println("===================================");
		System.out.println("|Total pendapatan: " + Main.formatIDR(totalIncome)+ "|");
		System.out.println("===================================");
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
		
	}
	

}
