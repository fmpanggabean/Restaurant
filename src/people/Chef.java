package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistory = new ArrayList<>();
	
	public String getName() {
		return name;
	}

	public Chef(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("Chef " + name + "'s Cooking History :");
		for(String cookHistorys : cookHistory) {
			System.out.println("   - " + cookHistorys);
		}
	}

	public void addCookHistory(String details) {
		cookHistory.add(details);
	}
}
