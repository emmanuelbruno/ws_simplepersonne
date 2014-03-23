package fr.univtln.bruno.test.simple.personne;

/**
 * Created by bruno on 23/03/14.
 */
public class Chien {
    private int id;
    private String nom;
    private Personne maitre;

    public Chien(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMaitre(Personne maitre) {
        this.maitre = maitre;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Personne getMaitre() {
        return maitre;
    }
}
