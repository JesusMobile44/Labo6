/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Entreprise {
    private String nom;
    private Adresse adresseEnt;

    public Entreprise(String nom, Adresse adresseEnt) {
        this.nom = nom;
        this.adresseEnt = adresseEnt;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Adresse getAdresseEnt() {
        return adresseEnt;
    }

    public void setAdresseEnt(Adresse adresseEnt) {
        this.adresseEnt = adresseEnt;
    }
}
