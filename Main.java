package Aufgabe2;

/**
 * Created by Priscilla on 13.04.2017.
 */
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hallo, bitte gib die Anzahl der Spieler an.");
        String eingabe = scanner.nextLine();
        int anzahlSpieler = Integer.parseInt(eingabe);// String wird in int
        // umgewandelt
        Spiel s = new Spiel(anzahlSpieler);
        s.starten(); // rufe die Methode Starten auf;
        s.spielen();

        scanner.close();
    }
}
