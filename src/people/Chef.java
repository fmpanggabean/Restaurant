package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistorys = new ArrayList<String>();
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String history) {
		cookHistorys.add(history);
	}

	public ArrayList<String> getCookHistorys() {
		return cookHistorys;
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("Cook Historys:");
		for (String string : cookHistorys) {
			System.out.println("- " + name + ": " + string);
		}
	}

}
