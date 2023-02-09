package Structural.S1Adapter;

public class S01LegacyBankAccount {

    private int ID;
    private String name;

    public S01LegacyBankAccount(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    /*public void setID(int ID) {
        this.ID = ID;
    }*/

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/
}
