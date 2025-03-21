package people;

public class Visitor {

	private String name;
	private int totalSpend = 0;
	
	public Visitor(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public int getTotalSpend() {
		return totalSpend;
	}

	public void setTotalSpend(int totalSpend) {
		this.totalSpend += totalSpend;
	}

	public void showTotalPrice() {
		
		System.out.printf("%s has purchased Rp.%d\n", name, totalSpend);
		System.out.println("===============================================\n");	
		
	}

}
