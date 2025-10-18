package fr.dampierre;

public class M3M8 {

    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {
            for (int j = 9; j >= 0; j--) {
                for (int k = 1; k <= 5; k++) {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
