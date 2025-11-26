

import java.io.*;
import java.util.*;

public class FichierService {

    private static final String FICHIER = "medicaments.txt";

    public static void sauvegarder(List<Medicament> liste) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(FICHIER))) {
            for (Medicament m : liste) pw.println(m.toString());
        } catch (IOException e) {
            System.out.println("Erreur sauvegarde : " + e.getMessage());
        }
    }

    public static List<Medicament> charger() {
        List<Medicament> liste = new ArrayList<>();
        File file = new File(FICHIER);

        if (!file.exists()) return liste;

        try (BufferedReader br = new BufferedReader(new FileReader(FICHIER))) {
            String ligne;
            while ((ligne = br.readLine()) != null) {
                String[] t = ligne.split(";");

                switch (t[0]) {
                    case "COMPRIME":
                        liste.add(new Comprime(t[1], t[2], Double.parseDouble(t[3]), t[4],
                                Integer.parseInt(t[5]), t[6], t[7], Integer.parseInt(t[8])));
                        break;

                    case "SIROP":
                        liste.add(new Sirop(t[1], t[2], Double.parseDouble(t[3]), t[4],
                                Integer.parseInt(t[5]), t[6], Double.parseDouble(t[7]), t[8]));
                        break;

                    case "POMMADE":
                        liste.add(new Pommade(t[1], t[2], Double.parseDouble(t[3]), t[4],
                                Integer.parseInt(t[5]), t[6], Double.parseDouble(t[7]), t[8]));
                        break;

                    case "INJECTION":
                        liste.add(new Injection(t[1], t[2], Double.parseDouble(t[3]), t[4],
                                Integer.parseInt(t[5]), t[6], Double.parseDouble(t[7]), t[8]));
                        break;
                }
            }

        } catch (IOException e) {
            System.out.println("Erreur lecture : " + e.getMessage());
        }

        return liste;
    }
}

