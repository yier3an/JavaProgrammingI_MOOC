
import java.util.Scanner;

public class LastWords
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        String string = "";
        
        do {
            string = scanner.nextLine();

            if (!string.isEmpty())
            {
                String [] part = string.split (" ");

                System.out.println (part [part.length - 1]);
            }
        } while (!string.isEmpty());
    }
}