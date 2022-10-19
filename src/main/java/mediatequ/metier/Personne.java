package mediatequ.metier;

import java.time.LocalDate;
import java.time.Period;

public class Personne {

    //Propriétés
    private String nom;
    private String prenom;
    private LocalDate dateNaissance;

    private Carte carte;


    //Méthodes
    //on crée une méthode pour obliger d'avoir un nom et un prénom lors de la création de'une personne
    public Personne(String nom, String prenom){
        setNom(nom);
        setPrenom(prenom);

        setCarte(new Carte(this));
    }

    public Personne(String nom, String prenom, String dateNaissance){
        //setNom(nom);
        //setPrenom(prenom);
        this(nom, prenom);

        setDateNaissance(LocalDate.parse(dateNaissance));
    }

    public void setNom(String propalNom){
        //on accepte uniquement les propositions de nom qui contiennent au moins 3 caractères
        if (propalNom.length() < 3) {
            System.out.println("Un peu court...");
            //nom = "PROUT";
        }
        else {
            nom = propalNom;
        }
    }

    public void setPrenom(String prenom){
        this.prenom = prenom;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public String getNom() {
        String nomFormatte = null;
        if (nom != null){
            nomFormatte = nom.toUpperCase();
        }

        return nomFormatte;
    }

    public String getPrenom() {
        return prenom;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public Carte getCarte() {
        return carte;
    }

    public void setCarte(Carte carte) {
        this.carte = carte;
    }

    public boolean marcher()
    {
        //System.out.println(prenom + " " + nom + " marche.");
        System.out.println(prenom + " " + this.getNom() + " marche." + this.getDateNaissance());
        return true;
    }

    //étant donné que l'on est static il ne faudra pas tenter d'atteindre nom, etc
    public static int getNbAnnees(LocalDate date1, LocalDate date2) {
        Period periode1 = Period.between(date1, date2);
        System.out.println("La differnece entre " + date1 + " et " + date2 + " est de : " + periode1.getYears());

        return periode1.getYears();
    }

    //Méthode renvoyant l'age d'une personne
    public int getAge(){
        LocalDate dateJour = LocalDate.now();
        Period periode1 = Period.between(this.getDateNaissance(), dateJour);

        //return periode1.getYears();
        return getNbAnnees(getDateNaissance(), LocalDate.now());
    }

    @Override
    public String toString() {
        return getPrenom() + " " + getNom();
    }
}
