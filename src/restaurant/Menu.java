package restaurant;

import java.util.ArrayList;

public class Menu{
    private String type;
    private ArrayList<Food> foods = new ArrayList<Food>();

    public Menu(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public void add(Food food){
        foods.add(food);
    }

    public ArrayList<Food> getFoods(){
        return foods;
    }
}