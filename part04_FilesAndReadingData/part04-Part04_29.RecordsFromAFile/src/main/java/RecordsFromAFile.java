
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println ("Name of the file:");
        String fileName = scanner.nextLine();

        try (Scanner fileInput = new Scanner (Paths.get (fileName)))
        {
            while (fileInput.hasNextLine())
            {
                String str = fileInput.nextLine();
                String [] part = str.split (",");

                System.out.println (part [0] + ", age: " + part [1] + " years");
            }
        }
        catch (Exception e)
        {
            System.out.println (e);
        }

        scanner.close();
    }
}
