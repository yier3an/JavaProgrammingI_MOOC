
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        ArrayList <String> list = new ArrayList <> ();

        while (true)
        {
            String input = scanner.nextLine();

            if (input.equals (""))
            {
                break;
            }

            list.add (input);
        }

        System.out.print ("Search for? ");
        String search = scanner.nextLine();

        boolean found = false;

        for (String name : list)
        {
            if (name.equals (search))
                found = true;
        }

        if (found == true)
            System.out.println (search + " was found!");
        else
            System.out.println (search + " was not found!");
    }
}
