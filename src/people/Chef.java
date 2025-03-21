package people;

import java.util.ArrayList;

public class Chef {
	private String name;
	private ArrayList<String> historyOfOrders = new ArrayList<String>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chef(String name) {
		super();
		this.name = name;
	}
	
	public void addHistoryOfOrder (String massage) {
		historyOfOrders.add(massage);
	}

	public void showCookHistory() {
		historyOfOrders.forEach((h) -> {
			System.out.println(h);
		});
	}
}
