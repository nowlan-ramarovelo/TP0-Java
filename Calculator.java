/*
 * TPO Exo Calculette
 * Nowlan RAMAROVELO
 * BDML1 (22/09/2026)
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author nono
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Différents opérateurs
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");
        
        // Recup le choix du user
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        int operateur = sc.nextInt();
        
        // Verif operateur [1;5]
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide (choisissez entre 1 et 5)");
            System.exit(0);
        }
        
        // Choix valeur1
        System.out.println("\n Choisissez une premiere valeur :");
        int operande1 = sc.nextInt();
        
        // Choix valeur2
        System.out.println("\n Choisissez une deuxième valeur :");
        int operande2 = sc.nextInt();  
        
        // Calcul
        float result;
        if (operateur == 1){
            result = operande1+operande2;
        } else if (operateur == 2){
            result = operande1-operande2;
        } else if (operateur == 3) {
            result = operande1*operande2;
        } else if (operateur == 4) {
            result = (float) operande1/operande2;
        } else {
            result = operande1 % operande2;    
        }
        System.out.println("The result is :"+result);
    }
    
}
