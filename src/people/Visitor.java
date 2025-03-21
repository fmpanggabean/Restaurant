package people;

import helper.Format;

public class Visitor {
	private String name;
	private int spent;
	
	public String getName() {
		return name;
	}

	public Visitor(String name) {
		this.name = name;
	}

	public void showTotalPrice() {
		System.out.println(name + "'s" + " total bill : " + Format.formatIDR(spent));
	}

	public void setSpent(int spent) {
		this.spent += spent;
	}

}
