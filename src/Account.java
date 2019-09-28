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

        //set acc number
        index++;
        this.accountNumber = setAccountNumber();
    }

    protected String setAccountNumber() {
        String lastTwoDigitsOfSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoDigitsOfSsn + uniqueID + randomNumber;
    }

    protected void modifyAccountNumber(String accountType) {
        accountNumber = accountType + accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    //List common methods


    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance;
    }
}
