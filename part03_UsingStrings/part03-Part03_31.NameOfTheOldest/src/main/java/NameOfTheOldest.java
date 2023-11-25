
import java.util.Scanner;

public class NameOfTheOldest
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        String string = "";
        int oldest = 0;
        String name = "";
        
        do {
            string = scanner.nextLine();

            if (!string.isEmpty())
            {
                String [] part = string.split (",");
                int age = Integer.valueOf (part [1]);

                if (age > oldest)
                {
                    oldest = age;
                    name = part [0];
                }
            }
        } while (!string.isEmpty());

        System.out.println ("Name of the oldest: " + name);
    }
}