package people;

public class Visitor {
	private String name;
	private int spent = 0;

	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void totalSpent(int quantity) {
		spent += quantity;
	}

	public void showTotalPrice() {
		System.out.println(name + " spent " + spent);
	}
}
