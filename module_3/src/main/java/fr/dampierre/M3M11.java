package fr.dampierre;

public class M3M11 {

    public static void main(String[] args) {

        // 6 lignes (20/4 r 2)
        for (int i = 22; i >= 2; i -= 4) {
            for (int j = 1; j <= i; j++) {
                // On va à la ligne 18
                for (int k = 18; k == i; k++) {
                    // A x postion
                    for (int k2 = 1; k2 == j; k2++) {
                        // On veut x fois une chose
                        for (int k3 = 1; k3 <= 2; k3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int l = 14; l == i; l++) {
                    for (int l2 = 1; l2 == j; l2++) {
                        for (int l3 = 1; l3 <= 4; l3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int m = 10; m == i; m++) {
                    for (int m2 = 1; m2 == j; m2++) {
                        for (int m3 = 1; m3 <= 6; m3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int n = 6; n == i; n++) {
                    for (int n2 = 1; n2 == j; n2++) {
                        for (int n3 = 1; n3 <= 8; n3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int o = 2; o == i; o++) {
                    for (int o2 = 1; o2 == j; o2++) {
                        for (int o3 = 1; o3 <= 10; o3++) {
                            System.out.print("\\");
                        }
                    }
                }

                System.out.print("!");

                // On retourne sur la ligne 18 (kx : Même ligne)
                for (int k4 = 18; k4 == i; k4++) {
                    // A la fin de la ligne
                    for (int k5 = 18; k5 == j; k5++) {
                        // On veut mettre deux fois le caractère
                        for (int k6 = 1; k6 <= 2; k6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int l4 = 14; l4 == i; l4++) {
                    for (int l5 = 14; l5 == j; l5++) {
                        for (int l6 = 1; l6 <= 4; l6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int m4 = 10; m4 == i; m4++) {
                    for (int m5 = 10; m5 == j; m5++) {
                        for (int m6 = 1; m6 <= 6; m6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int n4 = 6; n4 == i; n4++) {
                    for (int n5 = 6; n5 == j; n5++) {
                        for (int n6 = 1; n6 <= 8; n6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int o4 = 2; o4 == i; o4++) {
                    for (int o5 = 2; o5 == j; o5++) {
                        for (int o6 = 1; o6 <= 10; o6++) {
                            System.out.print("/");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}