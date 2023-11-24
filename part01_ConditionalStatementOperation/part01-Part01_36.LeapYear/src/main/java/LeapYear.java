
import java.util.Scanner;

public class LeapYear
{
    public static void main (String [] args)
    {
        Scanner scan = new Scanner (System.in);

        System.out.print ("Give a year: ");
        int year = Integer.valueOf (scan.nextLine ());

        String isLeap;

        if (year % 4 != 0)
        {
            isLeap = "is not";
        }
        else
        {
            if (year % 100 != 0 || year % 400 == 0)
            {
                isLeap = "is";
            }
            else
            {
                isLeap = "is not";
            }
        }

        System.out.println ("The year " + isLeap + " a leap year");
    }
}
