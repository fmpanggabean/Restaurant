package people;

import java.util.ArrayList;

public class Chef {
	private String chefName;
	private ArrayList<String> strings = new ArrayList<>();
	public Chef(String chefName) {
		this.chefName = chefName;
	}
	
	public String getChefName() {
		return chefName;
	}

	public void setChefName(String chefName) {
		this.chefName = chefName;
	}
	
	public void addHistory(String transaction) {
		strings.add(transaction);
	}

	public void showCookHistory() {
		for(String s : strings) {
			System.out.println(s);
		}
	}
	
	public ArrayList<String> getStrings() {
		return strings;
	}

	public void setStrings(ArrayList<String> strings) {
		this.strings = strings;
	}


}
