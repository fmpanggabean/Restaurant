package people;

import java.util.ArrayList;

public class Chef {

	private String name;
	private ArrayList<String> cookHistory = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void cook(String name, int quantity) {
		cookHistory.add("Cooked " + quantity + " of " + name);
	}

	public void showCookHistory() {
		System.out.println("Chef " + name + "'s Cook History");
		
		for(String history : cookHistory) {
			System.out.println(" - " + history);
		}
		System.out.println("");
	}
	
	
}
