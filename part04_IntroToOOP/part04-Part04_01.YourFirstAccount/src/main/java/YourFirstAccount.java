
public class YourFirstAccount
{
    public static void main (String [] args)
    {
        // Do not touch the code in Account.java
        // Write your program here
        Account account = new Account ("arto", 100.0);
        System.out.println (account);

        account.deposit (20.0);
        System.out.println (account);
    }
}
