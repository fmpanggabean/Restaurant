package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String> cookHistory = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addCookHistory(String history) {
		cookHistory.add(history);
	}

	public void showCookHistory() {
		System.out.println(name+"'s cook history:");
		for (String string : cookHistory) {
			System.out.println("- "+string);
		}
		System.out.println();
	}
}

