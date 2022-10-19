package mediatequ.metier;

public class Carte {
    private Personne proprietaire;
    private String identCarte;

    private static int compteur;

    public Carte (Personne proprietaire) {
        setProprietaire(proprietaire);
        //on met la carte dans la poche du proprietaire
        //proprietaire.setCarte(this); ou
        getProprietaire().setCarte(this);

        //Autogeneration de l'identifiant de la carte
        compteur++;
        setIdentCarte("CART"+compteur);
    }

    public Personne getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Personne proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getIdentCarte() {
        return identCarte;
    }

    public void setIdentCarte(String identCarte) {
        this.identCarte = identCarte;
    }


}
