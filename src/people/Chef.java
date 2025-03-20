package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> histories = new ArrayList<>();

	public Chef(String name) {
		this.setName(name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHistories() {
		return histories;
	}

	public void setHistories(ArrayList<String> histories) {
		this.histories = histories;
	}
	
	public void addHistory(String history) {
		histories.add(history);
	}

	public void showCookHistory() {
		System.out.println("Cooking History");
		System.out.println("Chef Name: " + this.name);
		for (String string : histories) {
			System.out.println(string);
		}
		System.out.println();
	}

}
