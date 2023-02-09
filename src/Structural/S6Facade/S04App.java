package Structural.S6Facade;

public class S04App {

    public static void main(String[] args) {
        S03FacadeClass facadeClass = new S03FacadeClass();

        facadeClass.computerPerformOperation();
        facadeClass.robotPerformOperation();

        /*
        O/P ->
        Computer performs operation!
        Robot performs operation!
         */
    }
}
