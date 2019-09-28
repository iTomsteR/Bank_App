public class Savings extends Account {

    //List specific properties to savings acc
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor initialization

    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("1");
    }


    //Common savings acc methods
    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Savings";
    }

}
