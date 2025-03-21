package restaurant;

public class Food {
	private String menu;
	private int price;

	public Food(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}

	public String getName() {
		return menu;
	}

	public void setName(String menu) {
		this.menu = menu;
	}

	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
