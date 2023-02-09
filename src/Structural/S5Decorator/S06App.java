package Structural.S5Decorator;

public class S06App {

    public static void main(String[] args) {
        S00Machine machine = new S03Navigation(new S04ParkingAssistant(new S01Car()));
        System.out.println(machine.doOperation());
    }

    /*
    O/P ->
    Car + Parking Assistant + Navigation
     */
}
