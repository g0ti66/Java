package fr.dampierre;

import java.util.Scanner;

public class M1E4 {

    public static void main(String[] args) {

        System.out.println("EXERCICE 4");
        System.out.println("------------------------------------------------------------");

        // Initialisation du clavier
        Scanner clavier = new Scanner(System.in);

        // Heure actuelle
        System.out.println("Heures maintenant :");

        // Heures demandées
        System.out.print("Entrez les heures : ");
        int heuresQuatreMtn = clavier.nextInt();

        // Minutes demandées
        System.out.print("Entrez les minutes : ");
        int minutesQuatreMtn = clavier.nextInt();

        // Secondes demandées
        System.out.print("Entrez les secondes : ");
        int secondesQuatreMtn = clavier.nextInt();

        System.out.println("\n");

        // Heure avant
        System.out.println("Heures avant :");

        // Heures demandées
        System.out.print("Entrez les heures : ");
        int heuresCinqAvant = clavier.nextInt();

        // Minutes demandées
        System.out.print("Entrez les minutes : ");
        int minutesCinqAvant = clavier.nextInt();

        // Secondes demandées
        System.out.print("Entrez les secondes : ");
        int secondesCinqAvant = clavier.nextInt();

        System.out.println("\n");

        // Calcul des secondes
        int valeurSecQuatre = heuresQuatreMtn * 3600 + minutesQuatreMtn * 60 + secondesQuatreMtn;
        int valeurSecCinq = heuresCinqAvant * 3600 + minutesCinqAvant * 60 + secondesCinqAvant;

        // Résultat
        System.out.println(
                "Il est maintenant " + heuresQuatreMtn + " h " + minutesQuatreMtn + " min " + secondesQuatreMtn + " s");

        System.out
                .println("Il était " + heuresCinqAvant + " h " + minutesCinqAvant + " min " + secondesCinqAvant + " s");

        // Valeur absolue
        int valeurTotale = valeurSecQuatre - valeurSecCinq;

        // Résultat
        System.out.println("Entre " + heuresCinqAvant + " h " + minutesCinqAvant + " min " + secondesCinqAvant
                + " s et " + heuresQuatreMtn + " h " + minutesQuatreMtn + " min " + secondesQuatreMtn
                + " s, il s'est écoulé " + valeurTotale + " secondes.");

        // Pourcentage
        double valeurPourcentage = ((double) valeurTotale / (24 * 3600)) * 100;

        // Résultat
        System.out.println(
                "Le pourcentage des secondes qui s'est écoulé depuis 24 heures est " + valeurPourcentage + "%");

        System.out.println("------------------------------------------------------------");

        clavier.close();

    }

}