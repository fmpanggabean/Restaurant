package restaurant;

import java.util.ArrayList;

import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String nama;
	private ArrayList<Chef> chefs = new ArrayList<Chef>();
	private ArrayList<Menu> menus = new ArrayList<Menu>();
	private int totalIncome = 0;
	
	public Restaurant(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}

	public ArrayList<Chef> getChefs() {
		return chefs;
	}

	public void setChefs(ArrayList<Chef> chefs) {
		this.chefs = chefs;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public int getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(int totalIncome) {
		this.totalIncome = totalIncome;
	}

	public void addMenu(Menu menu) {
		if(menus == null) return;
		this.menus.add(menu);
	}

	public void showMenu() {
		int j = 1;
		System.out.println("+-------------------------------------+");
		System.out.println("|             Manu Makanan            |");
		System.out.println("+-------------------------------------+");
		
		for (Menu menu : menus) {
			System.out.println(" " + j + ". " + menu.getName()) ;
			j++;
			for (Food foods : menu.getFoods()) {
				System.out.println("    - " + foods.getName() + " (" + (Main.formatIDR(foods.getPrice())) + ")");
			}
			System.out.println("+-------------------------------------+");
		}
		System.out.println();
	}

	public void showChef() {
		System.out.println("+-------------------------------------+");
		System.out.println("|              List Chefs             |");
		System.out.println("+-------------------------------------+");
		
		for (Chef chef : chefs) {
			System.out.println(" - Name : " + chef.getName());
		}
		System.out.println("+-------------------------------------+");
		System.out.println("");
	}
	
	public void order(Chef chef, Visitor visitor, String namaMenu, int byk) {
		Food food = null;
		for (Menu menu : menus) {
			for (Food f: menu.getFoods()) {
				if(f.getName().equals(namaMenu)) {
					food = f;
					break;
				};
			}
		}
		
		if(food == null) {
			System.out.println("Food named " + namaMenu + " not found");
			return;
		};
		
		Integer totalPrice = food.getPrice() * byk;
		totalIncome += totalPrice;
		chef.getHistory().add(food);
		chef.getBanyak().add(byk);
		visitor.addPayment(totalPrice);
	}

	public void showTotalIncome() {
		System.out.println();
		System.out.printf("Total Income %s's restaurant : %s \n", this.nama , (Main.formatIDR(totalIncome)));
	}
	
	
	
	
	
	

}
