
import java.util.Scanner;

public class NumberOfStrings
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = "";
        int count = 0;

        do
        {
            str = scanner.nextLine();

            if (!str.equals ("end"))
            {
                count++;
            }
            System.out.println();
        } while (!str.equals ("end"));

        System.out.println (count);
    }
}
