package nobles.christopher.BankAccount2;
import java.security.SecureRandom;

/**
 * Created by christophernobles on 9/15/16.
 */
public class Account {
    public enum AccountStatus {OPEN, CLOSED, FREEZE};
    public enum AccountType{CHECKING, SAVING, INVESTMENT};

    private int acctNum = 0;
    private SecureRandom accountNumber;

    double balance = 0;

    public SecureRandom createAccountNum () {


    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

}
