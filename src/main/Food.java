package main;

public class Food {
	private String makanan;
	private int harga;
	public Food(String makanan, int harga) {
		super();
		this.makanan = makanan;
		this.harga = harga;
	}
	public String getMakanan() {
		return makanan;
	}
	public void setMakanan(String makanan) {
		this.makanan = makanan;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
}
