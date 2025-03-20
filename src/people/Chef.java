package people;
import java.util.ArrayList;

public class Chef {

	private String name;
	private ArrayList<String> cookHistory = new ArrayList<>();
	public Chef(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void addCookHistory(String history) {
		cookHistory.add(history);
	}

	public void showCookHistory() {
		System.out.println();
		System.out.println("Cook History of " + name);
		for(String history : cookHistory) {
			System.out.println(" - " + history);
		}
	}

}
