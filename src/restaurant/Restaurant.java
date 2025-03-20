package restaurant;

import java.util.ArrayList;
import java.text.NumberFormat; 
import java.util.Locale;

import people.Chef;
import people.Visitor; 


public class Restaurant {
	
	public static String formatIDR(int amount) { 
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("id", "ID")); 
        return formatter.format(amount); 
    } 
	
	private String nama;
	private ArrayList<Menu>menus = new ArrayList<Menu>();
	private ArrayList<Chef>chefs = new ArrayList<Chef>();
	private int totalIncome = 0;
	
	
	public Restaurant(String nama) {
		super();
		this.nama = nama;
	}

	public void addMenu(Menu menu) {
		menus.add(menu);
		
	}

	public void showMenu() {
		for(Menu m : menus) {
			System.out.println("========================================");
			System.out.println(m.getType());
			System.out.println("========================================");
			for(Food f : m.getFoods()) {
				System.out.println("- " + f.getNama() + "(Rp. " + formatIDR(f.getHarga()) + ")" );
			}
		}
		
	}

	public void addChef(Chef chef) {
		chefs.add(chef);
		
	}

	public void showChef() {
		System.out.println("========================================");
		int count = 1;
		System.out.println("Presenting Our Chefs : ");
		for(Chef c : chefs) {
			System.out.println(count + "." + c.getName());
			count+=1;
		}
		
	}

	public void order(Chef chef1, Visitor visitor, String nama, int amount) {
		String text = chef1.getName() + " just cooked " + amount + " " + nama + ".";
		chef1.addHistory(text);
//		chef1.getOrders().add(visitor1 + " Bought " +amount +" " + nama + ".");
		int flag = 0;
		for(Menu m : menus) {
			for(Food f : m.getFoods()) {
				if(f.getNama().equals(nama)) {
					flag = 1;
					int harga = f.getHarga() * amount;
					totalIncome += harga;
					int sekarang = visitor.getAmount();
					sekarang += harga;
					visitor.setAmount(sekarang);
				}
			}
		}
		if(flag == 0) {
			System.out.println(nama+ " tidak ditemukan!");
		}
	}

	public void showTotalIncome() {
		System.out.println("========================================");
		System.out.println(nama+ " Total Income : " + formatIDR(totalIncome));
		System.out.println("========================================");
	}
	
	

}
