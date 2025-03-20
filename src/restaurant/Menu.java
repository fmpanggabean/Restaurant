package restaurant;
import  java.util.*;

public class Menu {
    String name;
    List <Food> foods = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Food> getFoods(){
        return foods;
    }

    public void add(Food food){
        foods.add(food);
    }
}