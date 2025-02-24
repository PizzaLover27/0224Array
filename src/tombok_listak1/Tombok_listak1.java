/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tombok_listak1;

/**
 *
 * @author User
 */
public class Tombok_listak1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 2;
        int b = 3;
                
        //Tömb 2
        //lineáris: ([1][2][3][4]......)
        //fix méretűek
        //Indexelés
        /*
        [10 3 5 7 9] => 5 elemű
        0. 1 2 3 4 => elemszám -1
        5. index --> hiba
        */
        
        //Tömb létrehozása
        //típus[] neve = new típus [maxelemszám];
        int[] szamok = new int[2];
        // ilyenkor 0-kat tartalmaz
        
        szamok[0] = a; // tömb első eleme = 'a' értékben lévő elem
        szamok[1] = b; //tömb második eleme
      //szamok[2] = 4; // ez eg hibás sor, mivel csak 2 elemű!
      
        System.out.printf("számok[0] = $d", szamok[0]);
        System.out.printf("szamok[1] = $d", szamok[1]);
        
        //tömb elemszáma, hossza
        int hossz = szamok.length;
        System.out.println("A számok tömb hossza: " + hossz);
        
        /*
        float[]
        int[]
        String[]
        double[]
        char[]
        object[]
        bool[]
        */
        String szo = "almafa";
        char[] szo_bontva = new char[6];
        szo_bontva = szo.toCharArray();
        
        //létrehozás
        int[] t = new int[3];
        t[0] = 3;
        t[1] = 2;
        t[2] = 9;
        int eredmeny = t[0] + t[1] + t[2];
        System.out.println("Összeg " + eredmeny);
        
        //String tömb
        String[] szavak = new String[3];
        szavak[0] = "alma";
        szavak[1] = "körte";
        szavak[2] = "eper";
        
        
        //konkrét értékek az indexen
        String[] szavak2 = ["alma", "körte", "eper"]; //3. tömv
        
        
        
        
        
        
        
        
}}
