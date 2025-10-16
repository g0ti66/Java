package fr.dampierre;

public class M3M3 {

    public static void main(String[] args) {

        // Ligne
        for (int i = 1; i <= 5; i++) { // Si i = 2, on fait la boucle
            // Etoile
            for (int j = 1; j <= i; j++) { // j = 1, il est plus petit ou égal que i, on affiche '*';
                                           // j = 2, il est plus petit ou égal que i, on affiche '*'
                                           // On s'arrête : **
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
