package fr.dampierre;

import java.util.Scanner;

public class Cafe {

    public static void main(String[] args) {

        System.out.println(
                "Bonjour : Je suis l'assistant de la machine à café. Dites-moi les pièces jaunes dont vous disposez :");

        // Prix du café
        int coutCafe = 100;

        // Initialisation du clavier
        Scanner clavier = new Scanner(System.in);

        System.out.print("Pièces de 1 cent : ");
        int cent = clavier.nextInt();

        System.out.print("Pièces de 5 cents : ");
        int cinqCent = clavier.nextInt();
        int cinqCentTotal = cinqCent * 5;

        System.out.print("Pièces de 10 cents : ");
        int dixCent = clavier.nextInt();
        int dixCentTotal = dixCent * 10;

        System.out.print("Pièces de 20 cents : ");
        int vingtCent = clavier.nextInt();
        int vingtCentTotal = vingtCent * 20;

        System.out.print("Pièces de 50 cents : ");
        int cinquanteCent = clavier.nextInt();
        int cinquanteCentTotal = cinquanteCent * 50;

        // Résultat
        int totalCent = cent + cinqCentTotal + dixCentTotal + vingtCentTotal + cinquanteCentTotal;

        // Différence
        int differenceCent = Math.abs(coutCafe - totalCent);

        // Résultat
        if (coutCafe > totalCent) {
            System.out.println("Il vous manque " + differenceCent + " cents pour votre café.");
        } else if (coutCafe == totalCent) {
            System.out.println("Vous avez tout juste pour vous payer le café.");
        } else {
            System.out.println("Vous pouvez vous payer le café et il vous restera " + differenceCent + " cents.");
        }

        clavier.close();
    }

}