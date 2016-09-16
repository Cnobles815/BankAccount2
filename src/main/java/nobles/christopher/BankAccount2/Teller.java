package nobles.christopher.BankAccount2;

/**
 * Created by christophernobles on 9/15/16.
 */
public class Teller {

    Account userAccount;

    public Teller () {

    }

    public String greeting() {
        return "Hello.";
    }

    public String promptFirstName() {
        String prompt = "Please enter your first name.";
        return prompt;
    }

    public String promptLastName() {
        String prompt = "Please enter your last name.";
        return prompt;
    }

    public void collectFirstName(String userFirstName) {
        String firstName = userFirstName;
    }

    public void collectLastName(String userLastName) {
        String lastName = userLastName;
    }

    public double debit (double debit) {
        double newBalance = userAccount.balance - debit;
        return newBalance;
    }

    public double credit (double credit) {
        double newBalance = userAccount.balance + credit;
        return newBalance;
    }
}
