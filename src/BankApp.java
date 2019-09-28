public class BankApp {

    public static void main(String[] args) {

        Checking check1 = new Checking("John Smith", "123", 1500);
        Savings saving1 = new Savings("Alex Johnson", "456", 1200);
        System.out.println(check1);
        System.out.println(saving1);

        saving1.deposit(1000);
        saving1.withdraw(500);
        saving1.transfer("Alex", 250);

        //Create accounts based on data from CSV file

    }

}
