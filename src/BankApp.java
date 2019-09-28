import java.util.LinkedList;
import java.util.List;

public class BankApp {
    /*
    To Do:
        1. Implement checks to prevent withdraw/transfer when funds <= 0
     */

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<>();

        //Create accounts based on data from CSV file
        String fileLocation = "./src/utilities/NewBankAccounts.csv";
        List<String[]> accountHolders = utilities.CSV.read(fileLocation);

        for(String[] accHolder : accountHolders) {
            String name = accHolder[0];
            String ssn = accHolder[1];
            String accountType = accHolder[2];
            double initDeposit = Double.parseDouble(accHolder[3]);

            if(accountType.equalsIgnoreCase("savings")) accounts.add(new Savings(name, ssn, initDeposit));
            else if(accountType.equalsIgnoreCase("checking")) accounts.add(new Checking(name, ssn, initDeposit));
            else System.out.println("Unfortunately our bank does not offer such account type.");

            for(Account account : accounts) {
                System.out.println(account);
                System.out.println("----------------------------");
            }

//            accounts.get((int) (Math.random() * accounts.size())).deposit(1000);
//            accounts.get((int) (Math.random() * accounts.size())).withdraw(500);
//            accounts.get((int) (Math.random() * accounts.size())).transfer("Alex", 1000);


        }

    }

}
