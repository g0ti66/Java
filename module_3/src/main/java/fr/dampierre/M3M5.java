package fr.dampierre;

public class M3M5 {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) { // Initialisation d'un ligne
            for (int j = 4; j >= i; j--) { // j = 4, supérieur à i, on fait " ", et ainsi de suite (donc espace 4 fois)
                System.out.print(" ");
            }
            System.out.println(i);
        }
    }
}
