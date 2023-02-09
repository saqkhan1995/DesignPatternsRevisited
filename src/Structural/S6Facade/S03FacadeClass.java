package Structural.S6Facade;

public class S03FacadeClass {

    private S02aComputer computer;
    private S02bRobot robot;

    S03FacadeClass() {
        this.computer = computer;
        this.robot = robot;
    }

    public void computerPerformOperation() { computer.performOperation();}

    public void robotPerformOperation() { robot.performOperation();}
}
