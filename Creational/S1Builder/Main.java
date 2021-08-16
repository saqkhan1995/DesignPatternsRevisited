package Creational.S1Builder;

public class Main {

    public static void main(String[] args) {
        BuilderDemo simpleObj = new BuilderDemo(1L, "Tim Cruise", "Tsushima Japan", 100L, 2L);
        BuilderDemo simpleObj2 = new BuilderDemo(2L, "Andrew Garfield", "Tsushima Japan", 2L, 100L);

        //Chances of making mistakes is reduced with explicit setter/initialization method names
        BuilderDemo builderObject = new BuilderDemo.Builder(1L)
                .withName("Tom Cruise")
                .withAddress("221 Baker Street")
                .withBudget(20L)
                .withDiscountRate(2L)
                .build();

        System.out.println("Without Builder-----------------------");
        System.out.println(simpleObj.toString());

        System.out.println("With Builder-----------------------");
        System.out.println(builderObject.toString());
    }
}
