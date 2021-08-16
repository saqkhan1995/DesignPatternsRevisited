package Creational.S3AbstractFactory;

public class Phone implements Computer {

    @Override
    public void compute() {
        System.out.println("Phone Computes");
    }
}
