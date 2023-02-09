package Structural.S7FlyweightPattern;

public class Product {

    private final String name;  //No setter, so we just assign this value in the constructor phase

    // so this object here is immutable, whenever we have multiple orders for the same product,
    //we don't need to create multiple product objects, hence optimizing memory footprint of the program

    public Product(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                '}';
    }
}
