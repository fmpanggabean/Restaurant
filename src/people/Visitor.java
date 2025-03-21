package people;

public class Visitor {
	private String name;
	private int totalPrice;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Visitor(String name) {
		super();
		this.name = name;
	}
	
	

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice += totalPrice;
	}

	public void showTotalPrice() {
		
		System.out.println("> Name : "+name+" || Total Price : " + totalPrice);
	}
	
	
}
