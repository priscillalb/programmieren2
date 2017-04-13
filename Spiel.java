package Aufgabe2;

/**
 * Created by Priscilla on 13.04.2017.
 */
import java.util.Scanner;

public class Spiel {

    public int anzahlSpieler;
    public Spieler[] spieler; // Spieler ist der Datentyp; [] da drin wollen wir
    // die Spieler sammeln;hier erst deklariert;
    private Scanner scanner; // gibt uns die Eingabe des Spielers ein

    public Spiel(int anzSpieler) // anzSpieler brauche ich am Anfang, damit ich
    // wei� mit wievielen ich spiele
    {
        this.anzahlSpieler = anzSpieler; // speichert wieviele Spieler ich denn
        // habe
        this.spieler = new Spieler[this.anzahlSpieler];
        this.scanner = new Scanner(System.in);

    }

    public void starten() {
        for (int i = 0; i < this.spieler.length; i++) // i steht f�r Index zum
        // Hochz�hlen;++1 in den
        // n�chsten Index
        {
            System.out.println("Bitte gib den Namen von Spieler " + (i + 1)
                    + " an.");// i+1, um den spieler mit Spieler0 nicht zu
            // verwirren;
            String name = scanner.nextLine(); // gibt mir an was der Spieler
            // eingegeben hat
            Spieler s = new Spieler(name); // Spieler erstellt
            this.spieler[i] = s;
        }
    }

    public void spielen() {
        boolean gewonnen = false;
        int IndexAktSpieler = 0; // fangen in Array Schachtel 0 an
        // eine Runde von einem Spieler
        while (!gewonnen) {
            boolean anDerReihe = true;
            int rundenpunkte = 0;
            // Wurf
            while (anDerReihe) {
                int aktWurf = this.spieler[IndexAktSpieler].wuerfeln(); // aus array
                // Spieler
                // w�hlen
                // und der
                // soll
                // w�rfeln
                System.out.println(this.spieler[IndexAktSpieler].name + " hat eine "
                        + aktWurf + (" gew�rfelt"));
                System.out.println();

                if (aktWurf == 6) {
                    IndexAktSpieler = spielerwechsel(IndexAktSpieler); // code nochmal genutzt, deswegen refactor->change method->spielerwechsel genannt
                    anDerReihe = false;
                    System.out.println(this.spieler[IndexAktSpieler].name
                            + " ist an der Reihe");
                } else {
                    rundenpunkte = rundenpunkte + aktWurf;

                    if(rundenpunkte + spieler[IndexAktSpieler].spielstand >= 50)
                    {
                        gewonnen = true;
                    }
                    else {
                        System.out.println("Punkte dieses Runde: "+rundenpunkte);
                        System.out.println("Spielstand: "+this.spieler[IndexAktSpieler].spielstand);
                        System.out.println("Willst du weiterspielen? J/N");
                        System.out.println();

                        boolean richtigeEingabe = true;
                        do
                        {
                            String eingabe = scanner.nextLine();// was antwortet der
                            // Spieler
                            if (eingabe.equalsIgnoreCase("J")) {
                                // weiterspielen
                            } else if (eingabe.equalsIgnoreCase("N")) {
                                // abbrechen
                                this.spieler[IndexAktSpieler].spielstand = this.spieler[IndexAktSpieler].spielstand + rundenpunkte;
                                IndexAktSpieler = spielerwechsel(IndexAktSpieler);
                                anDerReihe = false;
                                System.out.println("Abbruch.Anderer Spieler.");
                            } else {
                                System.out.println("Bitte erneut eingeben");
                                richtigeEingabe = false;
                            }

                        }while(!richtigeEingabe);
                    }

                }
            }


        }
        //Text wenn einer gewonnen hat
        System.out.println("Gewonnen hat: "+this.spieler[IndexAktSpieler].name);

    }

    private int spielerwechsel(int aktSpieler) {
        aktSpieler++;
        if (aktSpieler == anzahlSpieler) {
            aktSpieler = 0; // wenn ich bei meiner AnzahlPersonen
            // angekommen bin fang ich wieder von 0
            // an
        }
        return aktSpieler;
    }

}
