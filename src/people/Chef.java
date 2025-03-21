package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> histories = new ArrayList<String>();

	public Chef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String history) {
		histories.add(history);
	}

	public void showCookHistory() {
		System.out.println("\n" + this.name + "Cook History: ");
		for (String history : histories) {
			System.out.println(history);
		}
	}
	
	
}
