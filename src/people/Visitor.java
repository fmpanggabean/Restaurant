package people;

public class Visitor {
	private String name; 
	private int totalSpent; 
	
	public Visitor(String name) {
		this.name = name; 
	}

	public String getName() {
		return name;
	}

	public int getTotalSpent() {
		return totalSpent;
	}

	public void setTotalSpent(int totalSpent) {
		this.totalSpent = totalSpent;
	}
	
	public void showTotalPrice() {
		System.out.println("Visitor '" + name + "' has spent a total of " + totalSpent); 
	}
	
}
