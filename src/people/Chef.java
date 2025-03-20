package people;

import java.util.*;

public class Chef {

	private String name;
	private ArrayList<String> cookHistory = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
	}
	
	public void addCookedHistory(String food, int qty) {
		String history = "Cooked " + qty + " "+ food;
		cookHistory.add(history);
	}

	public void showCookHistory() {
		System.out.println(name + "'s Cook History:");
		for(String history : cookHistory) {
			System.out.println("- " + history);
		}
		System.out.println("");
		
	}

}
