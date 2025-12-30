package DesignPatterns.Creational.FactoryDesign;

public class FactoryClass {

    static void main() {

        // tradational way of doing
        // client need to know exactly what OS to ask for
        // not good design as it should be abstracted

        OS os1 = new Andriod();
        os1.spec();

        OS os2 = new IOS();
        os2.spec();

        OS os3 = new Windows();
        os3.spec();

        //Factory Design pattern example

        OperatingSystemFactory osf = new OperatingSystemFactory();
        OS obj = osf.getInstance("open");
        obj.spec();
    }

}
