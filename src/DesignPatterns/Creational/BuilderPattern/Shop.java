package DesignPatterns.Creational.BuilderPattern;

public class Shop {
    static void main() {

        //tradational way of creating a new phone where you need to pass
        //all the parameters to get the object. If you want to customize it
        // one by one, that option is not there by default;
        Phone phone = new Phone("IOS", 32, "QualComm", 32.0, 100);
        System.out.println(phone);

        //Builder Pattern is better in such scenariors
        Phone phone1 = new PhoneBuilder().setOs("Andriod").setRam(32).getPhone();
        System.out.println(phone1);
    }
}
