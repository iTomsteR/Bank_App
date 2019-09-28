public abstract class Account implements IBaseRate {

    //List common properties for checking and savings accounts
    private String name;
    private String ssn;
    private double balance;
    private String accountNumber;
    private double rate;
    private static int index = 10000;


    //Constructor - set base properties & initialize acc

    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;
        System.out.println("Name: " + name + " SSN: " + ssn + " balance: " + balance);

        //set acc number
        index++;
        this.accountNumber = setAccountNumber();
    }

    private String setAccountNumber() {
        String lastTwoDigitsOfSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoDigitsOfSsn + uniqueID + randomNumber;
    }


    //List common methods

}
