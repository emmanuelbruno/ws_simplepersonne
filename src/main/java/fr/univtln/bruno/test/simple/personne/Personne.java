package fr.univtln.bruno.test.simple.personne;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 23/03/14.
 */
public final class Personne {
    private final int id;
    private String nom;
    private String prenom;
    private List<Chien> chiens = new ArrayList<>();

    public Personne(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Chien> getChiens() {
        return chiens;
    }

    public void setChiens(List<Chien> chiens) {
        this.chiens = chiens;
    }

    public boolean addChien(Chien chien) {
        return chiens.add(chien);
    }

    public boolean removeChien(Object o) {
        return chiens.remove(o);
    }
}