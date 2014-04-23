package fr.univtln.bruno.test.simple.personne;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Chien Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>mars 24, 2014</pre>
 */
public class ChienTest {
    private Chien c;
    private int id = 1;
    private String nom = "Médor";

    @Before
    public void before() throws Exception {
        c = new Chien(id, nom);
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: setNom(String nom)
     */
    @Test
    public void testSetNom() throws Exception {
        Assert.assertEquals(c.getNom(), nom);
        c.setNom("Rex");
        Assert.assertEquals(c.getNom(), "Rex");
    }

    /**
     * Method: setMaitre(Personne maitre)
     */
    @Test
    public void testSetMaitre() throws Exception {
        Personne p = new Personne(1, "Pierre", "Durand");
        c.setMaitre(p);
        Assert.assertEquals(c.getMaitre(), p);
    }

    /**
     * Method: getId()
     */
    @Test
    public void testGetId() throws Exception {
        Assert.assertEquals(c.getId(), id);
    }

    /**
     * Method: getNom()
     */
    @Test
    public void testGetNom() throws Exception {
        Assert.assertEquals(c.getNom(), nom);
    }

    /**
     * Method: getMaitre()
     */
    @Test
    public void testGetMaitre() throws Exception {
        Personne p = new Personne(1, "Pierre", "Durand");
        c.setMaitre(p);
        Assert.assertEquals(c.getMaitre(), p);
        Assert.assertTrue(p.getChiens().contains(c));
    }


} 
