
import java.util.Scanner;

public class Login
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        System.out.print ("Enter username: ");
        String user = scanner.nextLine();

        System.out.print ("Enter password: ");
        String pw = scanner.nextLine();

        boolean alex = user.equals ("alex") && pw.equals ("sunshine");
        boolean emma = user.equals ("emma") && pw.equals ("haskell");

        if (alex || emma)
            System.out.println ("You have successfully logged in!");
        else
            System.out.println ("Incorrect username or password!");
    }
}
