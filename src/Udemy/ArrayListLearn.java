package Udemy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearn {

    record GroceryItem(String name, String type, int count){
        public GroceryItem(String name){
            this(name, "DAIRY", 1);
        }
    }


    static void main() {
        GroceryItem[] groceryArray = new GroceryItem[3];

        groceryArray[0] = new GroceryItem("milk");
        groceryArray[1] = new GroceryItem("apples", "PRODUCE", 6);
        groceryArray[2] = new GroceryItem("5 oranges", "PRODUCE", 5);
        System.out.println(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> objectList = new ArrayList<>();
        objectList.add(new GroceryItem("Butter"));
        objectList.add(new GroceryItem("Yogurt"));

        //using ArrayList index
        objectList.add(0, new GroceryItem("Butter", "DIARY", 1));
        System.out.println(objectList);

        //using Set index
        objectList.set(0, new GroceryItem("Butter", "DIARY", 1));
        System.out.println(objectList);

        //using delete
        objectList.remove(0);
        System.out.println(objectList);

        String[] items = {"apples", "bananas", "eggs"};
        List<String> list = List.of(items);
        //list.add("orange"); //Error because List is immutable (cannot be modified)
        System.out.println(list.getClass().getName());

        ArrayList<String> groceries = new ArrayList<>(list); //mutable (can be modified)
        groceries.add("oranges");

        ArrayList<String> nextList = new ArrayList<>(List.of("pickles", "mustard", "cheese"));
        System.out.println(nextList);

        groceries.addAll(nextList);
        System.out.println(groceries);



    }

}
