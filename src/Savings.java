import java.util.Random;

public class Savings extends Account {

    //List specific properties to savings acc
    private int safetyDepositBoxId;
    private int safetyDepositBoxKey;


    public Savings(String name, String ssn, double initDeposit) {
        super(name, ssn, initDeposit);
        super.modifyAccountNumber("1");
        setSafetyDepositBox();
    }

    @Override
    public void setRate() {
        super.setRate(getBaseRate() - .35);
    }

    private void setSafetyDepositBox() {
        Random r=new Random();
        int randomNumber = r.nextInt(900);
        safetyDepositBoxId = randomNumber + (int) Math.pow(10, 2);
        safetyDepositBoxKey = randomNumber + (int) Math.pow(10, 3);
    }

    @Override
    public String toString() {
        return "\nAccount Type: Savings" + super.toString() +
                "\nSafety Deposit Box ID: " + safetyDepositBoxId +
                "\nSafety Deposit Box Key: " + safetyDepositBoxKey;
    }

}
