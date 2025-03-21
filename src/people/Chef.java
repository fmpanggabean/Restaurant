package people;

import java.util.ArrayList;

public class Chef {

	private String name;
	private ArrayList<String> histories = new ArrayList<>();

	public Chef(String name) {
		this.name = name;
		
	}

	public void showCookHistory() {
		System.out.println("");
		System.out.println("Chef " + name + " Cook History:");
		for (String history : histories) {
			System.out.println(history);
		}
	}

	public String getName() {
		return name;
	}

	public void setHistory(String history) {
		histories.add(history);
	}
	
}
