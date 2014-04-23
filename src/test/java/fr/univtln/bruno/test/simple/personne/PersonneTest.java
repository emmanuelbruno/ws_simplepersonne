package fr.univtln.bruno.test.simple.personne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Personne Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mars 24, 2014</pre>
 */
public class PersonneTest {

    private int id = 1;
    private String prenom = "Pierre";
    private String nom = "Durand";
    Personne p;
    Chien c1;
    Chien c2;

    @Before
    public void before() throws Exception {
        p = new Personne(id, nom, prenom);
        c1 = new Chien(1, "Médor");
        c2 = new Chien(2, "Rex");
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setNom(String nom)
     */
    @Test
    public void testSetNom() throws Exception {
        Assert.assertEquals(nom, p.getNom());
        p.setNom("Dupond");
        Assert.assertEquals("Dupond", p.getNom());
    }

    /**
     * Method: setPrenom(String prenom)
     */
    @Test
    public void testSetPrenom() throws Exception {
        Assert.assertEquals(prenom, p.getPrenom());
        p.setPrenom("Jean");
        Assert.assertEquals("Jean", p.getPrenom());
    }

    /**
     * Method: getId()
     */
    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(id, p.getId());
    }

    /**
     * Method: getNom()
     */
    @Test
    public void testGetNom() throws Exception {
        Assert.assertEquals(nom, p.getNom());
    }

    /**
     * Method: getPrenom()
     */
    @Test
    public void testGetPrenom() throws Exception {
        Assert.assertEquals(prenom, p.getPrenom());
    }

    /**
     * Method: getChiens()
     */
    @Test
    public void testGetChiens() throws Exception {
        Assert.assertTrue(p.getChiens().size()==0);
        p.addChien(c1);
        Assert.assertTrue(p.getChiens().size() == 1 && p.getChiens().contains(c1));
        p.addChien(c2);
        Assert.assertTrue(p.getChiens().size() == 2 && p.getChiens().contains(c1) && p.getChiens().contains(c2));
    }

    /**
     * Method: setChiens(List<Chien> chiens)
     */
    @Test
    public void testSetChiens() throws Exception {
        List<Chien> chiens = new ArrayList<>();
        chiens.add(c1);
        chiens.add(c2);
        p.setChiens(chiens);
        Assert.assertEquals(chiens,p.getChiens());
    }

    /**
     * Method: addChien(Chien chien)
     */
    @Test
    public void testAddChien() throws Exception {
        Assert.assertTrue(p.getChiens().size()==0);
        p.addChien(c1);
        Assert.assertTrue(p.getChiens().size() == 1 && p.getChiens().contains(c1));
        p.addChien(c2);
        Assert.assertTrue(p.getChiens().size() == 2 && p.getChiens().contains(c1) && p.getChiens().contains(c2));
    }

    /**
     * Method: removeChien(Object o)
     */
    @Test
    public void testRemoveChien() throws Exception {
        List<Chien> chiens = new ArrayList<>();
        chiens.add(c1);
        chiens.add(c2);
        p.setChiens(chiens);
        p.removeChien(c1);
        Assert.assertFalse(p.getChiens().contains(c1));
        p.removeChien(c2);
        Assert.assertTrue(p.getChiens().size()==0);
    }

} 
