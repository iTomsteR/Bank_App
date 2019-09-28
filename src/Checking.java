public class Checking extends Account {

    //List specific properties for checking acc
    private int debitCardNum;
    private int debitCardPin;

    //Constructor initialization
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("2");
        System.out.println("New Checking acc");
        System.out.println("Account Number: " + super.getAccountNumber());
    }

    //List specific methods for checking acc

}
