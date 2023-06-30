

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * The test class AccountTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class AccountTest
{
    /**
     * Default constructor for test class AccountTest
     */
    public AccountTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @BeforeEach
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @AfterEach
    public void tearDown()
    {
    }

    @Test
    public void test_payOut()
    {
        Account account = new Account(1234, "Huber");
        assertEquals(true, account.payOut(1400));
        System.out.println(account);
    }

    @Test
    public void test_payIn()
    {
        Account account = new Account(1234, "Huber");
        assertEquals(true, account.payIn(1300));
        System.out.println(account);
    }

    @Test
    public void test_transfer()
    {
        Account account1 = new Account(1234, "Huber");
        Account account2 = new Account(4711, "Maier");
        assertEquals(true, account1.transfer(account2, 1100));
        System.out.println(account1);
        System.out.println();
        System.out.println(account2);
    }
}



