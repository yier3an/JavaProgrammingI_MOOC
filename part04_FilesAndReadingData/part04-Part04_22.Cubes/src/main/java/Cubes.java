
import java.util.Scanner;

public class Cubes
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = "";

        do
        {
            str = scanner.nextLine();

            if (!str.equals ("end"))
            {
                int no = Integer.valueOf (str);
                System.out.println (no * no * no);
            }
            System.out.println();
        } while (!str.equals ("end"));
    }
}
