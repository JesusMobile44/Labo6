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
        Contact contact[] = new Contact[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Bienvenue dans votre liste de contact!");
        System.out.println("======================================");
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
                            Telephone telephone = new Telephone(null,null);
                            Contact dude = new Contact("Jass","Hugh",null,null,null);
                            contact[placeContact-1]=dude;

                            //Questions
                            System.out.println("Prénom :");
                            rep=sc.next();
                            dude.setPrenom(rep);
                            System.out.println("Nom :");
                            rep=sc.next();
                            dude.setNom(rep);
                            //adresse
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
                            //Occupation
                            System.out.println("Entreprise d'employement :");
                            rep=sc.next();
                            entreprise.setNom(rep);
                            System.out.println("Adresse de l'entreprise");
                            System.out.println("Pays de résidence :");
                            rep=sc.next();
                            adresse.setPays(rep);
                            System.out.println("Province/État de résidence :");
                            rep=sc.next();
                            adresse.setProvince(rep);
                            System.out.println("Ville de résidence :");
                            rep=sc.next();
                            adresse.setVille(rep);
                        }
                        else{
                            System.out.println("Cet emplacement de contact est occupé.");

                        }
                    }
                    break;
                case 2 :
                    while(continuer=='o'){

                    }
                    break;
                case 3 :
                    while(continuer=='o'){

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
