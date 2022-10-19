package mediatequ.metier;

public class Entreprise {
    private String nomEntreprise;

    public Entreprise(String nomEntreprise){
        setNomEntreprise(nomEntreprise);
    }

    public String getNomEntreprise() {
        return nomEntreprise;
    }

    public void setNomEntreprise(String nomEntreprise) {
        this.nomEntreprise = nomEntreprise;
    }

    @Override
    public String toString() {
        //return super.toString();
        return  "<" + getNomEntreprise() + ">" ;
    }
}
