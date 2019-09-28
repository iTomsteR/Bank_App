import java.util.List;

public class BankApp {

    public static void main(String[] args) {

        Checking check1 = new Checking("John Smith", "123", 1500);
        Savings saving1 = new Savings("Alex Johnson", "456", 1200);
        System.out.println(check1);
        System.out.println(saving1);

        saving1.deposit(1000);
        saving1.withdraw(500);
        saving1.transfer("Alex", 250);
        saving1.compountRate();

        //Create accounts based on data from CSV file

        String fileLocation = "./src/utilities/NewBankAccounts.csv";
        List<String[]> accountHolders = utilities.CSV.read(fileLocation);
        for(String[] accHolder : accountHolders) {
            String name = accHolder[0];
            String ssn = accHolder[1];
            String accountType = accHolder[2];
            double initDeposit = Double.parseDouble(accHolder[3]);
            System.out.println(name + " " + ssn + " " + initDeposit);

            if(accountType.equalsIgnoreCase("savings")) System.out.println("Savings Account opened");
            else if(accountType.equalsIgnoreCase("checking")) System.out.println("Checking Account opened");
            else System.out.println("Unfortunately our bank does not offer such account type.");

        }

    }

}
