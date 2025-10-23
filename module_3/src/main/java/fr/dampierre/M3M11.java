package fr.dampierre;

public class M3M11 {

    public static void main(String[] args) {

        // 6 lignes (20/4 r 2)
        for (int i = 22; i >= 2; i -= 4) {
            for (int j = 1; j <= i; j++) {
                // on va sur le premier emplacement de chaque ligne
                for (int j2 = 1; j2 == j; j2++) {
                    // Si i = 14 :
                    // j3 = 18 ; j3 >= i (14) : On fait la boucle qui affichera deux fois /
                    // k2 - 4 = 14
                    // j3 = 14 ; j3 >= i (14) : On fait la boucle qui affichera deux fois /
                    // j3 - 4 = 10
                    // j3 = 10 ; j3 < i : On s'arrête
                    for (int j3 = 18; j3 >= i; j3 -= 4) {
                        for (int j4 = 1; j4 <= 2; j4++) {
                            System.out.print("\\");
                        }
                    }
                }

                System.out.print("!");

            }
            for (int k = 1; k <= i; k++) {
                for (int k2 = 1; k2 == k; k2++) {
                    for (int k3 = 18; k3 >= i; k3 -= 4) {
                        for (int k4 = 1; k4 <= 2; k4++) {
                            System.out.print("/");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}