package fr.dampierre;

public class M3M11 {

    public static void main(String[] args) {

        // 6 lignes (20/4 r 2)
        for (int i = 22; i >= 2; i -= 4) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k == j; k++) {
                    for (int k2 = 18; k2 >= i; k2 -= 4) {
                        for (int l = 1; l <= 2; l++) {
                            System.out.print("\\");
                        }
                    }
                }

                System.out.print("!");

            }
            for (int j = 1; j <= i; j++) {
                for (int j2 = 1; j2 == j; j2++) {
                    for (int k2 = 18; k2 >= i; k2 -= 4) {
                        for (int l = 1; l <= 2; l++) {
                            System.out.print("/");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}