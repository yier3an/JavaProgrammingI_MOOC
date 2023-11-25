
import java.util.Scanner;

public class SumOfNumbers
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int no = 1;
        int sum = 0;

        while (no != 0)
        {
            System.out.println ("Give a number:");
            no = Integer.valueOf (scanner.nextLine ());

            sum += no;
        }
        System.out.println ("Sum of the numbers: " + sum);
    }
}
