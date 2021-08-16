package Creational.S3AbstractFactory;

public class FactoryProducer {

    public static AbstractFactory getFactory (boolean portable) {
        if (portable) {
            return new PortableFactory();
        } else {
            return new ComputerFactory();
        }
    }
}
