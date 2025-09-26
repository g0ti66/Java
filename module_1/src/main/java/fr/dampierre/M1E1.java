package fr.dampierre;

public class M1E1 {

    public static void main(String[] args) {

        System.out.println("EXERCICE 1");
        System.out.println("------------------------------------------------------------");

        // Déclaration des variables
        int heures = 12;
        int minutes = 34;
        int secondes = 56;

        // Calcul des secondes
        int valeurSec = heures * 3600 + minutes * 60 + secondes;

        // Résultat
        System.out.println("Il est " + heures + " h " + minutes + " min " + secondes + " s.");
        System.out.println("Il s'est écoulé " + valeurSec + " secondes depuis minuit.");

        System.out.println("------------------------------------------------------------");

    }
}