package Udemy.AbstractClassess;

public abstract class Animal {

    private String type;
    private String size;
    private double weight;

    public Animal(String type, String size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }


    //abstract methods cannot be defined in abstract class
    //sub-class is supposed to implement them.
    //private access modifier for abstract method is illegal

    public abstract void move(String speed);

    public abstract void makeNoise();

}
