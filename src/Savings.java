public class Savings extends Account {

    //List specific properties to savings acc
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;

    //Constructor initialization

    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        System.out.println("NEW saving acc");
    }


    //Common savings acc methods

}
