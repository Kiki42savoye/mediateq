package mediatequ.metier;

public class Actif extends Adherent {

    private Entreprise employeur;

    public Actif(String nom, String prenom, String dateNaissance, Entreprise entreprise) {
        super(nom, prenom, dateNaissance);

        setEmployeur(entreprise);
    }

    public Entreprise getEmployeur() {
        return employeur;
    }

    public void setEmployeur(Entreprise employeur) {
        this.employeur = employeur;
    }

    @Override
    public String toString() {
        //return super.toString();
        return super.toString() + " " + getEmployeur() + " " + getAge() + " ans";
    }

    public Location louer(Ressource ressource) {
        System.out.println("Location PLEIN TARIF de <" + ressource + "> par <" + this + "> dont l ident adh est <" + this.getIdentAdh() + ">");
        return null;
    }
}
