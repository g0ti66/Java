package fr.dampierre;

public class M3M13 {

    public static void main(String[] args) {

        for (int i = 0; i <= 32; i += 8) {
            for (int j = 0; j <= i; j++) {
                for (int j2 = 0; j2 == j; j2++) {
                    for (int j3 = 24; j3 >= i; j3 -= 8) {
                        for (int j4 = 1; j4 <= 4; j4++) {
                            System.out.print("/");
                        }
                    }
                }
            }

            // Ne pas prednre la ligne 0 en compte
            // On va de la ligne 8 à 32 en faisant des sauts de 8
            // Si i = 16, on répète deux fois
            for (int j = 8; j <= i; j += 8) {
                for (int j2 = 1; j2 <= 8; j2++) {
                    System.out.print("*");
                }
            }

            for (int j = 0; j <= i; j++) {
                for (int j2 = 0; j2 == j; j2++) {
                    for (int j3 = 24; j3 >= i; j3 -= 8) {
                        for (int j4 = 1; j4 <= 4; j4++) {
                            System.out.print("\\");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}