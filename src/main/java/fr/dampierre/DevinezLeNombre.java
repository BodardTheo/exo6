package fr.dampierre;
 
import java.util.Random;
import java.util.Scanner;

public class DevinezLeNombre {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Nombre aléatoire entre 1 et 100
        int nombreADeviner = random.nextInt(100) + 1;

        System.out.println("Je pense à un nombre entre 1 et 100 inclus. Devinez lequel.");
        System.out.print("Entrez un nombre : ");
        
        // Fait du joueur
        int proposition = scanner.nextInt();
        System.out.println("Vous proposez : " + proposition);
        System.out.println("Le nombre auquel je pensais était : " + nombreADeviner);
        
        // Condition éffectuer si oui ou non
        int difference = Math.abs(nombreADeviner - proposition);
        if (proposition > nombreADeviner) {
            System.out.println("Perdu ! Vous avez dépassé de " + difference);
        }
        else {
            if (proposition < nombreADeviner) {
            System.out.println("Perdu ! Il vous manquait " + difference + "." );
            }
        }
        if (proposition == nombreADeviner) 
            System.out.println("Quel bol, vous avez trouvé !");

        

         // Fermer le scanner
         scanner.close();
     }
 }
