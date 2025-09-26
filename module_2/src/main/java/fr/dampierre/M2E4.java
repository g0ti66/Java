package fr.dampierre;

import java.util.Scanner;

public class M2E4 {

    public static void main(String[] args) {

        // Avoir une source (src/) avec mes exos

        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 2");
        System.out.println("------------------------------------------------------------");

        System.out.print("Veuillez choisir une couleur (Initial uniquement) : ");
        String couleur = clavier.next();

        if (couleur.equals("r") || couleur.equals("R")) {
            System.out.println("Vous avez choisi le rouge.");
        } else if (couleur.equals("b") || couleur.equals("B")) {
            System.out.println("Vous avez choisi le bleu.");
        } else if (couleur.equals("v") || couleur.equals("V")) {
            System.out.println("Vous avez choisi le vert.");
        } else {
            System.out.println("Connais pas.");
        }

        System.out.println("------------------------------------------------------------");

        clavier.close();
    }

}