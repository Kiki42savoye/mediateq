package mediatequ.tests;

import mediatequ.metier.Carte;
import mediatequ.metier.Personne;

import java.time.LocalDate;

public class ScenarioPersonne {
    public static void main(String[] args) {
        //déclaration et instanciation d'une personne
        //Personne p1 = new Personne();
        Personne p1 = new Personne("Rat", "gondin");
        Personne chde = new Personne("Delhoustal","Christelle", "1972-10-10");
        //System.out.println("L'année de naissance de " + p2.getNom() + " est : " + p2.getDateNaissance().getYear());
        Personne p3 = new Personne("Lu", "in");
        Personne fps = new Personne ("Suzat", "Fred", "1975-10-18");

        //non possible car private
        //p1.nom = "titi";

        //p1.setNom("Delhoustal");
        //p1.setNom("Lu");
        //p1.setPrenom("Christelle");
        //p1.setDateNaissance(LocalDate.parse("1972-10-10"));
        p1.marcher();
        chde.marcher();
        p3.marcher();

        //calcul du nb d'annees entre 2 dates
        LocalDate dateArmistice1918 = LocalDate.parse("1918-11-11");
        LocalDate dateJour = LocalDate.now();

        //System.out.println("Difference date pour p1 : " + p1.getNbAnnees(dateArmistice1918,dateJour));
        //System.out.println("Difference date pour Personne : " + Personne.getNbAnnees(dateJour, dateArmistice1918));

        System.out.println("Age de "+ chde.getNom() + " est : " + chde.getAge());
        System.out.println("Age de "+ fps.getNom() + " est : " + fps.getAge());

        Carte cart = new Carte(chde);
        //cart.setIdentCarte("C1234");
        //p1.setCarte(cart); ne sert plus car on le fait à la construction
        System.out.println("La carte p1 appartient à : " + cart.getProprietaire().getNom());
        System.out.println("chde a la carte : " + chde.getCarte().getIdentCarte());
        //afficher le mois de naissance du proprietaire de la carte
        System.out.println("Le mois du proprietaire de la carte : " + cart.getProprietaire().getDateNaissance().getMonth());
    }
}
