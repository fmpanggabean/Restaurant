package people;

import java.util.ArrayList;
import java.util.List;

public class Chef {
	private String name;
	private List<String> history;

	public Chef(String name) {
		this.name = name;
		this.history = new ArrayList<>();
	}

	public String getName() {
		return name;
	}

	public List<String> getHistory() {
		return history;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setHistory(List<String> history) {
		this.history = history;
	}

	public void addHistory(String historyInfo) {
		history.add(historyInfo);
	}

	public void showCookHistory() {
		System.out.println("-- Chef --");
		System.out.printf("- Name : %s\n", this.name);
		System.out.println("Cook History :");
		for (String h : history) {
			System.out.println(h);
		}
		System.out.println();
	}
}
