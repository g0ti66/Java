package fr.dampierre;

public class M3M11B {

    public static void main(String[] args) {

        // On veut 8 ligne : 30 - 22 (-=4)
        for (int i = 30; i >= 2; i -= 4) {
            for (int j = 1; j <= i; j++) {
                for (int j2 = 1; j2 == j; j2++) {
                    for (int j3 = 26; j3 >= i; j3 -= 4) {
                        for (int j4 = 1; j4 <= 2; j4++) {
                            System.out.print("\\");
                        }
                    }
                }

                System.out.print("!");

            }
            for (int k = 1; k <= i; k++) {
                for (int k2 = 1; k2 == k; k2++) {
                    for (int k3 = 26; k3 >= i; k3 -= 4) {
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