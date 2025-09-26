package fr.dampierre;

import java.util.Scanner;

public class M2E5 {

    public static void main(String[] args) {

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 5");
        System.out.println("------------------------------------------------------------");

        String str = "Welcome to string handling tutorial";

        char ch1 = str.charAt(0);

        System.out.println("Character at 0 index is: " + ch1);

        System.out.println("------------------------------------------------------------");

        clavier.close();

    }

}
