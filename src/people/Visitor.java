package people;

import java.util.ArrayList;
import java.util.List;

import format.Formatting;

public class Visitor {

	private String name;
	private int total = 0;
	private List<String> transactions = new ArrayList<>();
	
	public Visitor(String name) {
		this.name = name;
	}

	public void setTotal(int total) {
		this.total += total;
	}

	public void showTotalPrice() {
		System.out.println("Name : " + name);
		System.out.println("Total Price : "+ Formatting.formatIDR(total));
		System.out.println("Transacion History :");
		
		for( String transaction : transactions ) {
			System.out.println("- "+ transaction);
		}
		System.out.println("=================================");
	}

	public void setTransactions( String transaction) {
		transactions.add(transaction);
	}

}
