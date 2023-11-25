
import java.util.Scanner;

public class NumberAndSumOfNumbers
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int no = 1;
        int counter = 0;
        int sum = 0;

        while (no != 0)
        {
            System.out.println ("Give a number:");
            no = Integer.valueOf (scanner.nextLine ());

            if (no != 0)
            {
                counter++;
                sum += no;
            }
        }

        System.out.println ("Number of numbers: " + counter);
        System.out.println ("Sum of the numbers: " + sum);
    }
}
