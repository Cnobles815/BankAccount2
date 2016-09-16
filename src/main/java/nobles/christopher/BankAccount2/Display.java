package nobles.christopher.BankAccount2;
import java.util.Scanner;
/**
 * Created by christophernobles on 9/15/16.
 */
public class Display {
    Scanner userInput = new Scanner(System.in);
    Account userAccount;
    Checking userChecking;
    Saving userSaving;
    Investment userInvestment;
    Teller teller;

    //public String dis


    public String mainMenu(){
        System.out.println(teller.greeting());
        System.out.println(teller.promptFirstName());
        teller.collectFirstName(userInput.next());
        System.out.println(teller.promptLastName());
        teller.collectLastName(userInput.next());

        return null;
    }



}
