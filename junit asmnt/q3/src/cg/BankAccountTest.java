package cg;

import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class BankAccountTest {
	BankAccount b;
    @Test
    void withdraw() {
        b=new BankAccount();
        //balance is 21000
        assertThrows(InsufficientFundsException.class,()->b.withdraw(30000));
        assertThrows(InsufficientFundsException.class,()->b.withdraw(40000));
        assertThrows(InsufficientFundsException.class,()->b.withdraw(25000));

//        This Test fails since InsufficientFundsException is not thrown
//        assertThrows(InsufficientFundsException.class,()->b.withdraw(100));
    }

}
