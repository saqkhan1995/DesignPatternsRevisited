package Creational.S3AbstractFactory;

public class PortableFactory extends AbstractFactory{
    @Override
    public Computer getComputer(String computerType) {
        if (computerType.equalsIgnoreCase("Laptop")) {
            return new Laptop();
        } else if (computerType.equalsIgnoreCase("Phone")) {
            return new Phone();
        }
            return null;

    }
}
