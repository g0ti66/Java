package fr.dampierre;

import java.util.Scanner;

public class M1E3 {

    public static void main(String[] args) {

        // Initialisation du Scanner pour le clavier
        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 3");
        System.out.println("------------------------------------------------------------");

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
        int valeurSec = (24 * 3600) - (heures * 3600 + minutes * 60 + secondes);

        // Résultat
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il y a encore " + valeurSec + " secondes avant minuit.");

        System.out.println("------------------------------------------------------------");

        // Fermeture du clavier
        clavier.close();

    }

}