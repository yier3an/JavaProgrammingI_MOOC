
import java.util.Scanner;

public class PersonalDetails
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        String string = "";
        String name = "";
        int longest = 0;
        int sum = 0;
        int count = 0;
        
        do {
            string = scanner.nextLine();

            if (!string.isEmpty())
            {
                String [] part = string.split (",");

                sum += Integer.valueOf (part [1]);
                int nameLength = part [0].length();
                count++;

                if (nameLength > longest)
                {
                    longest = nameLength;
                    name = part [0];
                }
            }
        } while (!string.isEmpty());

        double avg = (sum / 1.0) / count;

        System.out.println ("Longest name: " + name);
        System.out.println ("Average of the birth years: " + avg);
    }
}
