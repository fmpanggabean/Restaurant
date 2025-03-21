package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> history = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHistory() {
		return history;
	}

	public void setHistory(String string) {
		this.history.add(string);
	}
	
	public void showCookHistory() {
		
		System.out.println("");
		System.out.println(this.name + "'s Cook History :");
		for(String history : this.history) {
			System.out.println("    - " + history);
		}
	}
	
}
