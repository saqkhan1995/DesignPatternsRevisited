package Creational.S2Factory;

public class MainApp {

    public static void main(String[] args) {

        ComputerFactory computerFactory = new ComputerFactory();

        Computer computer = computerFactory.getComputer("Laptop");
        computer.compute();

        Computer computer1 = computerFactory.getComputer("Phone");
        computer1.compute();

        Computer computer2 = computerFactory.getComputer("SmartTv");
        computer2.compute();

    }
}
