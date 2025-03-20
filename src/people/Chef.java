package people;

import java.util.ArrayList;

import restaurant.Restaurant;

public class Chef {
	private String name;
	private ArrayList<String> historyCooks = new ArrayList<String>();
	private int totalIncome = 0;
	
	public Chef(String name) {
		this.name = name;
	}

	public void showCookHistory() {
		System.out.printf("\n%s cooks history:\n", this.name);
		for (String history : historyCooks) {
			System.out.printf("- %s\n", history);
		}
		System.out.printf("Total income: %s\n", Restaurant.formatIDR(totalIncome));
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHistory() {
		return historyCooks;
	}

	public void setHistory(ArrayList<String> history) {
		this.historyCooks = history;
	}
	
	public void addCookHistory(String history) {
		this.historyCooks.add(history);
	}

	public int getTotalIncome() {
		return totalIncome;
	}

	public void setTotalIncome(int totalIncome) {
		this.totalIncome += totalIncome;
	}

}
