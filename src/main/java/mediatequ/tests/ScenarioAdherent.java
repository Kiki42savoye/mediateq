package mediatequ.tests;

import com.sun.org.apache.bcel.internal.generic.NEW;
import mediatequ.metier.*;

import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Set;

public class ScenarioAdherent {
    public static void main(String[] args) {
        //Creation d'un Adherent
        Adherent adhChde = new Adherent("Delhoustal", "Christelle", "1972-10-10");
        System.out.println("Votre nom est : " + adhChde.getNom());

        //Lui demander le numero de sa carte
        if ( adhChde.getCarte() != null) {
            System.out.println("Votre numéro de carte adherent est : " + adhChde.getCarte().getIdentCarte());
        }

        //Lui demander le nom du jour de sa naissance (lundi, mardi...)
        System.out.println(adhChde.getDateNaissance().getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault()));

        //Lui demander de louer "Harry potter"
        adhChde.louer(new Ressource("Harry Potter"));

        Adherent adhFps = new Adherent("Suzat", "Fred", "1975-10-18");
        adhFps.louer(new Ressource("la vie de Johnny"));

        Etudiant adhEtud1 = new Etudiant("NomEtud1", "PrenomEtud1", "2000-01-01", new Universite("La Sorbonne"));
        adhEtud1.louer(new Ressource("la vie terrible d'etudiant"));

        //Entreprise entre1 = new Entreprise("Savoye");
        Entreprise enter1 = new Entreprise("Savoye");
        Actif adhAct1 = new Actif("NomAct1", "PrenomAct1", "1980-12-08", enter1);
        adhAct1.louer(new Ressource("chouette du boulot"));


        //creation d'un tableau d'adhérents
        Adherent[] annuaire = new Adherent[10];
        annuaire[0]=adhChde;
        annuaire[1]=adhFps;
        annuaire[2]=adhEtud1;
        annuaire[3]=adhAct1;

        //on demande au tableau de nous fournir un des éléments
        Adherent adhRang2 = annuaire[2];
        adhRang2.louer(null);
        //le programme parvient à trouver que l'annuaire du rang 2 est un adherent

        //adhRang2.getCampus();
        //mais ne fonctionne pas... il faut caster l'objet

        Etudiant etudiantRang2 = (Etudiant) adhRang2;
        System.out.println(etudiantRang2.getCampus());

        //permet de connaitre la classe de l'élément
        //System.out.println(adhRang2.getClass());
        //class mediatequ.metier.Etudiant
        //System.out.println(adhRang2.getClass().getCanonicalName());
        //mediatequ.metier.Etudiant
        //System.out.println(adhRang2.getClass().getSimpleName());
        //Etudiant

        for (int i = 0 ; i < 4 ; i++) {
            if (annuaire[i].getClass().getSimpleName().equals("Etudiant")){
                Etudiant etudiantRang = (Etudiant) annuaire[i];
                System.out.println("Etudiant "+ etudiantRang.getNom() + " sur le campus : "+ etudiantRang.getCampus());
            }
        }

        //tableau destiné au stockage d'actifs, étudiants et retraités et afficher le nom et le prénom de l'élément situé au rang 1
        Object[] tabFourreTout = new Object[10];
        tabFourreTout[0]=adhChde;
        tabFourreTout[1]=enter1;
        tabFourreTout[2]=adhEtud1;
        tabFourreTout[3]=adhAct1;

        if (tabFourreTout[1] instanceof Personne) {
            Personne personne = (Personne) tabFourreTout[1];
            System.out.println("Rang1 : " + personne.getNom() + " " + personne.getPrenom());
        }
        else if (tabFourreTout[2] instanceof Personne) {
            Personne personne = (Personne) tabFourreTout[2];
            System.out.println("Rang2 : " + personne.getNom() + " " + personne.getPrenom());
        }


        //méthode equals dans object qui permet de comparer si 2 objets sont identiques
        System.out.println(adhRang2.equals(etudiantRang2));
        //c'est true car on a fait une seule fois new... c'est le même objet que l'on a changé de dénomination
    }
}
