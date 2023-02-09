package Structural.S7FlyweightPattern;

public class Client {

    public static void main(String[] args) {
        InventoryBackend inventoryBackend = new InventoryBackend();

        inventoryBackend.takeOrder("Iphone", 1);
        inventoryBackend.takeOrder("Laptop", 2);
        inventoryBackend.takeOrder("Smart TV", 3);
        inventoryBackend.takeOrder("Iphone", 4);
        inventoryBackend.takeOrder("Laptop", 5);
        inventoryBackend.takeOrder("Smart TV", 6);
        //we ordered the same thing twice with diff order numbers

        inventoryBackend.process();
        System.out.println(inventoryBackend.report());

        /*
        O/P ->
        Order number: 1 contains Iphone
        Order number: 2 contains Laptop
        Order number: 3 contains Smart TV
        Order number: 4 contains Iphone
        Order number: 5 contains Laptop
        Order number: 6 contains Smart TV
        The total number of objects created: 3
         */


        //Only 3 objects are created, hence we are not creating 6 objects , thanks to Flyweight pattern
    }
}
