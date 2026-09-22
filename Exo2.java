package exo2;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author younes
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    //Declaration des variables
    int nb; // nombre d int result; // resultat
    int result; //resultat
    int ind; //indice
    
    // Saisie du nommbre
    Scanner sc = new Scanner(System.in);
    System.out.println("\n Entrer le nombre :");
    nb=sc.nextInt();

    result=0;
    
    // Addition des nb premiers entiers
    ind=1;
    while (ind <= nb) {
        result=result+ind;
        ind++;    //il faut incrementer
    }
    // Affichage du resultat
    System.out.println();
    System.out.println("La somme des "+ nb + " entiers est: "+result);
           
        
    }
    
}
