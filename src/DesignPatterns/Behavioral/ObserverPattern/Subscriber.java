package DesignPatterns.Behavioral.ObserverPattern;

public class Subscriber {
    String name;
    Channel channel = new Channel();

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(){
        System.out.println("hey, "+name+" video uploaded: "+ channel.title);
    }

    public void subscribeChannel(Channel ch){
        channel = ch;
    }
}
