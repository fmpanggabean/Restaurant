package people;

public class Visitor {
	private String name;
	private int totalSpent = 0;
	
	public Visitor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}

	public void addSpent(int price) {
		this.totalSpent += price;
	}

	public void showTotalPrice() {
		System.out.println();
		System.out.println("Total Price "+ this.name +" = " + totalSpent);
	}
	
}
