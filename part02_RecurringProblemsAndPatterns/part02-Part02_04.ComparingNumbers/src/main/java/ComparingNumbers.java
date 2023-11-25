
import java.util.Scanner;

public class ComparingNumbers
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner (System.in);

        int first = Integer.valueOf (scanner.nextLine ());
        int second = Integer.valueOf (scanner.nextLine ());

        String compare = "";

        if (first > second)
            compare = " is greater than ";
        else if (first < second)
            compare = " is smaller than ";
        else
            compare = " is equal to ";

        System.out.println (first + compare + second);
    }
}
