package Structural.S1Adapter;

public class S04App {

    public static void main(String[] args) {
        S01LegacyBankAccount legacyBankAccount = new S01LegacyBankAccount(1, "John Connor");

        //Won't work due to missing parameters !
        /*S02AccountCreationService accountCreationService =
                new S02AccountCreationService(legacyBankAccount.getID(), legacyBankAccount.getName(), Missing, Missing);*/

        S03cPersonalInfoDB personalInfoDB = new S03cPersonalInfoDB();
        personalInfoDB.setName("John Connor");
        personalInfoDB.setEmail("john@connor.com");
        personalInfoDB.setAmount(1000L);

        //Using Adapter to bridge legacy application with our current app/service
        S03bBankAccountAdapter bankAccountAdapter = new S03bBankAccountAdapter(legacyBankAccount, personalInfoDB);

        //Now we can use the service successfully linking the legacy application with our App using "Adapter" pattern
        S02AccountCreationService accountCreationService =
                new S02AccountCreationService(bankAccountAdapter.getID(), bankAccountAdapter.getName(),
                        bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());

        accountCreationService.createAccount();
    }
}
