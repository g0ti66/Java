package fr.dampierre;

public class M3M13 {

    public static void main(String[] args) {

        for (int i = 0; i <= 32; i+=8) {
            for (int j = 32; j > i; j-=8) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("/");
                }
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 32; j > i; j-=8) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("\\");
                }
            }
            System.out.println();
        }
    }
}