package fr.dampierre;

public class M3M2 {

    public static void main(String[] args) {

        int nbetoiles = 15;
        int lignes = 2;

        for (int i = 1; i <= lignes; i++) {
            for (int j = 1; j <= nbetoiles; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }

}