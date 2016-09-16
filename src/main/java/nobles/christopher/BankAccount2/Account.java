package nobles.christopher.BankAccount2;
import java.security.SecureRandom;

/**
 * Created by christophernobles on 9/15/16.
 */
public class Account {
    public enum AccountStatus {OPEN, CLOSED, FREEZE};
    public enum AccountType{CHECKING, SAVING, INVESTMENT};

    private int acctNum = 0;
    private SecureRandom accountNumber = new SecureRandom();


    double balance = 0;

    public int accountNumberCreation() {
        int acctnum = accountNumber.nextInt(99999999);
        //System.out.println(acctnum);
        return acctnum;
    }

    public int getAcctNum() {
        return acctNum;
    }

    public void setAcctNum(int acctNum) {
        this.acctNum = acctNum;
    }

}
