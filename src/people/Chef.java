package people;

import java.util.HashMap;
import java.util.Map;



public class Chef {
    private String name;
    private Map<String, Integer> his;

    public Chef(String name) {
        this.name = name;
        this.his = new HashMap<>(); 
    }

    public String getName() {
        return name;
    }

    public void addCookHistory(String name, int qty) {
        his.put(name, his.getOrDefault(name, 0) + qty);
    }

    public void showCookHistory() {
        System.out.println("===== " + name + "'s Cook History =====");
        for (Map.Entry<String, Integer> entry : his.entrySet()) {
            System.out.println("- " + entry.getKey() + " (" + entry.getValue() + ")");
        }
        
    }
}