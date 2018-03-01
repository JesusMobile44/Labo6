import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Contact {
    private String nom;
    private String prenom;
    private Adresse adresse;
    private Occupation occupation;
    private List<Telephone> listeNumero = new ArrayList<Telephone>();


    private int nbTel = 0;

    public Contact() {
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

    public List<Telephone> getListeNumero() {
        return listeNumero;
    }

    public void setListeNumero(List<Telephone> listeNumero) {
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

        int h = 0;
        for (Telephone telephone : listeNumero){
            System.out.println("Telephone #"+(h+1));
            telephone.afficherTel();
            h++;
        }
    }
}

