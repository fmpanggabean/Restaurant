package people;

import java.util.ArrayList;

public class Chef {
	private String nama;
	private ArrayList<String>orders = new ArrayList<String>();
	
	public Chef(String nama) {
		this.nama=nama;
	}

	public ArrayList<String> getOrders() {
		return orders;
	}

	public void setOrders(ArrayList<String> orders) {
		this.orders = orders;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public void setOrders(String string) {
		this.orders.add(string);
	}

	public void showCookHistory() {
		System.out.println("=============================================================================================");
		System.out.println("                                            INVOICE");
		System.out.println("=============================================================================================");
		for (String string : orders) {
			System.out.println(string);
		}
		
	}

}
