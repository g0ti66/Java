package fr.dampierre;

public class M3S2 {

    public static void main(String[] args) {

        int nbZero = 0;
        int nbUn = 1;
        int fibonacci = 0;

        System.out.print(nbZero + " ");
        System.out.print(nbUn + " ");

        for (int i = 1; i <= 20; i++) {

            fibonacci = nbZero + nbUn;

            System.out.print(fibonacci + " ");

            nbZero = nbUn;
            nbUn = fibonacci;
        }

    }

}
