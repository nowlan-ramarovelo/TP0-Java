/*
 * TPO Exo 2
 * Nowlan RAMAROVELO
 * BDML1 (22/09/2026)
 */
package exo2;

import java.util.Scanner;

/**
 *
 * @author nono
 */
public class Exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Declaration des variables
        int nb; // nombre d'entiers a additionner
        int result; // resultat
        int ind; // indice
        //nb=5;
        
        // Proposer au user d'entrer le nb
        Scanner sc; 
        sc = new Scanner(System.in);
        System.out.println("\n Entrer le nombre :");
        nb=sc.nextInt();
        result=0;
        
        //Addition des nnb premiers entiers
        ind=1;
        while (ind <= nb) {
            result = result+ind;
            ind++;
        }
        
        //Affichage du resultat
        System.out.println();
        System.out.println("La somme des "+ nb +"entiers est : "+result);
    }
    
}
