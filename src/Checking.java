public class Checking extends Account {

    //List specific properties for checking acc
    private int debitCardNum;
    private int debitCardPin;

    //Constructor initialization
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        System.out.println("New Checking acc");
    }

    //List specific methods for checking acc

}
