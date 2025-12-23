package fr.dampierre;

public class M3M11B {

    public static void main(String[] args) {

        for (int i = 30; i >= 2; i-=4) {
            for (int j = 26; j >= i; j-=4) {
                for (int j2 = 1; j2 <= 2; j2++) {
                    System.out.print("\\");
                }
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("!");
            }
            for (int l = 26; l >= i; l-=4) {
                for (int l2 = 1; l2 <= 2; l2++) {
                    System.out.print("/");
                }
            }
            System.out.println();
        }
    }
}