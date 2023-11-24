
import java.util.Scanner;

public class OddOrEven
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        // Write your program here
        System.out.println ("Give a number:");
        int no = Integer.valueOf (scan.nextLine ());

        boolean isEven = (no % 2) == 0;
        String result;

        if (isEven)
        {
            result = "even";
        }
        else
        {
            result = "odd";
        }

        System.out.println ("Number " + no + " is " + result + ".");
    }
}
