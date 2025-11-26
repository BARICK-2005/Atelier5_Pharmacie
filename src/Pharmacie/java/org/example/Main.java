

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GestionnaireMedicament gm = new GestionnaireMedicament();

        int choix;

        do {
            System.out.println("\n=== PHARMACIE SYSTEME ===");
            System.out.println("1. Ajouter médicament");
            System.out.println("2. Afficher médicaments");
            System.out.println("3. Modifier médicament");
            System.out.println("4. Supprimer médicament");
            System.out.println("0. Quitter");
            System.out.print("Choix : ");

            choix = sc.nextInt();
            sc.nextLine();

            switch (choix) {
                case 1: gm.ajouter(); break;
                case 2: gm.afficher(); break;
                case 3: gm.modifier(); break;
                case 4: gm.supprimer(); break;
                case 0: System.out.println("Au revoir !"); break;
                default: System.out.println("Choix invalide.");
            }

        } while (choix != 0);
    }
}
