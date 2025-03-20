package people;

public class Visitor {
	private String name;
	private int totalSpend = 0;
	public Visitor(String name) {
		this.name = name;
	}
	
	public void addTotalSpend(int amount) {
		totalSpend += amount;
	}

	public int getTotalSpend() {
		return totalSpend;
	}

	public void showTotalPrice() {
		System.out.println(name + " total spend: " + totalSpend);
	}
}
