package fr.dampierre;

public class Cinema {

    public static void main(String[] args) {

        int ageEnfantDeux = 12;
        boolean enfantAccompagneDeux = true;

        if (ageEnfantDeux >= 14) {
            System.out.println("Vous pouvez rentrer dans le cinéma !");
        } else if (ageEnfantDeux < 14) {
            System.out.println("Vous n'avez pas l'âge requis mais voyons voir si tu es accompagné...");
            if (enfantAccompagneDeux == true) {
                System.out.println("Tu peux rentrer ! Tu es accompagné !");
            } else {
                System.out.println("Tu n'es pas accompagné ! Tu ne peux pas rentrer !");
            }
        } else {
            System.out.println("Tu ne respectes pas les conditions pour rentrer dans le cinéma !");
        }
    }
}