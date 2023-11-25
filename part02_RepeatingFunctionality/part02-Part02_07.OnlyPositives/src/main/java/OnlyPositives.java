
import java.util.Scanner;

public class OnlyPositives
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int no = 1;

        while (no != 0)
        {
            System.out.println ("Give a number:");
            no = Integer.valueOf (scanner.nextLine ());

            if (no < 0)
            {
                System.out.println ("Unsuitable number");
            }
            else if (no > 0)
            {
                no *= no;
                System.out.println (no);
            }
        }
    }
}
