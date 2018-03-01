import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Contact {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Occupation occupation;
    private Telephone listeNumero[] = new Telephone[10];


    private int nbTel = 0;

    public Contact(String nom, String prenom, Adresse adresse, Occupation occupation, Telephone[] listeNumero) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.occupation = occupation;
        this.listeNumero = listeNumero;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public Occupation getOccupation() {
        return occupation;
    }

    public void setOccupation(Occupation occupation) {
        this.occupation = occupation;
    }

    public Telephone[] getListeNumero() {
        return listeNumero;
    }

    public void setListeNumero(Telephone[] listeNumero) {
        this.listeNumero = listeNumero;
    }

    public int getNbTel() {
        return nbTel;
    }

    public void setNbTel(int nbTel) {
        this.nbTel = nbTel;
    }

    public void afficherContact(){
        System.out.println("");
        System.out.println("Nom : "+nom);
        System.out.println("Prenom : "+prenom);
        System.out.println("");
        System.out.println("-=-Adresse Personnelle-=-");
        adresse.afficherAdresse();

        occupation.afficherOccupation();

        for (int h=0;h<nbTel;h++){
            System.out.println("Telephone #"+(h+1));
            listeNumero[h].afficherTel();
        }
    }
}

