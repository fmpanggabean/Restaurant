package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistorys = new ArrayList<String>();
 
	public Chef(String name) {
		super();
		this.name = name;
	}

	public ArrayList<String> getCookHistorys() {
		return cookHistorys;
	}

	public void setCookHistorys(ArrayList<String> cookHistorys) {
		this.cookHistorys = cookHistorys;
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

	public void showCookHistory() {
		System.out.println("Cook History:");
		for (String string : cookHistorys) {
			System.out.println(" " + name + " " + string);
		}
	}
	
	
	
}
