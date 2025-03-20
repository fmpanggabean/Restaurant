package people;
import java.util.*;
public class Chef {
	private String name;
	private Map<String, Integer> cookHistory = new HashMap<>();;
	
	public Chef(String name) {
		// TODO Auto-generated constructor stub
		this.setName(name);
	}
	
	public void addCookHistory(String name, int qty) {
        cookHistory.put(name, cookHistory.getOrDefault(name, 0) + qty);
    }

    public void showCookHistory() {
    	// TODO Auto-generated method stub
        System.out.println("Cook History of " + name + ":");
        for (Map.Entry<String, Integer> entry : cookHistory.entrySet()) {
            System.out.println("- " + entry.getKey() + " : " + entry.getValue());
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
