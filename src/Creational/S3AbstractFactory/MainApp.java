package Creational.S3AbstractFactory;

public class MainApp {

    public static void main(String[] args) {

        AbstractFactory computerFactory = FactoryProducer.getFactory(true);

        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();

        Computer computer1 = computerFactory.getComputer("Phone");
        computer1.compute();

        Computer computer2 = computerFactory.getComputer("SmartTv");
        computer2.compute();

    }
}
