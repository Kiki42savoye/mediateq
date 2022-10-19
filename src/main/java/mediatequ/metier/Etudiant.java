package mediatequ.metier;

public class Etudiant extends Adherent {

    private Universite campus;

    public Etudiant(String nom, String prenom, String dateNaissance, Universite campus) {
        super(nom, prenom, dateNaissance);

        setCampus(campus);
    }

    public Universite getCampus() {
        return campus;
    }

    public void setCampus(Universite campus) {
        this.campus = campus;
    }

    //la conversion d'un etudiant en string = nom, prenom, age, campus
    @Override
    public String toString() {
        //return super.toString();
        return super.toString() + " " + getCampus() + " " + getAge() + " ans";
    }

    @Override
    public Location louer(Ressource ressource) {
        //return super.louer(ressource);
        System.out.println("Location GRATUITE de <" + ressource + "> par <" + this + "> dont l ident adh est <" + this.getIdentAdh() + ">");
        return null;
    }
}
