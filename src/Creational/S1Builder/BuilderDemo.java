package Creational.S1Builder;

//Builder Pattern used when dealing with complex objects characterized with super big constructors
// to add readability & to avoid mistakes when initializing such big constructors(can easily mistake the order of the params)
//So we'll have a builder class (Static Inner Class) that builds an object without using complex constructors

public class BuilderDemo {

    private long id;
    private String name;
    private String address;
    private long budget;
    private long discountRate;

    //Complex constructor, can easily make mistakes initializing it, hence let's use the Builder Pattern
    public BuilderDemo(long id, String name, String address, long budget, long discountRate) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.budget = budget;
        this.discountRate = discountRate;
    }

    public BuilderDemo() {
    }

    @Override
    public String toString() {
        return "BuilderDemo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", budget=" + budget +
                ", discountRate=" + discountRate +
                '}';
    }

    public static class Builder {

        //same properties as the outer class
        private long id;
        private String name;
        private String address;
        private long budget;
        private long discountRate;

        public Builder(long id) {
            this.id = id;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withBudget(long budget) {
            this.budget = budget;
            return this;
        }

        public Builder withDiscountRate(long discountRate) {
            this.discountRate = discountRate;
            return this;
        }

        //build method - part of the Builder Design pattern
        public BuilderDemo build () {
            BuilderDemo builderDemo = new BuilderDemo();
            builderDemo.id = this.id;
            builderDemo.name = this.name;
            builderDemo.address = this.address;
            builderDemo.budget = this.budget;
            builderDemo.discountRate = this.discountRate;


            return builderDemo;
        }

    }


}




