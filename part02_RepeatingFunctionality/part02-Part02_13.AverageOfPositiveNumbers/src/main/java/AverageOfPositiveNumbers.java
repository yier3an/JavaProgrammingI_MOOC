
import java.util.Scanner;

public class AverageOfPositiveNumbers
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

            if (no > 0)
            {
                counter++;
                sum += no;
            }
        }

        if (counter > 0)
        {
            double avg = (sum / 1.0) / counter;
            System.out.println ("Average of the numbers: " + avg);
        }
        else
        {
            System.out.println ("Cannot calculate the average");
        }   
    }
}
