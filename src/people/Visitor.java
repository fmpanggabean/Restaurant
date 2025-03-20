package people;

import main.Main;

public class Visitor {
	private String nama;
	private int total;
	
	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Visitor(String nama) {
		this.nama=nama;
	}

	public void showTotalPrice() {
		System.out.println("Customer: " + this.nama);
		System.out.println("Total: "+ Main.formatIDR(total));
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
		
	}

}
