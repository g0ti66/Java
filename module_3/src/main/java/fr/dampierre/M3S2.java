package fr.dampierre;

public class M3S2 {

    public static void main(String[] args) {

        int nbZero = 0;
        int nbUn = 1;
        int fibonacci = 0;

        for (int i = 0; i < 20; i++) {

            System.out.print(fibonacci + " ");

            // A rectifier
            fibonacci = nbZero + nbUn;
            nbZero = nbUn;
            nbUn = fibonacci;
        }

    }

}
