
import java.util.Scanner;

public class AVClub
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

                for (int i = 0; i < part.length; i++)
                {
                    if (part [i].contains ("av")) {
                        System.out.println (part [i]);
                    }
                }
            }
        } while (!string.isEmpty());
    }
}
