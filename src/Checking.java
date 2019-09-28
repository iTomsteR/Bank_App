public class Checking extends Account {

    //List specific properties for checking acc
    private int debitCardNum;
    private int debitCardPin;

    //Constructor initialization
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("2");
    }

    //List specific methods for checking acc


    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Checking";
    }
}
