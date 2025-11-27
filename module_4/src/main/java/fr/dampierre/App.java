package fr.dampierre;

public class App {

    public static void bienvenue() {
        System.out.println("Bievenue !");
    }

    public static void combattant(String name, int force, int agilite, int pv) {
        System.out.println("Bienvenue à toi " + name + " !");
        System.out.println("Ton niveau de force est de " + force);
        System.out.println("Ton niveau d'agilité est de " + agilite);
        System.out.println("Tes points de vie sont de " + pv);
    }

    public static void main(String[] args) {

        bienvenue();
        System.out.println();
        combattant("Artus", 5, 5, 100);
    }
}