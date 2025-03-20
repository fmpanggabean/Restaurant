package people;



public class Visitor {
	private String name;
	private double totalPrice;

	

	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void showTotalPrice() {
		System.out.println("Name: " + name + "Order: ");
		

		
		System.out.println("Total price: Rp."+ totalPrice);
		
		
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public void addOrder(double price) {

		totalPrice += price;
		
	}

}
