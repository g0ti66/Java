package fr.dampierre;

import java.util.Scanner;

public class M2E1 {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 1");
        System.out.println("------------------------------------------------------------");

        System.out.print("Choisir un nombre : ");
        int nombre = clavier.nextInt();
        if (nombre % 2 == 0) {
            System.out.println(nombre + " est pair");
        } else {
            System.out.println(nombre + " est impair.");
        }

        System.out.println("------------------------------------------------------------");

        clavier.close();
    }

}
