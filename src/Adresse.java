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
}
