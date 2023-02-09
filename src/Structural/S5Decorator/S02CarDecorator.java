package Structural.S5Decorator;

public class S02CarDecorator implements S00Machine{

    S00Machine machine;  // doesn't have to private/encapsulated as we need this obj in the concrete impls

    public S02CarDecorator(S00Machine machine) {
        this.machine = machine;
    }

    @Override
    public String doOperation() {
        return machine.doOperation();
    }
}
