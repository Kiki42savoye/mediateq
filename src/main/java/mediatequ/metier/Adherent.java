package mediatequ.metier;

import java.time.LocalDate;

public class Adherent extends Personne{

    private String identAdh;
    private LocalDate dateAdhesion;

    private static int compteur;

    public Adherent(String nom, String prenom, String dateNaissance) {
        //appel du constructeur parent
        super(nom, prenom, dateNaissance);

        //Autogeneration de l'identifiant de la carte
        compteur++;
        setIdentAdh("ADH"+compteur);
    }

    public String getIdentAdh() {
        return identAdh;
    }

    public void setIdentAdh(String identAdh) {
        this.identAdh = identAdh;
    }

    public LocalDate getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(LocalDate dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public Location louer(Ressource ressource) {
        System.out.println("Location de <" + ressource + "> par <" + this + "> dont l ident adh est <" + this.getIdentAdh() + ">");
        return null;
    }
}
