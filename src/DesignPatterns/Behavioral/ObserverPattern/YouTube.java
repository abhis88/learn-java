package DesignPatterns.Behavioral.ObserverPattern;

public class YouTube {

    static void main() {
        Channel channel = new Channel();
        Subscriber s1 = new Subscriber("Name 1");
        Subscriber s2 = new Subscriber("Name 2");
        Subscriber s3 = new Subscriber("Name 3");
        Subscriber s4 = new Subscriber("Name 4");
        Subscriber s5 = new Subscriber("Name 5");

        s1.subscribeChannel(channel);
        s2.subscribeChannel(channel);
        s3.subscribeChannel(channel);
        s4.subscribeChannel(channel);
        s5.subscribeChannel(channel);

        channel.subscribe(s1);
        channel.subscribe(s2);
        channel.subscribe(s3);
        channel.subscribe(s4);
        channel.subscribe(s5);

        channel.unsubscribe(s3);

        channel.upload("New Video");
    }
}
