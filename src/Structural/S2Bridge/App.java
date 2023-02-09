package Structural.S2Bridge;

public class App {

    public static void main(String[] args) {

        //So instead of having separate classes if RedBag & BlueBag, we just have a single class Bag using the Store abstract class
        //Hence reduces the need for creating extra classes, reduces size of the code, & easy readability due to structure
        Bag redBag = new Bag(new Red());
        Bag blueBag = new Bag(new Blue());

        Purse redPurse = new Purse(new Red());
        Purse bluePurse = new Purse(new Blue());

        redBag.getColour();
        blueBag.getColour();

        redPurse.getColour();
        bluePurse.getColour();
    }
}
