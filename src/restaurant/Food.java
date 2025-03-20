package restaurant;

public class Food {
	private String name;
	private Integer price;
	
	public Food(String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public Integer getPrice() {
		return price;
	}
	
	
	
}
