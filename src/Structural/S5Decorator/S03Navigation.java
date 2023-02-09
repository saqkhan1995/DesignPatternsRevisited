package Structural.S5Decorator;

public class S03Navigation extends S02CarDecorator{

    public S03Navigation(S00Machine machine) {
        super(machine);
    }
    @Override
    public String doOperation() {
        return machine.doOperation() + addNavgation();
    }

    public String addNavgation() {
        return " + Navigation";
    }
}
