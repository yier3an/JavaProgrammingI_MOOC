
import java.util.Scanner;

public class LineByLine
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
                    System.out.println (part [i]);
                }
            }
        } while (!string.isEmpty());
    }
}
