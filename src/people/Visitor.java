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
	
	public void showTotalPrice() {
	
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
		
	}
	
}
