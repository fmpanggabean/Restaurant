package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String>cookHistory = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
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

	public void setCookHistory(String cookHistory) {
		this.cookHistory.add(cookHistory);
	}

	public void showCookHistory() {
		System.out.println("Chef " + this.name + "'s cook history:");
		for (String history : cookHistory) {
			System.out.println("   - " + history);
		}
		System.out.println();
	}

}
