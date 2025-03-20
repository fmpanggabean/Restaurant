package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String> cookHistorys = new ArrayList<String>();
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addCookHistory(String desc) {
		cookHistorys.add(desc);
	}

	public void showCookHistory() {
		System.out.println("Cook History:");
		for (String cookHistory : cookHistorys) {
			System.out.println("\t- " + cookHistory);
		}
	}
	
}
