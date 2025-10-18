package fr.dampierre;

public class M3M2 {

    public static void main(String[] args) {

        // Ligne
        for (int i = 1; i <= 4; i++) {
            // Étoiles sur chaque lignes
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}