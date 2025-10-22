package fr.dampierre;

public class M3M13 {

    public static void main(String[] args) {

        for (int i = 0; i <= 32; i += 8) {
            for (int j = 1; j <= i; j++) {
                for (int l = 8; l == i; l++) {
                    for (int l2 = 1; l2 == j; l2++) {
                        for (int l3 = 1; l3 <= 12; l3++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int m = 16; m == i; m++) {
                    for (int m2 = 1; m2 == j; m2++) {
                        for (int m3 = 1; m3 <= 8; m3++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int n = 24; n == i; n++) {
                    for (int n2 = 1; n2 == j; n2++) {
                        for (int n3 = 1; n3 <= 4; n3++) {
                            System.out.print("/");
                        }
                    }
                }

                System.out.print("*");

                for (int l4 = 8; l4 == i; l4++) {
                    for (int l5 = 8; l5 == j; l5++) {
                        for (int l6 = 1; l6 <= 12; l6++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int m4 = 16; m4 == i; m4++) {
                    for (int m5 = 16; m5 == j; m5++) {
                        for (int m6 = 1; m6 <= 8; m6++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int n4 = 24; n4 == i; n4++) {
                    for (int n5 = 24; n5 == j; n5++) {
                        for (int n6 = 1; n6 <= 4; n6++) {
                            System.out.print("\\");
                        }
                    }
                }
            }
            // Ligne 0
            for (int k = 0; k == i; k++) {
                for (int k2 = 1; k2 <= 16; k2++) {
                    System.out.print("/");
                }
                for (int k2b = 1; k2b <= 16; k2b++) {
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
}