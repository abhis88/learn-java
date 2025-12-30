package DesignPatterns.Creational.BuilderPattern;

public class PhoneBuilder {
    String os;
    int ram;
    String processor;
    double screensize;
    int battery;

    public PhoneBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public PhoneBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public PhoneBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public PhoneBuilder setScreensize(double screensize) {
        this.screensize = screensize;
        return this;
    }

    public PhoneBuilder setBattery(int battery) {
        this.battery = battery;
        return this;
    }

    public Phone getPhone(){
        return new Phone(os, ram, processor, screensize, battery);
    }
}
