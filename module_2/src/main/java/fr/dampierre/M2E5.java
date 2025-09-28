package fr.dampierre;

import java.util.Scanner;

// Utilisation de la classe Character pour vérifier les majuscules
import static java.lang.Character.isUpperCase;

public class M2E5 {

    public static void main(String[] args) {

        // Initialisation du clavier
        Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un mot : ");
        String mot = clavier.next();

        // Prendre le premier caractères
        char ch1 = mot.charAt(0);

        // Vérification de la majuscule
        if (isUpperCase(ch1)) {
            System.out.println("Le mot commence par un majuscule.");
        } else {
            System.out.println("Le mot commence par une minuscule.");

        }

        clavier.close();

    }

}