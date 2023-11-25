
import java.util.Scanner;

public class AreWeThereYet
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int no = 0;

        while (no != 4)
        {
            System.out.println ("Give a number:");
            no = Integer.valueOf (scanner.nextLine ());
        }
    }
}
