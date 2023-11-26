import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String [] args)
    {
        // implement here your program that uses the class Item
        ArrayList <Book> bookList = new ArrayList <> ();
        Scanner scanner = new Scanner (System.in);

        String name = "";
        int pages = 0;
        int publishYear = 0;

        do
        {
            System.out.print ("Name: ");
            name = scanner.nextLine();

            if (!name.isEmpty())
            {
                System.out.print ("Pages: ");
                pages = Integer.valueOf (scanner.nextLine());
            
                System.out.print ("Publication year: ");
                publishYear = Integer.valueOf (scanner.nextLine());

                Book b = new Book (name, pages, publishYear);
                bookList.add (b);
            }
            System.out.println();
        } while (!name.isEmpty());

        System.out.print ("What information will be printed? ");
        String info = scanner.nextLine();

        for (Book b : bookList)
        {
            if (info.toLowerCase().equals ("everything"))
                System.out.println (b);
            else if (info.toLowerCase().equals ("name"))
                System.out.println (b.getTitle());
        }
    }
}