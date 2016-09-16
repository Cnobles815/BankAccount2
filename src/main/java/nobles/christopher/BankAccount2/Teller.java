package nobles.christopher.BankAccount2;
import java.util.Scanner;
/**
 * Created by christophernobles on 9/15/16.
 */
public class Teller {

    Account userAccount;
    AccountManager accountManager;
    Scanner userInput = new Scanner(System.in);

    public Teller() {

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

    public double debit(double debit) {
        double newBalance = userAccount.balance - debit;
        return newBalance;
    }

    public double credit(double credit) {
        double newBalance = userAccount.balance + credit;
        return newBalance;
    }

    public int inputAccountNumber(int password) {

        password = userInput.nextInt();

        if (password == userAccount.getAcctNum()) {
            System.out.println("This worked.");

        }
        return 5;
    }

    public int searchAccountNumber() {
        return accountManager.accountSearch();
    }
}
