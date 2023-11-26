
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection
{
    public static void main (String [] args)
    {
        // implement here your program that uses the class Item
        ArrayList <PersonalInformation> infoCollection = new ArrayList <> ();
        Scanner scanner = new Scanner (System.in);

        String fname = "";
        String lname = "";
        String id = "";

        do
        {
            System.out.print ("First name: ");
            fname = scanner.nextLine();

            if (!fname.isEmpty())
            {
                System.out.print ("Last name: ");
                lname = scanner.nextLine();
            
                System.out.print ("Identification number: ");
                id = scanner.nextLine();

                PersonalInformation pi = new PersonalInformation (fname, lname, id);
                infoCollection.add (pi);
            }
            
            System.out.println();
        } while (!fname.isEmpty());

        for (PersonalInformation pi : infoCollection)
            System.out.println (pi.getFirstName() + " " + pi.getLastName());
    }
}
