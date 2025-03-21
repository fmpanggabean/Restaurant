package restaurant;
import java.util.*;

public class Menu {
    String category;
    List<String> foodNames = new ArrayList<>();
    List<Integer> foodPrices = new ArrayList<>();

    public Menu(String category) {
        this.category = category;
    }

    public void add(Food food) {
        foodNames.add(food.getName());
        foodPrices.add(food.getPrice());
    }

    public List<String> getFoodNames() {
        return foodNames;
    }

    public List<Integer> getFoodPrices() {
        return foodPrices;
    }

    public void showMenu() {
        System.out.println("- " + category);
        for (int i = 0; i < foodNames.size(); i++) {
            System.out.println("    - " + foodNames.get(i) + " Price: " + foodPrices.get(i));
        }
    }
}

