
import java.util.Scanner;

public class CarryOn
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        String loop = "yes";

        while (!loop.toLowerCase ().equals ("no"))
        {
            System.out.println ("Shall we carry on?");
            loop = scanner.nextLine ();
        }
    }
}
