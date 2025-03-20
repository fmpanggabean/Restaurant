package restaurant;

public class Food {
	private String name;
	private double price;
	
	public Food(String name, double price) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setPrice(price);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
