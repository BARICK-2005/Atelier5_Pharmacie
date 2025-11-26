

public class Comprime extends Medicament {
    private String dosage;
    private int nombreComprime;

    public Comprime(String code, String nom, double prix, String expiration,
                    int stock, String labo, String dosage, int nb) {
        super(code, nom, prix, expiration, stock, labo);
        this.dosage = dosage;
        this.nombreComprime = nb;
    }

    @Override
    public String getType() {
        return "COMPRIME";
    }

    @Override
    public String toString() {
        return super.toString() + ";" + dosage + ";" + nombreComprime;
    }
}

