package Aufgabe1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 * Created by Priscilla on 10.04.2017.
 */
public class TestSpiel {

    public static void main(String[] args) {

     int a = 0;
     int b = 0;
     Random r = new Random();
     while (a <= b){
         a = r.nextInt(6)+1;
         b = r.nextInt(6)+1;

     }

    }
}
