package Creational.S3AbstractFactory;

public class Laptop implements Computer {

    @Override
    public void compute() {
        System.out.println("Laptop Computes");
    }
}
