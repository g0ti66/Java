package fr.dampierre;

import java.util.Scanner;

public class M1E2 {

    public static void main(String[] args) {

        System.out.println("EXERCICE 2");
        System.out.println("------------------------------------------------------------");

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        // Heures demandées
        System.out.print("Entrez les heures : ");
        int heures = clavier.nextInt();

        // Minutes demandées
        System.out.print("Entrez les minutes : ");
        int minutes = clavier.nextInt();

        // Secondes demandées
        System.out.print("Entrez les secondes : ");
        int secondes = clavier.nextInt();

        // Calcul des secondes
        int valeurSec = heures * 3600 + minutes * 60 + secondes;

        // Résultat
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + valeurSec + " secondes depuis minuit.");

        System.out.println("------------------------------------------------------------");

        // Fermeture du clavier
        clavier.close();

    }

}