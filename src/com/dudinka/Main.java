package com.dudinka;

import com.dudinka.model.Person;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {

    public static void maina(String[] args) {
        Person[] maleParticipants = new Person[]{
            new Person("ALLAN COSTA", Person.MALE),
            new Person("ARTHUR LEMES", Person.MALE),
            new Person("CAIQUE MATTOS", Person.MALE),
            new Person("FELIPE MARQUES", Person.MALE),
            new Person("HENRIQUE CIOCCHI", Person.MALE),
            new Person("LUCIAN MIRANDA", Person.MALE),
            new Person("LUIS ADO", Person.MALE),
            new Person("RAFAEL FERNANDES", Person.MALE),
            new Person("RAMON DÜRR", Person.MALE),
            new Person("RENAN PRESTES", Person.MALE)
        };
        Person[] femaleParticipants = new Person[]{
            new Person("AMANDA KIMBERLLY", Person.FEMALE),
            new Person("ANDRESSA ALVES", Person.FEMALE),
            new Person("ANA BÁRBARA LIMA", Person.FEMALE),
            new Person("GABRIELA BERGANTIN", Person.FEMALE),
            new Person("ISABELLA MOTTA", Person.FEMALE),
            new Person("IRINA GATSALOVA", Person.FEMALE),
            new Person("JÉSSICA KUHN", Person.FEMALE),
            new Person("LARISSA BERNARDINI", Person.FEMALE),
            new Person("LAURA BOSON", Person.FEMALE),
            new Person("MIA SIQUEIRA", Person.FEMALE)
        };
        
        HashMap<String, Person> all = new HashMap<>();
        for(Person p : maleParticipants) {
            all.put(p.getName(), p);
        }
        for(Person p : femaleParticipants) {
            all.put(p.getName(), p);
        }

        LinkedList<Ceremony> ceremonies;
        try {
            Ceremony ceremony;
            ceremonies = new LinkedList<>();

            //1
            ceremony = new Ceremony(2, 1);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"));
            ceremonies.add(ceremony);

            //2
            ceremony = new Ceremony(2, 2);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("JÉSSICA KUHN"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("IRINA GATSALOVA"));
            ceremonies.add(ceremony);

            //3
            ceremony = new Ceremony(2, 3);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"));
            ceremonies.add(ceremony);

            //4
            ceremony = new Ceremony(3, 4);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("JÉSSICA KUHN"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("LAURA BOSON"));
            ceremonies.add(ceremony);

            //5
            ceremony = new Ceremony(3, 5);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("JÉSSICA KUHN"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("IRINA GATSALOVA"));
            ceremonies.add(ceremony);

            //6
            ceremony = new Ceremony(4, 6);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"));
            ceremonies.add(ceremony);

            //7
            ceremony = new Ceremony(3, 7);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"));
            ceremonies.add(ceremony);
            
            //8
            ceremony = new Ceremony(4, 8);
            ceremony.addPair(all.get("ALLAN COSTA"), all.get("IRINA GATSALOVA"));
            ceremony.addPair(all.get("ARTHUR LEMES"), all.get("LARISSA BERNARDINI"));
            ceremony.addPair(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"));
            ceremony.addPair(all.get("FELIPE MARQUES"), all.get("ANDRESSA ALVES"));
            ceremony.addPair(all.get("HENRIQUE CIOCCHI"), all.get("GABRIELA BERGANTIN"));
            ceremony.addPair(all.get("LUCIAN MIRANDA"), all.get("LAURA BOSON"));
            ceremony.addPair(all.get("LUIS ADO"), all.get("AMANDA KIMBERLLY"));
            ceremony.addPair(all.get("RAFAEL FERNANDES"), all.get("ISABELLA MOTTA"));
            ceremony.addPair(all.get("RAMON DÜRR"), all.get("ANA BÁRBARA LIMA"));
            ceremony.addPair(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"));
            ceremonies.add(ceremony);
            
            //----------------------------
            
            Ceremony.truthBooth(all.get("CAIQUE MATTOS"), all.get("LARISSA BERNARDINI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("CAIQUE MATTOS"), all.get("MIA SIQUEIRA"), true, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("LUIS ADO"), all.get("LAURA BOSON"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("FELIPE MARQUES"), all.get("AMANDA KIMBERLLY"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("RAMON DÜRR"), all.get("ISABELLA MOTTA"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("ALLAN COSTA"), all.get("ANDRESSA ALVES"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("RENAN PRESTES"), all.get("JÉSSICA KUHN"), true, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("LUCIAN MIRANDA"), all.get("GABRIELA BERGANTIN"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("RAFAEL FERNANDES"), all.get("LAURA BOSON"), false, maleParticipants, femaleParticipants, ceremonies);
            
            //Ceremony.truthBooth(all.get("LUCIAN MIRANDA"), all.get("AMANDA KIMBERLLY"), true, maleParticipants, femaleParticipants, ceremonies);
            //Ceremony.truthBooth(all.get("ARTHUR LEMES"), all.get("GABRIELA BERGANTIN"), true, maleParticipants, femaleParticipants, ceremonies);
            
            
            //----------------------------
            
            for(Ceremony c : ceremonies) {
                c.updateKnownResults();
            }
            
            //----------------------------

            Combinator comb = new Combinator(maleParticipants, femaleParticipants, ceremonies);
            comb.run(0);
            
            System.out.println("comb.nSolutions: " + comb.nSolutions);
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
