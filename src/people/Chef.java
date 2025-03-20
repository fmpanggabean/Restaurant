package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	private ArrayList<String> histories = new ArrayList<String>();
	
	public void addCookingHistory(Visitor visitor, String makanan, int jumlah) {
		String history = "Cooked for " + visitor.getName() + " (" + makanan + ")" + " (" + jumlah + ")";
		histories.add(history);
	}
	
	public void showCookHistory() {
		System.out.println(name + "'s Cooking History:");
		for(String history : histories) {
			System.out.println("  - " + history);
		}
	}
}
