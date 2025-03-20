package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> cookRecord = new ArrayList<String>();
	
	public ArrayList<String> getCookRecord() {
		return cookRecord;
	}

	public void setCookRecord(ArrayList<String> cookRecord) {
		this.cookRecord = cookRecord;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chef(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println(this.name + "'s Cooking History:");
		for (String string : cookRecord) {
			System.out.println(string);
		}
		
	}
}
