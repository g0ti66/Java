package fr.dampierre;

public class M3M11B {

    public static void main(String[] args) {

        for (int i = 30; i >= 2; i -= 4) {
            for (int j = 1; j <= i; j++) {
                for (int k = 26; k == i; k++) {
                    for (int k2 = 1; k2 == j; k2++) {
                        for (int k3 = 1; k3 <= 2; k3++) {
                            System.out.print("\\");
                        }
                    }
                }
                // Ligne 2
                for (int l = 22; l == i; l++) {
                    // 1ère position
                    for (int l2 = 1; l2 == j; l2++) {
                        // On veut mettre 4 éléments
                        for (int l3 = 1; l3 <= 4; l3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int m = 18; m == i; m++) {
                    for (int m2 = 1; m2 == j; m2++) {
                        for (int m3 = 1; m3 <= 6; m3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int n = 14; n == i; n++) {
                    for (int n2 = 1; n2 == j; n2++) {
                        for (int n3 = 1; n3 <= 8; n3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int o = 10; o == i; o++) {
                    for (int o2 = 1; o2 == j; o2++) {
                        for (int o3 = 1; o3 <= 10; o3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int p = 6; p == i; p++) {
                    for (int p2 = 1; p2 == j; p2++) {
                        for (int p3 = 1; p3 <= 12; p3++) {
                            System.out.print("\\");
                        }
                    }
                }
                for (int q = 2; q == i; q++) {
                    for (int q2 = 1; q2 == j; q2++) {
                        for (int q3 = 1; q3 <= 14; q3++) {
                            System.out.print("\\");
                        }
                    }
                }

                System.out.print("!");

                for (int k4 = 26; k4 == i; k4++) {
                    for (int k5 = 26; k5 == j; k5++) {
                        for (int k6 = 1; k6 <= 2; k6++) {
                            System.out.print("/");
                        }
                    }
                }
                // Ligne 2
                for (int l4 = 22; l4 == i; l4++) {
                    // Dernière position
                    for (int l5 = 22; l5 == j; l5++) {
                        // On veut mettre 4 éléments
                        for (int l6 = 1; l6 <= 4; l6++) {
                            System.out.print("/");
                        }
                    }
                }

                for (int m4 = 18; m4 == i; m4++) {
                    for (int m5 = 18; m5 == j; m5++) {
                        for (int m6 = 1; m6 <= 6; m6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int n4 = 14; n4 == i; n4++) {
                    for (int n5 = 14; n5 == j; n5++) {
                        for (int n6 = 1; n6 <= 8; n6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int o4 = 10; o4 == i; o4++) {
                    for (int o5 = 10; o5 == j; o5++) {
                        for (int o6 = 1; o6 <= 10; o6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int p4 = 6; p4 == i; p4++) {
                    for (int p5 = 6; p5 == j; p5++) {
                        for (int p6 = 1; p6 <= 12; p6++) {
                            System.out.print("/");
                        }
                    }
                }
                for (int q4 = 2; q4 == i; q4++) {
                    for (int q5 = 2; q5 == j; q5++) {
                        for (int q6 = 1; q6 <= 14; q6++) {
                            System.out.print("/");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}