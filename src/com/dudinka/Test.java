package com.dudinka;

import com.dudinka.model.Person;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author eduardo
 */
public class Test {
    public static void main(String[] args) {
        Person[] maleParticipants = new Person[]{
            new Person("ALEC", Person.MALE),
            new Person("AUSTIN", Person.MALE),
            new Person("CHUCK", Person.MALE),
            new Person("CONNOR", Person.MALE),
            new Person("DEVIN", Person.MALE),
            new Person("HUNTER", Person.MALE),
            new Person("MIKE", Person.MALE),
            new Person("NELSON", Person.MALE),
            new Person("TYLER", Person.MALE),
            new Person("ZAK", Person.MALE)
        };
        Person[] femaleParticipants = new Person[]{
            new Person("AMANDA", Person.FEMALE),
            new Person("BRITNI", Person.FEMALE),
            new Person("CHELSEY", Person.FEMALE),
            new Person("CHEYENNE", Person.FEMALE),
            new Person("HANNAH", Person.FEMALE),
            new Person("KAYLA", Person.FEMALE),
            new Person("KIKI", Person.FEMALE),
            new Person("MELANIE", Person.FEMALE),
            new Person("RASHIDA", Person.FEMALE),
            new Person("STACEY", Person.FEMALE)
        };
        
//        for(Person p : femaleParticipants) {
//            System.out.println(p.getName());
//        }
//        System.exit(0);
        
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
            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("KIKI"));
            ceremony.addPair(all.get("CHUCK"), all.get("HANNAH"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("MELANIE"));
            ceremony.addPair(all.get("HUNTER"), all.get("BRITNI"));
            ceremony.addPair(all.get("MIKE"), all.get("AMANDA"));
            ceremony.addPair(all.get("NELSON"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("TYLER"), all.get("RASHIDA"));
            ceremony.addPair(all.get("ZAK"), all.get("KAYLA"));
            ceremonies.add(ceremony);
            
            //2
            ceremony = new Ceremony(0, 2);
            ceremony.addPair(all.get("ALEC"), all.get("CHELSEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("KIKI"));
            ceremony.addPair(all.get("CHUCK"), all.get("HANNAH"));
            ceremony.addPair(all.get("CONNOR"), all.get("KAYLA"));
            ceremony.addPair(all.get("DEVIN"), all.get("MELANIE"));
            ceremony.addPair(all.get("HUNTER"), all.get("STACEY"));
            ceremony.addPair(all.get("MIKE"), all.get("AMANDA"));
            ceremony.addPair(all.get("NELSON"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("TYLER"), all.get("RASHIDA"));
            ceremony.addPair(all.get("ZAK"), all.get("BRITNI"));
            ceremonies.add(ceremony);
            
            //3
            ceremony = new Ceremony(3, 3);
            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("AMANDA"));
            ceremony.addPair(all.get("CHUCK"), all.get("KIKI"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("RASHIDA"));
            ceremony.addPair(all.get("HUNTER"), all.get("BRITNI"));
            ceremony.addPair(all.get("MIKE"), all.get("KAYLA"));
            ceremony.addPair(all.get("NELSON"), all.get("MELANIE"));
            ceremony.addPair(all.get("TYLER"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("ZAK"), all.get("HANNAH"));
            ceremonies.add(ceremony);
            
            //4
            ceremony = new Ceremony(2, 4);
            ceremony.addPair(all.get("ALEC"), all.get("AMANDA"));
            ceremony.addPair(all.get("AUSTIN"), all.get("STACEY"));
            ceremony.addPair(all.get("CHUCK"), all.get("KIKI"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("HANNAH"));
            ceremony.addPair(all.get("HUNTER"), all.get("RASHIDA"));
            ceremony.addPair(all.get("MIKE"), all.get("KAYLA"));
            ceremony.addPair(all.get("NELSON"), all.get("BRITNI"));
            ceremony.addPair(all.get("TYLER"), all.get("MELANIE"));
            ceremony.addPair(all.get("ZAK"), all.get("CHEYENNE"));
            ceremonies.add(ceremony);
            
            //5
            ceremony = new Ceremony(2, 5);
            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("HANNAH"));
            ceremony.addPair(all.get("CHUCK"), all.get("KIKI"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("HUNTER"), all.get("MELANIE"));
            ceremony.addPair(all.get("MIKE"), all.get("BRITNI"));
            ceremony.addPair(all.get("NELSON"), all.get("RASHIDA"));
            ceremony.addPair(all.get("TYLER"), all.get("AMANDA"));
            ceremony.addPair(all.get("ZAK"), all.get("KAYLA"));
            ceremonies.add(ceremony);
            
            //6
            ceremony = new Ceremony(3, 6);
            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("CHUCK"), all.get("AMANDA"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("RASHIDA"));
            ceremony.addPair(all.get("HUNTER"), all.get("BRITNI"));
            ceremony.addPair(all.get("MIKE"), all.get("MELANIE"));
            ceremony.addPair(all.get("NELSON"), all.get("KIKI"));
            ceremony.addPair(all.get("TYLER"), all.get("HANNAH"));
            ceremony.addPair(all.get("ZAK"), all.get("KAYLA"));
            ceremonies.add(ceremony);
            
            //7
            ceremony = new Ceremony(3, 7);
            ceremony.addPair(all.get("ALEC"), all.get("RASHIDA"));
            ceremony.addPair(all.get("AUSTIN"), all.get("KAYLA"));
            ceremony.addPair(all.get("CHUCK"), all.get("MELANIE"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("BRITNI"));
            ceremony.addPair(all.get("HUNTER"), all.get("AMANDA"));
            ceremony.addPair(all.get("MIKE"), all.get("STACEY"));
            ceremony.addPair(all.get("NELSON"), all.get("KIKI"));
            ceremony.addPair(all.get("TYLER"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("ZAK"), all.get("HANNAH"));
            ceremonies.add(ceremony);
            
            //8
            ceremony = new Ceremony(3, 8);
            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
            ceremony.addPair(all.get("AUSTIN"), all.get("KIKI"));
            ceremony.addPair(all.get("CHUCK"), all.get("AMANDA"));
            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
            ceremony.addPair(all.get("DEVIN"), all.get("RASHIDA"));
            ceremony.addPair(all.get("HUNTER"), all.get("BRITNI"));
            ceremony.addPair(all.get("MIKE"), all.get("MELANIE"));
            ceremony.addPair(all.get("NELSON"), all.get("KAYLA"));
            ceremony.addPair(all.get("TYLER"), all.get("CHEYENNE"));
            ceremony.addPair(all.get("ZAK"), all.get("HANNAH"));
            ceremonies.add(ceremony);
            
            //9
//            ceremony = new Ceremony(2, 9);
//            ceremony.addPair(all.get("ALEC"), all.get("STACEY"));
//            ceremony.addPair(all.get("AUSTIN"), all.get("CHEYENNE"));
//            ceremony.addPair(all.get("CHUCK"), all.get("RASHIDA"));
//            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
//            ceremony.addPair(all.get("DEVIN"), all.get("BRITNI"));
//            ceremony.addPair(all.get("HUNTER"), all.get("KAYLA"));
//            ceremony.addPair(all.get("MIKE"), all.get("KIKI"));
//            ceremony.addPair(all.get("NELSON"), all.get("AMANDA"));
//            ceremony.addPair(all.get("TYLER"), all.get("MELANIE"));
//            ceremony.addPair(all.get("ZAK"), all.get("HANNAH"));
//            ceremonies.add(ceremony);
            
            //10
//            ceremony = new Ceremony(10, 10);
//            ceremony.addPair(all.get("ALEC"), all.get("AMANDA"));
//            ceremony.addPair(all.get("AUSTIN"), all.get("BRITNI"));
//            ceremony.addPair(all.get("CHUCK"), all.get("MELANIE"));
//            ceremony.addPair(all.get("CONNOR"), all.get("CHELSEY"));
//            ceremony.addPair(all.get("DEVIN"), all.get("RASHIDA"));
//            ceremony.addPair(all.get("HUNTER"), all.get("HANNAH"));
//            ceremony.addPair(all.get("MIKE"), all.get("KIKI"));
//            ceremony.addPair(all.get("NELSON"), all.get("STACEY"));
//            ceremony.addPair(all.get("TYLER"), all.get("CHEYENNE"));
//            ceremony.addPair(all.get("ZAK"), all.get("KAYLA"));
//            ceremonies.add(ceremony);
            
            //----------------------------
            
            Ceremony.truthBooth(all.get("HUNTER"), all.get("KIKI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("DEVIN"), all.get("KIKI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("ZAK"), all.get("KIKI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("CHUCK"), all.get("BRITNI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("CONNOR"), all.get("CHELSEY"), true, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("CHUCK"), all.get("KIKI"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("ALEC"), all.get("MELANIE"), false, maleParticipants, femaleParticipants, ceremonies);
            Ceremony.truthBooth(all.get("NELSON"), all.get("KIKI"), false, maleParticipants, femaleParticipants, ceremonies);
//            Ceremony.truthBooth(all.get("HUNTER"), all.get("BRITNI"), false, maleParticipants, femaleParticipants, ceremonies);
//            Ceremony.truthBooth(all.get("ZAK"), all.get("KAYLA"), true, maleParticipants, femaleParticipants, ceremonies);
            
            //ALEC      /       KIKI
            //AUSTIN    /       AMANDA
            //CHUCK     /       STACEY
            //CONNOR    /       CHELSEY
            //DEVIN     /       BRITNI
            //HUNTER    /       RASHIDA
            //MIKE      /       MELANIE
            //NELSON    /       HANNAH
            //TYLER     /       CHEYENNE
            //ZAK       /       KAYLA
            
            //ALEC      /       KIKI
            //AUSTIN    /       STACEY
            //CHUCK     /       AMANDA
            //CONNOR    /       CHELSEY
            //DEVIN     /       BRITNI
            //HUNTER    /       HANNAH
            //MIKE      /       RASHIDA
            //NELSON    /       MELANIE
            //TYLER     /       CHEYENNE
            //ZAK       /       KAYLA
            
            //ALEC      /       HANNAH
            //AUSTIN    /       MELANIE
            //CHUCK     /       STACEY
            //CONNOR    /       CHELSEY
            //DEVIN     /       RASHIDA
            //HUNTER    /       AMANDA
            //MIKE      /       KIKI
            //NELSON    /       BRITNI
            //TYLER     /       CHEYENNE
            //ZAK       /       KAYLA
            
            //ALEC      /       AMANDA
            //AUSTIN    /       BRITNI
            //CHUCK     /       MELANIE
            //CONNOR    /       CHELSEY
            //DEVIN     /       RASHIDA
            //HUNTER    /       HANNAH
            //MIKE      /       KIKI
            //NELSON    /       STACEY
            //TYLER     /       CHEYENNE
            //ZAK       /       KAYLA
            
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
