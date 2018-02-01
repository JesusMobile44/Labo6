import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

/**
 * Created by BelSi1731422 on 2018-01-22.
 */
public class Main {
    public static void main(String[] args) {

        //Valeur
        int choixMenu = 0;
        int placeContact = 0;
        char continuer = 'o';//('o'/'n')
        String rep;
        char repChar;
        boolean fini = false;
        boolean fini1 = false;
        Contact contact[] = new Contact[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Bienvenue dans votre liste de contact!");
        System.out.println("======================================");
        System.out.println("");
        System.out.println("ps: svp faites pas d'espaces");
        System.out.println("");
        //Menu
        while(choixMenu!=4){
            continuer='o';
            System.out.println("Que voulez-vous faire?");
            System.out.println(" 1-Ajouter un contact");
            System.out.println(" 2-Modifier un contact");
            System.out.println(" 3 Afficher un contact");
            System.out.println(" 4-Quitter");
            System.out.println("");
            choixMenu = sc.nextInt();
            continuer='o';
            switch (choixMenu){
                case 1 :
                    while(continuer=='o'){
                        System.out.println("Dans quel emplacement voulez-vous ajouter un contact?(1 à 20)");
                        placeContact=sc.nextInt();

                        if (contact[placeContact]==null){
                            //New Dude
                            Entreprise entreprise = new Entreprise(null,null);
                            Adresse adresse = new Adresse("1A","rue",null,"Saguenay","Quebec","Canada");
                            Occupation occupation = new Occupation(null,null);
                            Telephone listeNumero[] = new Telephone[10];
                            Contact dude = new Contact("Jass","Hugh",null,null,listeNumero);
                            contact[placeContact-1]=dude;

                            //Questions
                            System.out.println("Prénom :");
                            rep=sc.next();
                            dude.setPrenom(rep);

                            System.out.println("Nom :");
                            rep=sc.next();
                            dude.setNom(rep);

                            //adresse
                            System.out.println("-=-Adresse Personnelle-=-");
                            System.out.println("Pays de résidence :");
                            rep=sc.next();
                            adresse.setPays(rep);
                            System.out.println("Province/État de résidence :");
                            rep=sc.next();
                            adresse.setProvince(rep);
                            System.out.println("Ville de résidence :");
                            rep=sc.next();
                            adresse.setVille(rep);
                            System.out.println("Appartement (o/n) :");
                            repChar=sc.next().toLowerCase().charAt(0);
                            if (repChar=='o'){//facultatif
                                System.out.println("Nom de l'appart :");
                                rep=sc.next();
                                adresse.setAppart(rep);
                            }
                            System.out.println("Rue :");
                            rep=sc.next();
                            adresse.setRue(rep);
                            System.out.println("Numero de porte");
                            rep=sc.next();
                            adresse.setNumPorte(rep);

                            dude.setAdresse(adresse);

                            //Occupation
                            System.out.println("-=-Information-=-");
                            System.out.println("Occupation :");
                            rep=sc.next();

                            occupation.setPoste(rep);

                            Adresse adresse1 = new Adresse("1A","rue",null,"Saguenay","Quebec","Canada");
                            System.out.println("Entreprise d'employement :");
                            rep=sc.next();
                            entreprise.setNom(rep);
                            System.out.println("-=-Adresse de l'entreprise-=-");
                            System.out.println("Pays de résidence :");
                            rep=sc.next();
                            adresse1.setPays(rep);
                            System.out.println("Province/État de résidence :");
                            rep=sc.next();
                            adresse1.setProvince(rep);
                            System.out.println("Ville de résidence :");
                            rep=sc.next();
                            adresse1.setVille(rep);
                            System.out.println("Rue :");
                            rep=sc.next();
                            adresse1.setRue(rep);
                            System.out.println("Numero de porte");
                            rep=sc.next();
                            adresse1.setNumPorte(rep);

                            entreprise.setAdresseEnt(adresse1);

                            occupation.setEntreprise(entreprise);

                            dude.setOccupation(occupation);

                            //Num de Telephone
                            System.out.println("-=-Telephone-=-");
                            for(int j=0;j<10&&fini==false;j++){
                                Telephone telephone = new Telephone(null,null);
                                System.out.println("Numero de telephone");
                                rep=sc.next();
                                telephone.setNum(rep);
                                System.out.println("Information de Contact");
                                rep=sc.next();
                                telephone.setInformation(rep);
                                dude.setNbTel(dude.getNbTel()+1);
                                dude.getListeNumero()[j]=telephone;
                                System.out.println("Voulez-vous ajoutez un numéro? (o/n)");
                                repChar=sc.next().toLowerCase().charAt(0);
                                if (repChar=='n'){
                                    fini=true;
                                }
                            }
                            fini=false;
                            System.out.println("Voulez-vous ajoutez un autre contact? (o/n)");
                            repChar=sc.next().toLowerCase().charAt(0);
                            if (repChar=='n'){
                                continuer='n';
                            }
                        }
                        else{
                            System.out.println("Cet emplacement de contact est occupé.");

                        }
                    }
                    break;
                case 2 :
                    while(continuer=='o'){
                        System.out.println("Quel contact voulez-vous modifier?");
                        placeContact=sc.nextInt();
                        placeContact=placeContact-1;
                        if (contact[placeContact]!=null){
                            fini1=false;
                            while (fini1==false){
                                System.out.println("Que voulez vous modifiez?");
                                System.out.println("Nom? (n)");
                                System.out.println("Prénom? (p)");
                                System.out.println("Adresse? (a)");
                                System.out.println("Occupation? (o)");
                                System.out.println("Information? (i)");
                                repChar=sc.next().toLowerCase().charAt(0);
                                switch (repChar){
                                    case 'n' :
                                        System.out.println("Nom :");
                                        rep=sc.next();
                                        contact[placeContact].setNom(rep);
                                        break;
                                    case 'p' :
                                        System.out.println("Prénom :");
                                        rep=sc.next();
                                        contact[placeContact].setPrenom(rep);
                                        break;
                                    case 'a' :
                                        Adresse adresse = new Adresse("1A","rue",null,"Saguenay","Quebec","Canada");
                                        System.out.println("-=-Adresse Personnelle-=-");
                                        System.out.println("Pays de résidence :");
                                        rep=sc.next();
                                        adresse.setPays(rep);
                                        System.out.println("Province/État de résidence :");
                                        rep=sc.next();
                                        adresse.setProvince(rep);
                                        System.out.println("Ville de résidence :");
                                        rep=sc.next();
                                        adresse.setVille(rep);
                                        System.out.println("Appartement (o/n) :");
                                        repChar=sc.next().toLowerCase().charAt(0);
                                        if (repChar=='o'){//facultatif
                                            System.out.println("Nom de l'appart :");
                                            rep=sc.next();
                                            adresse.setAppart(rep);
                                        }
                                        System.out.println("Rue :");
                                        rep=sc.next();
                                        adresse.setRue(rep);
                                        System.out.println("Numero de porte");
                                        rep=sc.next();
                                        adresse.setNumPorte(rep);

                                        contact[placeContact].setAdresse(adresse);
                                        break;
                                    case 'o' :
                                        Occupation occupation = new Occupation(null,null);
                                        Entreprise entreprise = new Entreprise(null,null);

                                        System.out.println("-=-Information-=-");
                                        System.out.println("Occupation :");
                                        rep=sc.next();

                                        occupation.setPoste(rep);

                                        Adresse adresse1 = new Adresse("1A","rue",null,"Saguenay","Quebec","Canada");
                                        System.out.println("Entreprise d'employement :");
                                        rep=sc.next();
                                        entreprise.setNom(rep);
                                        System.out.println("-=-Adresse de l'entreprise-=-");
                                        System.out.println("Pays de résidence :");
                                        rep=sc.next();
                                        adresse1.setPays(rep);
                                        System.out.println("Province/État de résidence :");
                                        rep=sc.next();
                                        adresse1.setProvince(rep);
                                        System.out.println("Ville de résidence :");
                                        rep=sc.next();
                                        adresse1.setVille(rep);
                                        System.out.println("Rue :");
                                        rep=sc.next();
                                        adresse1.setRue(rep);
                                        System.out.println("Numero de porte");
                                        rep=sc.next();
                                        adresse1.setNumPorte(rep);

                                        entreprise.setAdresseEnt(adresse1);

                                        occupation.setEntreprise(entreprise);

                                        contact[placeContact].setOccupation(occupation);
                                        break;
                                    case 'i' :
                                        System.out.println("-=-Telephone-=-");
                                        for(int j=0;j<10&&fini==false;j++){
                                            Telephone telephone = new Telephone(null,null);
                                            System.out.println("Numero de telephone");
                                            rep=sc.next();
                                            telephone.setNum(rep);
                                            System.out.println("Information de Contact");
                                            rep=sc.next();
                                            telephone.setInformation(rep);

                                            contact[placeContact].getListeNumero()[j]=telephone;
                                            System.out.println("Voulez-vous ajoutez un numéro? (o/n)");
                                            repChar=sc.next().toLowerCase().charAt(0);
                                            if (repChar=='n'){
                                                fini=true;
                                            }
                                        }
                                        fini=false;
                                        break;
                                    default :
                                        System.out.println("ok");
                                        break;
                                }
                                System.out.println("Voulez-vous modifiez d'autres parametres? (o/n)");
                                repChar=sc.next().toLowerCase().charAt(0);
                                if (repChar=='n'){
                                    fini1=true;
                                }
                            }
                            continuer='n';
                        }
                        else{
                            System.out.println("Cet emplacement est vide");
                        }
                    }
                    break;
                case 3 :
                    while(continuer=='o'){
                        System.out.println("Quel contact voulez vous afficher?");
                        placeContact=sc.nextInt();
                        placeContact=placeContact-1;
                        System.out.println("");
                        System.out.println("Nom : "+contact[placeContact].getNom());
                        System.out.println("Prenom : "+contact[placeContact].getPrenom());
                        System.out.println("");
                        System.out.println("-=-Adresse Personnelle-=-");
                        System.out.println("Pays de résidence : "+contact[placeContact].getAdresse().getPays());
                        System.out.println("Province/État de résidence : "+contact[placeContact].getAdresse().getProvince());
                        System.out.println("Ville de résidence : "+contact[placeContact].getAdresse().getVille());
                        if (contact[placeContact].getAdresse().getAppart()!=null){
                            System.out.println("Appartement : "+contact[placeContact].getAdresse().getAppart());
                        }
                        System.out.println("Rue : "+contact[placeContact].getAdresse().getRue());
                        System.out.println("Numero de porte : "+contact[placeContact].getAdresse().getNumPorte());
                        System.out.println("");
                        System.out.println("-=-Information-=-");
                        System.out.println("Occupation : "+contact[placeContact].getOccupation().getPoste());
                        System.out.println("Entreprise d'employement : "+contact[placeContact].getOccupation().getEntreprise().getNom());
                        System.out.println("");
                        System.out.println("-=-Adresse de l'entreprise-=-");
                        System.out.println("Pays de résidence : "+contact[placeContact].getOccupation().getEntreprise().getAdresseEnt().getPays());
                        System.out.println("Province/État de résidence : "+contact[placeContact].getOccupation().getEntreprise().getAdresseEnt().getProvince());
                        System.out.println("Ville de résidence : "+contact[placeContact].getOccupation().getEntreprise().getAdresseEnt().getVille());
                        System.out.println("Rue : "+contact[placeContact].getOccupation().getEntreprise().getAdresseEnt().getRue());
                        System.out.println("Numero de porte "+contact[placeContact].getOccupation().getEntreprise().getAdresseEnt().getNumPorte());
                        System.out.println("");
                        System.out.println("-=-Telephone-=-");
                        for (int h=0;h<contact[placeContact].getNbTel();h++){
                            if (contact[placeContact].getNbTel()<=h){
                                System.out.println("Numero de telephone : " +contact[placeContact].getListeNumero()[h].getNum());
                                System.out.println("Information : "+contact[placeContact].getListeNumero()[h].getInformation());
                            }
                        }
                        System.out.println("Voulez-vous voir un autre contact? (o/n)");
                        repChar=sc.next().toLowerCase().charAt(0);
                        if (repChar=='n'){
                            continuer='n';
                        }
                    }
                    break;
                default :
                    System.out.println("?????????");
                    break;
            }
        }
        System.exit(0);
    }
}
