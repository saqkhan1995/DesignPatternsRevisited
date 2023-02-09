package Structural.S2Bridge;

public class Bag extends Store {

    private Colour colour;

    public Bag(Colour colour) {
        this.colour = colour;
    }


    @Override
    public Colour getColour() {
        System.out.println("The colour of the bag is "+ colour.toString());
        return colour;
    }
}
