package people;

import java.util.ArrayList;

public class Chef {
	public String nameChef;
	public ArrayList<String> historyCook = new ArrayList<String>();

	public Chef(String nameChef) {
		super();
		this.nameChef = nameChef;
	}
	

	public Chef(ArrayList<String> historyCook) {
		super();
		this.historyCook = historyCook;
	}

	public void addHistory(String transaction) {
		historyCook.add(transaction);
	}


	public void showCookHistory() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println(nameChef);
		for (String history : historyCook) {
			System.out.println(history);
		}
	}
	
	
}
