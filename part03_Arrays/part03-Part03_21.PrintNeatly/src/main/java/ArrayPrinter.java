
public class ArrayPrinter
{
    public static void main (String [] args)
    {
        // You can test your method here
        int [] array = {5, 1, 3, 4, 2};

        printNeatly (array);
    }

    public static void printNeatly (int [] array)
    {
        // Write some code in here
        int length = array.length;
        String print = "";

        for (int i = 0; i < length; i++)
        {
            print += array [i];

            if (i < length - 1)
            {
                print += ", ";
            }
        }
        System.out.println (print);
    }
}
