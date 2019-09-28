public abstract class Account implements IBaseRate {

    //List common properties for checking and savings accounts
    private String name;
    private String ssn;
    private double balance;
    private String accountNumber;
    private double rate;


    //Constructor - set base properties & initialize acc

    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        System.out.println("Name: " + name + " SSN: " + ssn + " balance: " + balance);
    }


    //List common methods

}
