

public class Pommade extends Medicament {
    private double quantite;
    private String zone;

    public Pommade(String code, String nom, double prix, String expiration,
                   int stock, String labo, double quantite, String zone) {
        super(code, nom, prix, expiration, stock, labo);
        this.quantite = quantite;
        this.zone = zone;
    }

    @Override
    public String getType() {
        return "POMMADE";
    }

    @Override
    public String toString() {
        return super.toString() + ";" + quantite + ";" + zone;
    }
}

