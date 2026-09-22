/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Younes
 * Cours : Java
 * Objectif : Créer une calculette qui effectue des opérations (+, -, *, /, %)
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // Saisie de l'opération
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Entrez l'opération souhaitée :" +
                   "\n1) addition" + "\n2) soustraction" +
                   "\n3) multiplication" + "\n4) division" +
                   "\n5) modulo" + "\n");
        
        
        
        int operator;
        operator = sc.nextInt();
        
        if(operator < 1 || operator > 5){
            System.out.println("ERREUR !");
            System.exit(0);        // permet d'interrompre le programme en cas d'erreur
        }
        
        System.out.println("Entrez la première valeur :");
        int operande1;
        operande1 = sc.nextInt();
        
        System.out.println("Entrez la deuxième valeur :");
        int operande2;
        operande2 = sc.nextInt();
        
        //maintenant on calcule le résultat avec les swtich case
        int result = 0;
        
        switch(operator){
            case 1 :    //Addition +
                result = operande1 + operande2;
                break;
                
            case 2 :    //Soustraction -
                result = operande1 - operande2;
                break;
                
                
            case 3 :    //Multiplication *
                result = operande1 * operande2;
                break;
                
                
            case 4 :    //Division /
                result = operande1 / operande2;
                break;
              
            case 5 :    //Modulo %
                result = operande1 % operande2;
                break;
        }
        
        System.out.println("Le resulat de l'opération est : " + result);
        
         
        
        
    }
    
}
