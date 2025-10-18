package fr.dampierre;

public class M3M9 {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 9; j >= 1; j--) {
                for (int k = 1; k <= j; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}