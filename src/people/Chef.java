package people;

import java.util.ArrayList;

import restaurant.Menu;

public class Chef {

	private String name;
	ArrayList<String>foodhistories = new ArrayList<String>();
	ArrayList<Menu> menus = new ArrayList<Menu>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String foodHistories) {
		foodhistories.add(foodHistories);
	}

	public void showCookHistory() {
		for (String history : foodhistories) {
			System.out.println(history);
		}
	}
	

}
