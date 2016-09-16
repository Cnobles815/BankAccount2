package nobles.christopher.BankAccount2;

import org.junit.Test;
import org.junit.Assert.*;

import static org.junit.Assert.assertEquals;

/**
 * Created by christophernobles on 9/15/16.
 */
public class TellerTESTS {

    Teller teller = new Teller();
    Account userAccount = new Account();

    @Test
    public void greetingTEST(){
        String expectedValue = "Hello";
        String actualValue = teller.greeting();
        assertEquals("The value should be" , expectedValue , actualValue);
    }
    @Test
    public void promptFirstNameTEST() {
        String expectedValue = "Please enter your first name.";
        String actualValue = teller.promptFirstName();
        assertEquals("The return should be \"Please enter your first name.\"" , expectedValue , actualValue);
    }
    @Test
    public void promptLastNameTEST() {
        String expectedValue = "Please enter your last name.";
        String actualValue = teller.promptLastName();
        assertEquals("The return should be \"Please enter your last name.\"" , expectedValue , actualValue);
    }
    @Test
    public void debitTEST() {
        double expectedValue = -5;
        double actualValue = userAccount.balance - teller.debit(5);
        assertEquals("The value should be -5" , expectedValue , actualValue);
    }
    @Test
    public void creditTEST() {
        double expectedValue = 5;
        double actualValue = userAccount.balance + teller.credit(5);
        assertEquals("The value should be 5" , expectedValue , actualValue);
    }
}
