package fr.dampierre;

import java.util.Scanner;
import java.util.Random;

public class M1E5 {

    public static void main(String[] args) {

        // Initialisation du clavier
        Scanner clavier = new Scanner(System.in);

        System.out.println("EXERCICE 5");
        System.out.println("------------------------------------------------------------");

        // Générer des nombres aléatoires
        Random random = new Random();

        System.out.println("Je pense à un nombre entre 1 et 100 incluse. Devinez lequel.");

        // initialisation d'un nombre aléatoire entre 1 et 100
        int nombreOrdinateur = random.nextInt(100) + 1;

        // Entrée utilisateur
        System.out.print("Entrer un nombre : ");
        int nombreUtilisateur = clavier.nextInt();

        System.out.println("Vous proposez : " + nombreUtilisateur);

        System.out.println("\n");

        // Valeur absolue (Pour éviter les nombres négatifs)
        int pas = Math.abs(nombreUtilisateur - nombreOrdinateur);

        // Résultat
        if (nombreUtilisateur == nombreOrdinateur) {
            System.out.println("Bien joué ! Vous avez vu juste.");
        } else {
            System.out.println("Le nombre auquel je pensais était " + nombreOrdinateur + ".");
            System.out.println("Vous étiez à " + pas + " de la bonne réponse.");
        }

        System.out.println("------------------------------------------------------------");

        // Fermeture du clavier
        clavier.close();

    }

}