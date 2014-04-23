package fr.univtln.bruno.test.simple.personne;

import fr.univtln.bruno.test.simple.jsoncoder.JSONCoder;import fr.univtln.bruno.test.simple.personne.Chien;
import fr.univtln.bruno.test.simple.personne.Personne;

import javax.websocket.DecodeException;
import javax.websocket.EncodeException;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.String;import java.lang.System;import java.util.ArrayList;
import java.util.List;

/**
 * Created by bruno on 23/03/14.
 */
public class Main {

    public static void main(String[] args) throws IOException, EncodeException {
        Chien c1 = new Chien(1, "Rex");
        Chien c2 = new Chien(1, "Médor");
        List<Chien> listeChiens = new ArrayList<>();
        listeChiens.add(c1);
        listeChiens.add(c2);

        Personne p1 = new Personne(1, "Durand", "Marie");
        Personne p2 = new Personne(2, "Dupond", "Marc");
        List<Personne> listPersonnes = new ArrayList<>();
        listPersonnes.add(p1);
        listPersonnes.add(p2);

        p1.addChien(c1);
        p2.addChien(c2);


        StringWriter chienStringWriter = new StringWriter();
        StringWriter personneStringWriter = new StringWriter();


        JSONCoder<List<Chien>> jsonCoderChiens = new JSONCoder<>();
        jsonCoderChiens.init();
        jsonCoderChiens.encode(listeChiens, chienStringWriter);
        String chiensJSON = chienStringWriter.toString();
        System.out.println("Les chiens en JSON: ");
        System.out.println(chiensJSON);

        JSONCoder<List<Personne>> jsonCoderPersonnes = new JSONCoder<>();
        jsonCoderPersonnes.init();
        jsonCoderPersonnes.encode(listPersonnes, personneStringWriter);
        String personnesJSON = personneStringWriter.toString();
        System.out.println("Les personnes en JSON: ");
        System.out.println(personnesJSON);

        /*
        try {
            List<Chien> newChiens = jsonCoderChiens.decode(new StringReader(chiensJSON));
            System.out.println(newChiens);
        } catch (DecodeException e) {
            e.printStackTrace();
        }*/


        try {
            List<Personne> newPersonnes = jsonCoderPersonnes.decode(new StringReader(personnesJSON));
            System.out.println(newPersonnes);
        } catch (DecodeException e) {
            e.printStackTrace();
        }

    }
}
