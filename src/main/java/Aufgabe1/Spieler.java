package Aufgabe1;

import java.util.Random;
import java.util.Arrays;

/**
 * Created by Priscilla on 10.04.2017.
 */
public class Spieler {

    private String name;
    private int aktStand=0;
    private Random r;


    public Spieler(String name){

        this.name =name;
    }


    public void wuerfeln(){

        int zufallszahl;
        zufallszahl=(int)(Math.random()*6);
        System.out.println(zufallszahl);
    }
}
