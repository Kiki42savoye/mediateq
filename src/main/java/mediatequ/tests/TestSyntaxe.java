package mediatequ.tests;

import jdk.nashorn.internal.runtime.NumberToString;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Year;

public class TestSyntaxe {

    /**
     * Procédure permettant de faire une salutation simple à Monsieur avec l'heure courante
     */
    //définition d'une procédure sans retour de résultat
    public static void saluer()
    {
        System.out.println("Bonjour Monsieur");
        System.out.println("Il est actuellement  " + LocalTime.now());
    }

    //création d'une fonction qui calcule le périmètre d'un cercle
    public static double calculerPerimetreCercle(double rayon)
    {
        return(2*Math.PI*rayon);
    }


    /**
     * Procédure permettant de saluer en fonction du genre
     * @param genre
     * genre de la personne que l'on salue, 1 pour Monsieur et 2 pour Madame
     * @param nom
     * nom de la personne que l'on salue
     */
    //création d'une procédure qui effectue une salutation à x, 1 Monsieur, 2 Madame
    public static void saluer(int genre, String nom)
    {
        switch(genre){
            case 1 :
                System.out.println("Bonjour Monsieur " + nom);
                break;
            case 2:
                System.out.println("Bonjour Madame " + nom);
                break;
            default:
                System.out.println("Bonjour " + nom);

        }
     }


    public static void main(String[] args) {
        //Déclaration et valorisation d'une variable
        int compteur;
        compteur = 20;

        System.out.println("Le compteur vaut : " + compteur);

//Déclaration et valorisation d'une constante
        final boolean SUCCES = true;

//Realisation d'un test
//utilisation d'opérateurs de comparaison >, >=, <, <=, ==, !=, !
//if (compteur >= 100)
//opérateurs logique : && et logique || ou logique
        if (compteur >= 100 && SUCCES==true)
        {
            System.out.println("Le compteur a une valeur importante.");
        }
        else
        {
            System.out.println("Le compteur est faible.");
        }


//Traitement itératif
//on connait à l'avance le nombre d'itérations
        for ( int i = 1 ; i <= 10 ; i++) {
            //on ignore le traitement de la valeur 5
            if (i ==5 ) continue;

            System.out.println(i + "x7 = " + i*7);
        }

        //on ne connait pas le nombre d'itération
        double valeur = 1234567.0;
        do {
            System.out.println(valeur);
            valeur = valeur / Math.PI;
        } while (valeur >= 3);

//on ne connait pas à  l'avance le nombre d'itérations
//afficher les 4 premieres années bissextiles après 1857
        Year annee = Year.of(1857);
        int nbAnneesBissextilesTrouvees = 0;

        while (nbAnneesBissextilesTrouvees < 4)
        {
            if (annee.isLeap() )
            {
                System.out.println(annee);
                nbAnneesBissextilesTrouvees++;
            }

            //On passe à l'annee suivante
            annee=annee.plusYears(1);
        }


        int moisCourant = 10;

        switch(moisCourant)
        {
            case 1:
                System.out.println("31 jours");
                break;
            case 4:
                System.out.println("30 jours");
                break;
            case 10:
                System.out.println("31 jours");
                break;
            default:
                System.out.println("nombre de jours inconnu");

        }


        //Tableaux
        //tableau d'une capacité de 7 avec Mardi en position 1
        String joursDeLaSemaine[] = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        System.out.println(joursDeLaSemaine[1]);

        //Tableaux de codes postaux
        String[] codesPostaux = new String[40000];
        for (int i = 0 ; i < 40000 ; i++) {
            //codesPostaux[i] = i+10000+"";
            codesPostaux[i] = String.valueOf(i+10000);
        }
        System.out.println(codesPostaux[1]);
        System.out.println(codesPostaux[2]);



        //Tableaux à double entrée

        String[][] annuaire = new String[21][4];
        for (int i = 0 ; i < 21 ; i++) {
            for (int j = 0 ; j < 4 ; j++) {
                //annuaire[i][0]=
            }
        }

        //Affichage de tous les jours de la semaine
        //String joursDeLaSemaine[] = {"Lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"};
        for ( String unJour : joursDeLaSemaine) {
            System.out.println(unJour);
        }

        //utilisation de procédure
        saluer();

        //utilisation de fonction
        double rayon = 5;
        double perimetre = calculerPerimetreCercle(rayon);
        System.out.println("Le perimetre d'un cercle de rayon "+rayon+" est : " + perimetre);

        //utilisation de la 2° procédure
        saluer(2,"Delhoustal");
        saluer(1,"Suzat");
        saluer(0,"Lola");

    }
}
