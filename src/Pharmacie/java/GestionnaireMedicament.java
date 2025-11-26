

import java.util.*;

public class GestionnaireMedicament {

    private List<Medicament> liste = FichierService.charger();
    private Scanner sc = new Scanner(System.in);

    public void ajouter() {
        System.out.println("1. Comprimé  2. Sirop  3. Pommade  4. Injection");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Code : ");
        String c = sc.nextLine();
        System.out.print("Nom : ");
        String nom = sc.nextLine();
        System.out.print("Prix : ");
        double prix = sc.nextDouble();
        sc.nextLine();
        System.out.print("Expiration : ");
        String exp = sc.nextLine();
        System.out.print("Stock : ");
        int stock = sc.nextInt();
        sc.nextLine();
        System.out.print("Laboratoire : ");
        String labo = sc.nextLine();

        Medicament m = null;

        switch (ch) {
            case 1:
                System.out.print("Dosage : ");
                String d = sc.nextLine();
                System.out.print("Nombre : ");
                int nb = sc.nextInt();
                sc.nextLine();
                m = new Comprime(c, nom, prix, exp, stock, labo, d, nb);
                break;

            case 2:
                System.out.print("Volume : ");
                double v = sc.nextDouble();
                sc.nextLine();
                System.out.print("Goût : ");
                String g = sc.nextLine();
                m = new Sirop(c, nom, prix, exp, stock, labo, v, g);
                break;

            case 3:
                System.out.print("Quantité : ");
                double q = sc.nextDouble();
                sc.nextLine();
                System.out.print("Zone : ");
                String z = sc.nextLine();
                m = new Pommade(c, nom, prix, exp, stock, labo, q, z);
                break;

            case 4:
                System.out.print("Volume dose : ");
                double vd = sc.nextDouble();
                sc.nextLine();
                System.out.print("Voie : ");
                String voie = sc.nextLine();
                m = new Injection(c, nom, prix, exp, stock, labo, vd, voie);
                break;
        }

        liste.add(m);
        FichierService.sauvegarder(liste);
        System.out.println("✔ Médicament ajouté !");
    }

    public void afficher() {
        if (liste.isEmpty()) {
            System.out.println("Aucun médicament enregistré.");
            return;
        }
        for (Medicament m : liste) {
            System.out.println(m);
        }
    }

    public void supprimer() {
        System.out.print("Code à supprimer : ");
        String code = sc.nextLine();

        liste.removeIf(m -> m.getCode().equals(code));
        FichierService.sauvegarder(liste);

        System.out.println("✔ Supprimé.");
    }

    public void modifier() {
        System.out.print("Code à modifier : ");
        String code = sc.nextLine();

        for (Medicament m : liste) {
            if (m.getCode().equals(code)) {
                System.out.print("Nouveau nom : ");
                m.setNomCommercial(sc.nextLine());
                FichierService.sauvegarder(liste);
                System.out.println("✔ Modifié.");
                return;
            }
        }
        System.out.println("Code introuvable.");
    }
}
