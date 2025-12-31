package DesignPatterns.Structural.Composite;

public class CompositeTestClass {

    static void main() {

        //Leaf Components
        Component hardDrive = new Leaf(1000, "HDD");
        Component mouse = new Leaf(2000, "Mouse");
        Component monitor = new Leaf(3000, "Monitor");
        Component ram = new Leaf(4000, "Ram");
        Component cpu = new Leaf(5000, "CPU");

        //Composite Components
        Composite pheri = new Composite("Pheripheral");
        Composite cabinet = new Composite("Cabinet");
        Composite mb = new Composite("MB");
        Composite computer = new Composite("Computer");

        pheri.addComponent(mouse);
        pheri.addComponent(monitor);

        mb.addComponent(cpu);
        mb.addComponent(ram);

        cabinet.addComponent(hardDrive);
        cabinet.addComponent(mb);

        computer.addComponent(cabinet);
        computer.addComponent(pheri);

        System.out.println(pheri.getClass().getName());
        pheri.showPrice();
        computer.showPrice();
    }
}