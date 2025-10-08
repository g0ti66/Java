package fr.dampierre;

public class Cinema {

    public static void main(String[] args) {

        // LIRE LE README.md
        // LIRE LE README.md
        // LIRE LE README.md

        System.out.println("PARTIE 1");
        System.out.println("--------------------------------------------------------------------------");

        int ageEnfant = 10;
        boolean enfantAccompagne = true;

        if (ageEnfant >= 14 || enfantAccompagne == true) {
            System.out.println("Vous pouvez rentrer dans le cinéma !");
        } else if (ageEnfant < 14 && enfantAccompagne != true) {
            System.out.println("Vous ne pouvez pas rentrer !");
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("\n");

        System.out.println("PARTIE 2");
        System.out.println("--------------------------------------------------------------------------");

        int ageEnfantDeux = 12;
        boolean enfantAccompagneDeux = true;

        if (ageEnfantDeux >= 14) {
            System.out.println("Vous pouvez rentrer dans le cinéma !");
        } else if (ageEnfantDeux < 14) {
            System.out.println("Voyons voir si tu es accompagné...");
            if (enfantAccompagneDeux == true) {
                System.out.println("Tu peux rentrer ! Tu es accompagné !");
            } else {
                System.out.println("Tu n'es pas accompagné ! Tu ne peux pas rentrer !");
            }
        } else {
            System.out.println("Tu ne respectes pas les conditions pour rentrer dans le cinéma !");
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("\n");

        System.out.println("PARTIE 3");
        System.out.println("--------------------------------------------------------------------------");

        String username = "G3t0";
        String password = "123457a";

        if (username == "G3t0" && password == "1234567a") {
            System.err.println("Credential valide !");
        } else {
            System.out.println("Credential non valide !");
        }

        System.out.println("--------------------------------------------------------------------------");

        System.out.println("\n");

        System.out.println("PARTIE 4");
        System.out.println("--------------------------------------------------------------------------");

        String prenom = "Thomas";

        if (prenom == "Bob" || prenom == "André") {
            System.out.println("Vous respectez les conditions pour rentrer dans le cinéma !");
        } else {
            System.out.println("Vous ne respectez pas les conditions pour rentrer dans le cinéma !");
        }

        System.out.println("--------------------------------------------------------------------------");

    }

}
