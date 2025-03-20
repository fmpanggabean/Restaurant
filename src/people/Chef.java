package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistories;

	public Chef(String name) {
		this.name = name;
		this.cookHistories = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.println("===== SHOW COOK HISTORY =====");
		System.out.println("Chef " + this.name + "'s Cook Histories:");
		for (String cookHistory : cookHistories) {
			System.out.println("  - " + cookHistory);
		}
		System.out.println();
	}

	public void addFoodHistory(String food) {
		this.cookHistories.add(food);
	}
}
