package people;
import java.util.*;

public class Chef {
	private String name;
	private List<String> cookHistory = new ArrayList<>();
	
	public void showCookHistory() {
		System.out.println(name + ":");
		for(int i = 0; i < cookHistory.size(); i++) {
			System.out.println("- " + cookHistory.get(i));
		}
		System.out.println();
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
	public List<String> getCookHistory() {
		return cookHistory;
	}
	public void setCookHistory(List<String> cookHistory) {
		this.cookHistory = cookHistory;
	}
}
