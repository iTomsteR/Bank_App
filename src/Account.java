import java.util.Random;

public abstract class Account implements IBaseRate {

    //List common properties for checking and savings accounts
    private String name;
    private String ssn;
    private double balance;
    private String accountNumber;
    private double rate;
    private static int index = 10000;



    public Account(String name, String ssn, double initDeposit) {
        this.name = name;
        this.ssn = ssn;
        balance = initDeposit;

        //set acc number
        index++;
        this.accountNumber = setAccountNumber();

        setRate();
    }

    protected String setAccountNumber() {
        String lastTwoDigitsOfSsn = ssn.substring(ssn.length() - 2, ssn.length());
        int uniqueID = index;
        Random r=new Random();
        int randomNumber = r.nextInt(900) + (int) Math.pow(10, 3);
        return lastTwoDigitsOfSsn + uniqueID + randomNumber;
    }

    protected void modifyAccountNumber(String accountType) {
        accountNumber = accountType + accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    protected void setRate(double rate) {
        this.rate = rate;
    }

    public abstract void setRate();


    public void deposit(double amount) {
        balance += amount;
        System.out.println("\nDepositing " + amount + "$");
        printBalance();
    }

    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("\nWithdrawing " + amount + "$");
        printBalance();
    }

    public void transfer(String destination, double amount) {
        balance -= amount;
        System.out.println("\nTransferring " + amount + "$ to " + destination);
        printBalance();
    }

    public void compountRate() {
        double compountRate = balance * (rate/100);
        balance += compountRate;
        System.out.println("\nCompound Interest Rate: " + compountRate + "$");
        printBalance();
    }

    private void printBalance() {
        System.out.println("Your new balance is: " + balance + "$");
    }


    @Override
    public String toString() {
        return "\nName: " + name +
                "\nAccount Number: " + accountNumber +
                "\nBalance: " + balance +
                "\nRate: " + rate + "%";
    }
}
