
import java.util.Scanner;

public class AgeOfTheOldest
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        String string = "";
        int oldest = 0;
        
        do {
            string = scanner.nextLine();

            if (!string.isEmpty())
            {
                String [] part = string.split (",");
                int age = Integer.valueOf (part [1]);

                if (age > oldest)
                {
                    oldest = age;
                }
            }
        } while (!string.isEmpty());

        System.out.println ("Age of the oldest: " + oldest);
    }
}