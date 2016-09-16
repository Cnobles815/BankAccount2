package nobles.christopher.BankAccount2;
import java.util.ArrayList;

/**
 * Created by christophernobles on 9/15/16.
 */
public class AccountManager {
    Account userAccount;

   ArrayList<Integer> accountList = new ArrayList<Integer>();

    public int accountSearch () {

        int accountNumber = userAccount.getAcctNum();
        int x = 0;

        for (int x = 0; x < accountList.size(); x++)
        {accountNumber = accountList.get(x);}
        return accountList.get(x);
    }

}
