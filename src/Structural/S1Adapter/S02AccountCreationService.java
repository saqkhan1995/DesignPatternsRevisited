package Structural.S1Adapter;

public class S02AccountCreationService {

    private int ID;
    private String name;

    // The LegacyBakAccount is not having the below information,
    //Hence we'll need an "adapter" to cater to the new fields below ->BankAccountAdapter.class
    private String email;
    private Long amount;

    public S02AccountCreationService(int ID, String name, String email, Long amount) {
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.amount = amount;
    }

    public void createAccount() {
        System.out.println("Account has been created");
    }
}
