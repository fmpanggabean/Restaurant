package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> historyChefs = new ArrayList<String>();

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getHistoryChefs() {
		return historyChefs;
	}

	public void setHistoryChefs(ArrayList<String> historyChefs) {
		this.historyChefs = historyChefs;
	}

	public void showCookHistory() {
		System.out.println("");
		System.out.println(this.name+": ");
		for (String hitory : historyChefs) {
			System.out.println(""+hitory+"\n");
		}
	}
	
	
	
}
