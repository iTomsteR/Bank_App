public class Savings extends Account {

    //List specific properties to savings acc
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor initialization

    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("1");
        setSafetyDepositBox();
    }

    private void setSafetyDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }

    //Common savings acc methods
    @Override
    public String toString() {
        return "\nAccount Type: Savings" + super.toString() +
                "\nSafety Deposit Box ID: " + safetyDepositBoxId +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey;
    }

}
