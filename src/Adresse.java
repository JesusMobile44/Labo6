import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Adresse {
    private String numPorte;
    private String rue;
    private String appart;
    private String ville;
    private String province;
    private String pays;

    public Adresse(String numPorte, String rue, String appart, String ville, String province, String pays) {
        this.numPorte = numPorte;
        this.rue = rue;
        this.appart = appart;
        this.ville = ville;
        this.province = province;
        this.pays = pays;
    }

    public String getNumPorte() {
        return numPorte;
    }

    public void setNumPorte(String numPorte) {
        this.numPorte = numPorte;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getAppart() {
        return appart;
    }

    public void setAppart(String appart) {
        this.appart = appart;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
    public static Adresse creerAdresse(){
        String rep;
        char repChar;
        Scanner sc = new Scanner(System.in);

        Adresse nouvelleAdresse = new Adresse("1A","rue",null,"Saguenay","Quebec","Canada");

        System.out.println("-=-Adresse-=-");
        System.out.println("Pays de résidence :");
        rep=sc.next();
        nouvelleAdresse.setPays(rep);
        System.out.println("Province/État de résidence :");
        rep=sc.next();
        nouvelleAdresse.setProvince(rep);
        System.out.println("Ville de résidence :");
        rep=sc.next();
        nouvelleAdresse.setVille(rep);
        System.out.println("Appartement (o/n) :");
        repChar=sc.next().toLowerCase().charAt(0);
        if (repChar=='o'){//facultatif
            System.out.println("Nom de l'appart :");
            rep=sc.next();
            nouvelleAdresse.setAppart(rep);
        }
        System.out.println("Rue :");
        rep=sc.next();
        nouvelleAdresse.setRue(rep);
        System.out.println("Numero de porte");
        rep=sc.next();
        nouvelleAdresse.setNumPorte(rep);

        return nouvelleAdresse;
    }
}
