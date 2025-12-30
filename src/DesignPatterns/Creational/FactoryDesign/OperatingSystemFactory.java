package DesignPatterns.Creational.FactoryDesign;

public class OperatingSystemFactory {

    public OS getInstance(String type){
        if (type.equalsIgnoreCase("open"))
            return new Andriod();
        else if(type.equalsIgnoreCase("closed"))
            return new IOS();
        else
            return new Windows();
    }
}
