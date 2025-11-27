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

    public static int degatSubit() {
        int min = 50;
        int max = 100;
        // Nombre aléatoire généré
        int degats = min + (int) (Math.random() * ((max - min) + 1));
        return degats;
    }

    public static void main(String[] args) {

        bienvenue();
        System.out.println();
        combattant("Artus", 100, 100, 1000);
        System.out.println();
        int degats = degatSubit();
        System.out.println("Tu as subi " + degats + " dégâts !");
    }
}