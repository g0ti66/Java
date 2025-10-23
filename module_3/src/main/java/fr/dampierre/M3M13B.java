package fr.dampierre;

public class M3M13B {

    public static void main(String[] args) {

        for (int i = 0; i <= 48; i += 8) {
            for (int j = 0; j <= i; j++) {
                for (int j2 = 0; j2 == j; j2++) {
                    for (int j3 = 40; j3 >= i; j3 -= 8) {
                        for (int j4 = 1; j4 <= 4; j4++) {
                            System.out.print("/");
                        }
                    }
                }
            }

            for (int j = 8; j <= i; j += 8) {
                for (int j2 = 1; j2 <= 8; j2++) {
                    System.out.print("*");
                }
            }

            for (int j = 0; j <= i; j++) {
                for (int j2 = 0; j2 == j; j2++) {
                    for (int j3 = 40; j3 >= i; j3 -= 8) {
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