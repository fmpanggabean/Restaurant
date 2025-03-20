package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String> history = new ArrayList<String>();
	
	public List<String> getHistory() {
		return history;
	}

	public void setHistory(List<String> history) {
		this.history = history;
	}

	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addHistory(String h) {
		history.add(h);
	}

	public void showCookHistory() {
		System.out.println(name + " History : ");
		for(String s : history) {
			System.out.println("  > " + s);
		}
	}
	
}
