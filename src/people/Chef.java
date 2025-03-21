package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {

	private String name;
	private List<String> cookHistories = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.println("\n<" + name + ">" + " Cooking History:");
		for(String cookHistory : cookHistories) {
			System.out.println("   -" + cookHistory);
		}
	}

	public String getName() {
		return name;
	}

	public void addCookHistory(String cookHistory) {
		cookHistories.add(cookHistory);
	}
	
	
}
