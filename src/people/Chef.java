package people;
import java.util.*;
public class Chef {
	private String name;
	private List<String> historis = new ArrayList<>();

	public Chef(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void addHistory(String nameFood, int jml) {
		historis.add("  - "+nameFood+", Sebanyak "+jml);
	}
	
	public void showCookHistory() {
		System.out.println("\n=============Cook History================");
		System.out.println("#Chef: "+name);
		for(String str:historis) {
			System.out.println(str);
		}
		System.out.println("=========================================");
	}
	
}
