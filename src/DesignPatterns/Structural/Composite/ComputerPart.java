package DesignPatterns.Structural.Composite;

import java.util.ArrayList;
import java.util.List;

class Leaf implements Component {

    private String name;
    private double price;

    public Leaf(double price, String name) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void showPrice() {
        System.out.println("Name: "+name + ", Price: "+price);
    }
}

class Composite implements Component{

    private String name;
    private List<Component> components = new ArrayList<>();

    public Composite(String name){
        this.name = name;
    }

    public void addComponent(Component c){
        components.add(c);
    }

    @Override
    public void showPrice() {
        System.out.println("*".repeat(10) +name + "*".repeat(10));
        //System.out.println("-".repeat(10));
        for(Component c: components){
            c.showPrice();
        }
    }
}