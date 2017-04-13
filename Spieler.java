package Aufgabe2;

/**
 * Created by Priscilla on 13.04.2017.
 */
import java.util.Random;

public class Spieler {

    public int spielstand;
    public String name;
    private Random r; // Zufallsobjekt

    public Spieler(String name) // Ein Name soll �bergeben werden
    {
        this.name = name; 		// Wir erzeugen uns einen Spieler
        this.r = new Random(); // wir erzeugen uns ein Zufallsw�rfel
    }

    public int wuerfeln()
    {
        int augenzahl;
        augenzahl = this.r.nextInt(6)+1; // von r aus greifen wir auf nextInt zu; nextInt gibt mir eine Zufallszahl (zw.0 & 5)zur�ck; +1 weil ich ja keine 0 w�rfeln kann;
        return augenzahl;
    }


}
