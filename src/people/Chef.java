package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String>history;
	
	public Chef(String name) {
		this.name = name;
		this.history = new ArrayList<String>();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getHistory() {
		return history;
	}

	public void setHistory(List<String> history) {
		this.history = history;
	}

	public void addHistory(String transaction) {
		history.add(transaction);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println(this.name);
		for (String historys : history) {
			System.out.println(historys);
		}
	}
	
}
