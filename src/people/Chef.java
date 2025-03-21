package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistory = new ArrayList<String>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public void cook(String name, int quantity) {
		this.cookHistory.add(name + " x" + quantity);
	}
	
	public void showCookHistory() {
		System.out.println("\nCooking history of " + this.name + ":");
		for(String cook : cookHistory) {
			System.out.println("- " + cook);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public ArrayList<String> getCookHistory() {
		return cookHistory;
	}

	public void setCookHistory(ArrayList<String> cookHistory) {
		this.cookHistory = cookHistory;
	}
}
