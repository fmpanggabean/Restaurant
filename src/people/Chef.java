package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookHistories = new ArrayList<>();
	
	public Chef(String name) {
		this.name = name;
	}
	
	public void addCookHistory(String cookHistory) {
		cookHistories.add(cookHistory);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println(name + " Cook History : ");
		
		for (String cookHistory : cookHistories) {
			System.out.println(cookHistory);
		}
		
	}
	 
	public String getName() {
		return name;
	}
	
	public ArrayList<String> getCookHistories(){
		return cookHistories;
	}

}
