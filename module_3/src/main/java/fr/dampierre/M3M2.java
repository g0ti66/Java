package fr.dampierre;

public class M3M2 {

    public static void main(String[] args) {

        int lignes = 4;
        int nbetoiles = 5;

        // Ligne
        for (int i = 1; i <= lignes; i++) {
            // Étoiles sur chaque lignes
            for (int j = 1; j <= nbetoiles; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}