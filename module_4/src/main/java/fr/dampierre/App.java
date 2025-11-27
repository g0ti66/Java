package fr.dampierre;

public class App {

    public static void bienvenue() {
        System.out.println("Bievenue !");
    }

    public static void nomCombattant(String name) {
        System.out.println("Bienvenue à toi " + name + " !");
    }

    public static void main(String[] args) {

        bienvenue();
        nomCombattant("Artus");
    }
}