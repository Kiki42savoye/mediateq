package mediatequ.metier;

public class Ressource {

    private String titre;

    public Ressource(String titre) {
        setTitre(titre);
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }


    @Override
    public String toString() {
        return getTitre();
    }
}
