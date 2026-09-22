package exo1;

import java.util.Scanner;

/**
 *
 * @author younes
 * Cours : Java
 * Objectif : afficher le prénom de l'utilisateur
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Bonjour, quel est votre prenom ?");
        prenom = sc.nextLine();
        
        System.out.println("Bonjour " + prenom + "!");
    }
    
}
