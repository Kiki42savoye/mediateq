package mediatequ.metier;

public class Universite {

    private String nomUniv;

    public Universite(String nom){
        setNomUniv(nom);
    }

    public String getNomUniv() {
        return nomUniv;
    }

    public void setNomUniv(String nomUniv) {
        this.nomUniv = nomUniv;
    }

    @Override
    public String toString() {
        return "<" + getNomUniv() + ">";
    }
}
