
import java.util.Scanner;

public class NumberOfNegativeNumbers
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int no = 1;
        int counter = 0;

        while (no != 0)
        {
            System.out.println ("Give a number:");
            no = Integer.valueOf (scanner.nextLine ());

            if (no < 0)
                counter++;
        }
        System.out.println ("Number of negative numbers: " + counter);
    }
}
