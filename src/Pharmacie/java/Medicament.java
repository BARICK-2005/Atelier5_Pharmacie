

import java.io.Serializable;

public abstract class Medicament implements Serializable {
    private String code;
    private String nomCommercial;
    private double prix;
    private String dateExpiration;
    private int stock;
    private String laboratoire;

    public Medicament(String code, String nomCommercial, double prix,
                      String dateExpiration, int stock, String laboratoire) {
        this.code = code;
        this.nomCommercial = nomCommercial;
        this.prix = prix;
        this.dateExpiration = dateExpiration;
        this.stock = stock;
        this.laboratoire = laboratoire;
    }

    public String getCode() { return code; }
    public String getNomCommercial() { return nomCommercial; }
    public double getPrix() { return prix; }
    public String getDateExpiration() { return dateExpiration; }
    public int getStock() { return stock; }
    public String getLaboratoire() { return laboratoire; }

    public void setNomCommercial(String nomCommercial) { this.nomCommercial = nomCommercial; }
    public void setPrix(double prix) { this.prix = prix; }
    public void setDateExpiration(String dateExpiration) { this.dateExpiration = dateExpiration; }
    public void setStock(int stock) { this.stock = stock; }
    public void setLaboratoire(String laboratoire) { this.laboratoire = laboratoire; }

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + ";" + code + ";" + nomCommercial + ";" + prix + ";" +
                dateExpiration + ";" + stock + ";" + laboratoire;
    }
}

