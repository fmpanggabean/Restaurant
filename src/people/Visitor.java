package people;

public class Visitor {
	private String name;
	private Integer totalPrice = 0;
	
	public void showTotalPrice() {
		System.out.println("Total price: " + totalPrice);
	}

	public Visitor(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(Integer totalPrice) {
		this.totalPrice = totalPrice;
	}
}
