package people;

public class Visitor {
	private String name;
	private double totalPrice;
	public Visitor(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.setTotalPrice(0);
	}

	public void showTotalPrice() {
		// TODO Auto-generated method stub
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addToTotal(double price) {
		// TODO Auto-generated method stub
		totalPrice += price;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
