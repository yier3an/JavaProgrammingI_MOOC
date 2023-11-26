import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        // implement here your program that uses the class Item
        ArrayList <TelevisionProgram> programs = new ArrayList <> ();
        Scanner scanner = new Scanner (System.in);

        String name = "";
        int duration = 0;

        do
        {
            System.out.print ("Name: ");
            name = scanner.nextLine();

            if (!name.isEmpty())
            {
                System.out.print ("Duration: ");
                duration = Integer.valueOf (scanner.nextLine());

                TelevisionProgram tp = new TelevisionProgram (name, duration);
                programs.add (tp);
            }
            System.out.println();
        } while (!name.isEmpty());

        System.out.print ("Program's maximum duration?: ");
        int max = Integer.valueOf (scanner.nextLine());

        for (TelevisionProgram tp : programs)
        {
            if (tp.getDuration() <= max)
                System.out.println (tp);
        }
    }
}
