package main;

public class Food {
	private String makanan;
	private int harga;
	
	public Food(String makanan, int harga) {
		this.makanan = makanan;
		this.harga = harga;
	}
	
	public String getMakanan() {
		return makanan;
	}
	
	public int getHarga() {
		return harga;
	}
}
