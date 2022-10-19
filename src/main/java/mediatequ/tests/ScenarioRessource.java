package mediatequ.tests;

import mediatequ.metier.Ressource;

public class ScenarioRessource {
    public static void main(String[] args) {
        Ressource r1 = new Ressource("Born in the USA");

        System.out.println("Le titre de la ressource est : " + r1.getTitre());
    }
}
