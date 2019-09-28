import java.util.Random;

public class Checking extends Account {

    //List specific properties for checking acc
    private long debitCardNum;
    private int debitCardPin;

    //Constructor initialization
    public Checking(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("2");
        setDebitCard();
    }

    @Override
    public void setRate() {
        super.setRate(getBaseRate() * .25);
    }

    private void setDebitCard() {
        Random r=new Random();
        int randomNumber = r.nextInt(900);
        debitCardNum = (long) (Math.random() * Math.pow(10, 12));
        debitCardPin = randomNumber + (int) Math.pow(10, 3);

    }

    //List specific methods for checking acc


    @Override
    public String toString() {
        return "\nAccount Type: Checking" + super.toString() +
                "\nDebit Card Number: " + debitCardNum +
                "\nDebit Card Pin: " + debitCardPin;
    }
}
