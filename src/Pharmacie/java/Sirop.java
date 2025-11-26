

public class Sirop extends Medicament {
    private double volume;
    private String gout;

    public Sirop(String code, String nom, double prix, String expiration,
                 int stock, String labo, double volume, String gout) {
        super(code, nom, prix, expiration, stock, labo);
        this.volume = volume;
        this.gout = gout;
    }

    @Override
    public String getType() {
        return "SIROP";
    }

    @Override
    public String toString() {
        return super.toString() + ";" + volume + ";" + gout;
    }
}

