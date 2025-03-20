package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String> histories = new ArrayList<String>();
	
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void showCookHistory() {
		System.out.println("\n" + name + " history");
		for(String s : histories) {
			System.out.println(" ~ " + s);
		}
	}

	public List<String> getHistories() {
		return histories;
	}

	public void setHistories(List<String> histories) {
		this.histories = histories;
	}
	
	public void addHistory(String h) {
		histories.add(h);
	}
}
