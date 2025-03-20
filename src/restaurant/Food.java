package restaurant;

public class Food {
	private String nama;
	private int harga;
	public Food(String nama, int harga) {
		super();
		this.nama = nama;
		this.harga = harga;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	
}
