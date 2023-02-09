package Structural.S5Decorator;

public class S04ParkingAssistant extends S02CarDecorator{

    public S04ParkingAssistant(S00Machine machine) {
        super(machine);
    }
    @Override
    public String doOperation() {
        return machine.doOperation() + addParkingAssistant();
    }

    public String addParkingAssistant() {
        return " + Parking Assistant";
    }
}
