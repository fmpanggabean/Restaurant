package people;

public class Visitor {

	private String name;
	private int totalPrice = 0;
	
	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addPrice(int price) {
		totalPrice += price;
	}

	public void showTotalPrice() {
		System.out.println();
		System.out.println("Name: " + name + ", Total Price: " + totalPrice);
		
	}

}
