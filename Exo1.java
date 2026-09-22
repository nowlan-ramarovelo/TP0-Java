/*
 * TPO Exo 1
 * Nowlan RAMAROVELO
 * BDML1 (22/09/2026)
 */
package exo1;

import java.util.Scanner;

/**
 *
 * @author nono
 */
public class Exo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Bonjour");
        String prenom;
        Scanner sc;
        sc = new Scanner(System.in);
        System.out.println("Quel, est votre prenom ?");
        prenom = sc.nextLine();
        System.out.println("Au revoir "+ prenom +"!");
    }
    
}
