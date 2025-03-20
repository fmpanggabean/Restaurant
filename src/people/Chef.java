package people;

import java.util.*;

public class Chef {
	private String name;
	private List<String> cookingHistory = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void addCookHistory(String history) {
		cookingHistory.add(history);
	}

	public void showCookHistory() {
		System.out.printf("Chef %s's Cooking History:\n", name);
		
		if (cookingHistory.size() < 1) {
			System.out.printf("Chef %s has no cooking history!\n", name);
			return;
		}
		
		for (String history: cookingHistory) {
			System.out.printf("  - %s\n", history);
		}
	}
	
}
