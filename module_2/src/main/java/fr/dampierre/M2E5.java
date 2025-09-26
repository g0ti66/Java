package fr.dampierre;

import java.util.Scanner;
import static java.lang.Character.*;;

public class App {

    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);

        // Exercice 5
        System.out.print("Entrez un mot : ");
        String mot = clavier.next();

        char ch1 = mot.charAt(0);

        if (isUpperCase(ch1)) {
            System.out.println("Le mot commence par un majuscule.");
        } else {
            System.out.println("Le mot commence par une minuscule.");

        }

        String javaString = " String length example ";
        int stringSize = javaString.trim().length();
        System.out.println(stringSize);

        clavier.close();

    }

}