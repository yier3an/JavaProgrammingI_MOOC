
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics
{
    public static void main (String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        // construct arraylists
        ArrayList <String> homeList = new ArrayList <> ();
        ArrayList <String> visitList = new ArrayList <> ();
        ArrayList <Integer> homePoints = new ArrayList <> ();
        ArrayList <Integer> visitPoints = new ArrayList <> ();

        System.out.print ("File: ");
        String fileName = scanner.nextLine();

        // add info into arraylists
        try (Scanner fileInput = new Scanner (Paths.get (fileName)))
        {
            while (fileInput.hasNextLine())
            {
                String str = fileInput.nextLine();
                String [] part = str.split (",");

                homeList.add (part [0]);
                visitList.add (part [1]);
                homePoints.add (Integer.valueOf (part [2]));
                visitPoints.add (Integer.valueOf (part [3]));
            }
        }
        catch (Exception e)
        {
            System.out.println (e);
        }

        System.out.print ("Team: ");
        String name = scanner.nextLine();

        int gamesCount = 0;
        int wins = 0;
        int losses = 0;

        for (int i = 0; i < homeList.size(); i++)
        {
            String homeTeam = homeList.get (i);
            String visitTeam = visitList.get (i);
            int homePoint = homePoints.get (i);
            int visitPoint = visitPoints.get (i);

            if (homeTeam.equals (name))
            {
                gamesCount++;

                if (homePoint > visitPoint)
                    wins++;
                else
                    losses++;
            }

            if (visitTeam.equals (name))
            {
                gamesCount++;

                if (visitPoint > homePoint)
                    wins++;
                else
                    losses++;
            }
        }

        System.out.println ("Games: " + gamesCount);
        System.out.println ("Wins: " + wins);
        System.out.println ("Losses: " + losses);

        scanner.close();
    }
}