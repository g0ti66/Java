package fr.dampierre;

public class M3M10 {

    public static void main(String[] args) {

        // On veut 5 ligne : 10 - 5 (-=2)
        for (int i = 10; i >= 1; i -= 2) {
            // Ajout de tiret ou de chiffre
            for (int j = 1; j <= i; j++) {
                System.out.print("-");
                for (int k = 10; k == i; k++) {
                    for (int k2 = 5; k2 == j; k2++) {
                        for (int k3 = 1; k3 == 1; k3++) {
                            System.out.print(k3);
                        }
                    }
                }
                // On va sur la ligne 2
                for (int l = 8; l == i; l++) {
                    // On parcours la ligne 2
                    for (int l2 = 4; l2 == j; l2++) {
                        // On va mettre x fois un nombre y
                        for (int l3 = 1; l3 <= 3; l3++) {
                            // On met 3
                            for (int l4 = 3; l4 == 3; l4++) {
                                System.out.print(l4);
                            }
                        }
                    }
                }
                for (int m = 6; m == i; m++) {
                    for (int m2 = 3; m2 == j; m2++) {
                        for (int m3 = 1; m3 <= 5; m3++) {
                            for (int m4 = 5; m4 == 5; m4++) {
                                System.out.print(m4);
                            }
                        }
                    }
                }
                for (int n = 4; n == i; n++) {
                    for (int n2 = 2; n2 == j; n2++) {
                        for (int n3 = 1; n3 <= 7; n3++) {
                            for (int n4 = 7; n4 == 7; n4++) {
                                System.out.print(n4);
                            }
                        }
                    }
                }
                for (int o = 2; o == i; o++) {
                    for (int o2 = 1; o2 == j; o2++) {
                        for (int o3 = 0; o3 <= 9; o3++) {
                            for (int o4 = 9; o4 == 9; o4++) {
                                System.out.print(o4);
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
