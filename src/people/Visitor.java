package people;

public class Visitor {
	private String visitor;
	int price = 0;
	public String getVisitor() {
		return visitor;
	}

	public void setVisitor(String visitor) {
		this.visitor = visitor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int total) {
		this.price += total;
	}

	public Visitor(String visitor) {
		this.visitor = visitor;
	}

	public void showTotalPrice() {
		System.out.println("Total Price " + visitor + ":");
		System.out.println(price);
	}

}