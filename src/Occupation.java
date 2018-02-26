import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Occupation {
    private String poste;
    private Entreprise entreprise;

    public Occupation(String poste, Entreprise entreprise) {
        this.poste = poste;
        this.entreprise = entreprise;
    }

    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }

    public static Occupation creerOccupation(){
        String rep;
        char repChar;
        Scanner sc = new Scanner(System.in);

        Occupation occupation = new Occupation(null,null);

        System.out.println("Occupation :");
        rep=sc.next();
        occupation.setPoste(rep);
        occupation.setEntreprise(Entreprise.creerEntreprise());

        return occupation;
    }
}
