package restaurant;

import java.util.ArrayList;

import main.Main;
import people.Chef;
import people.Visitor;

public class Restaurant {
	private String nama;
	private ArrayList<Menu>menus = new ArrayList<Menu>();
	private ArrayList<Chef>chefs = new ArrayList<Chef>();
	private int totalIncome = 0;
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Restaurant(String nama) {
		this.nama=nama;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}

	public void showMenu() {
		System.out.println("            "+this.nama);
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				System.out.println("Nama Menu: " + food.getNama()+" Harga: " + Main.formatIDR(food.getHarga()));
			}
			System.out.println();
			
		}
	}

	public void showChef() {
		System.out.println(" ++Chef " + this.nama + ":");
		for (Chef chef : chefs) {
			System.out.println(chef.getNama());
		}
		System.out.println();
	}

	public void addChef(Chef chef) {
		this.chefs.add(chef);
	}

	public void order(Chef chef, Visitor visitor, String nama, int kuantiti) {
		for (Menu menu : menus) {
			for (Food food : menu.getFoods()) {
				if(food.getNama().equals(nama)) {
					chef.setOrders("Nama Chef: " + chef.getNama() +" || "+ " Pelanggan: "+" || "+ visitor.getNama()+" || "+" Nama Makanan: "+food.getNama()+" || "+" Jumlah Order: "+kuantiti);
					visitor.setTotal((kuantiti * food.getHarga()) + visitor.getTotal());
					this.totalIncome += (kuantiti * food.getHarga());
				}
			}
		}
		
	}

	public void showTotalIncome() {
		System.out.println("Total Income " + this.nama + " : " + Main.formatIDR(totalIncome)); 
	}

}
