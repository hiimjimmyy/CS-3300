import java.util.*;


public class account {
    int balance;
    int accountNumber;

    account()
    {
        balance = 0;
        accountNumber = assignAccoutnNumbers();
    }

    public int assignAccoutnNumbers()
    {
        Random randomObj = new Random();
        int randomValue = randomObj.nextInt(10000000000);
        return randomValue;
    }

    public getAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }


}
