package Structural.S1Adapter;

public class S03bBankAccountAdapter implements S03aBankAccountInfo {

    S01LegacyBankAccount instance;
    S03cPersonalInfoDB dbConnector;

    public S03bBankAccountAdapter(S01LegacyBankAccount instance, S03cPersonalInfoDB dbConnector) {
        this.instance = instance;
        this.dbConnector = dbConnector;
    }


    @Override
    public int getID() {
        return instance.getID();
    }

    @Override
    public String getName() {
        return instance.getName();
    }

    @Override
    public String getEmail() {
        return dbConnector.getEmail();
    }

    @Override
    public Long getAmount() {
        return dbConnector.getAmount();
    }
}
