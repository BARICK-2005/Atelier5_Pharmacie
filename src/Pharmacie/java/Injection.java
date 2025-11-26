

public class Injection extends Medicament {
    private double volumeDose;
    private String voie;

    public Injection(String code, String nom, double prix, String expiration,
                     int stock, String labo, double dose, String voie) {
        super(code, nom, prix, expiration, stock, labo);
        this.volumeDose = dose;
        this.voie = voie;
    }

    @Override
    public String getType() {
        return "INJECTION";
    }

    @Override
    public String toString() {
        return super.toString() + ";" + volumeDose + ";" + voie;
    }
}

