package com.dudinka;

import com.dudinka.model.Person;
import java.util.HashMap;
import java.util.LinkedList;

public class Ceremony {
    private int id;
    private int nMatches;
    private int nAssumedRightMatches;
    private int nAssumedWrongMatches;
    private HashMap<Person, Pair> pairs;
    private int nPairs;

    public Ceremony(int nMatches, int id) {
        this.id = id;
        this.nMatches = nMatches;
        this.nAssumedRightMatches = 0;
        this.nAssumedWrongMatches = 0;
        this.pairs = new HashMap<>();
        this.nPairs = 0;
    }

    public void addPair(Person p1, Person p2) throws Exception {
        if(pairs.containsKey(p1)) {
            throw new Exception("P1 already has a pair");
        }
        if(pairs.containsKey(p2)) {
            throw new Exception("P2 already has a pair");
        }

        Pair newPair = new Pair(p1, p2);
        pairs.put(p1, newPair);
        pairs.put(p2, newPair);
        nPairs++;
    }

    public int getnMatches() {
        return nMatches;
    }

    public boolean addAssumedMatch(Person p1, Person p2) throws Exception {
        Pair pair1 = pairs.get(p1);
        Pair pair2 = pairs.get(p2);

        //Formaram par nesta cerimônia
        if(pair1 == pair2) {
System.out.println(id + " - Assumindo que " + p1.getName() + " + " + p2.getName() + " estava CERTO");

            nAssumedRightMatches++;
            
            if(nAssumedRightMatches > nMatches) {
System.out.println(p1.getName() + " / " + p2.getName() + " = false (estouro positivo) " + nAssumedRightMatches+"/"+nMatches);

                //Roll back
                nAssumedRightMatches--;
                
                return false;
            }
            
            pair1.setResult(Pair.RIGHT);
        }
        
        //Não formaram par nesta cerimônia
        else {
System.out.println(id + " - Assumindo que " + p1.getName() + " + " + pair1.getP2().getName() + " estava ERRADO &");
System.out.println(id + " - Assumindo que " + pair2.getP1().getName() + " + " + p2.getName() + " estava ERRADO");

            if(pair1.getResult() == Pair.UNKNOWN) {
                nAssumedWrongMatches++;
            }
            if(pair2.getResult() == Pair.UNKNOWN) {
                nAssumedWrongMatches++;
            }

            if(nAssumedWrongMatches > nPairs - nMatches) {
System.out.println(id + " - " + p1.getName() + " / " + p2.getName() + " = false (estouro negativo) " + nAssumedWrongMatches+"/"+(nPairs - nMatches));

//                if(p1.getName().equals("HUNTER") && p2.getName().equals("HANNAH")) {
//                    if(p1.getName().equals("HUNTER") && pair1.getP2().getName().equals("MELANIE") &&
//                        pair2.getP1().getName().equals("AUSTIN") && p2.getName().equals("HANNAH")) {
//                        System.out.println("DEBUG");
//                    }
//                }

                //Roll back
                if(pair1.getResult() == Pair.UNKNOWN) {
                    nAssumedWrongMatches--;
                }
                if(pair2.getResult() == Pair.UNKNOWN) {
                    nAssumedWrongMatches--;
                }

                return false;
            }
            
            pair1.addWrongResult();
            pair2.addWrongResult();
        }

System.out.println(id + " - " + p1.getName() + " / " + p2.getName() + " = true " + nAssumedRightMatches+"/"+nMatches+" "+nAssumedWrongMatches+"/"+(nPairs - nMatches));
        return true;
    }

    public void removeAssumedMatch(Person p1, Person p2) throws Exception {
        Pair pair1 = pairs.get(p1);
        Pair pair2 = pairs.get(p2);

        if(pair1 == pair2) {
            pair1.setResult(Pair.UNKNOWN);
            
            nAssumedRightMatches--;
            
            if(nAssumedRightMatches < 0) {
                throw new Exception("nAssumedRightMatches < 0");
            }
        }
        else {
            pair1.removeWrongResult();
            pair2.removeWrongResult();
            
            if(pair1.getResult() == Pair.UNKNOWN) {
                nAssumedWrongMatches--;
            }
            if(pair2.getResult() == Pair.UNKNOWN) {
                nAssumedWrongMatches--;
            }
            
            if(nAssumedWrongMatches < 0) {
                throw new Exception("nAssumedWrongMatches < 0");
            }
        }
    }

    public static void truthBooth(Person p1, Person p2, boolean result, Person[] maleParticipants, Person[] femaleParticipants, LinkedList<Ceremony> ceremonies) throws Exception {
        if(p1.getGender() != Person.MALE || p2.getGender() != Person.FEMALE) {
            throw new Exception("Must be male and female in truth booth");
        }
        
        System.out.println("Truth Booth: " + p1.getName() + " / " + p2.getName());

        if(result == true) {
            p1.setAssumedMatch(p2);
            p2.setAssumedMatch(p1);
            
            for(Person femaleP : femaleParticipants) {
                if(femaleP == p2) {
                    continue;
                }

                p1.addForbiddenMatch(femaleP);
                femaleP.addForbiddenMatch(p1);
            }
            for(Person maleP : maleParticipants) {
                if(maleP == p1) {
                    continue;
                }

                p2.addForbiddenMatch(maleP);
                maleP.addForbiddenMatch(p2);
            }
        }
        else {
            p1.addForbiddenMatch(p2);
            p2.addForbiddenMatch(p1);
        }
        
        for(Ceremony c : ceremonies) {
            c.setPairResult(p1, p2, result);
        }
    }
    
    public void setPairResult(Person p1, Person p2, boolean result) throws Exception {
        Pair pair1 = pairs.get(p1);
        Pair pair2 = pairs.get(p2);

        //Ceremony has this booth
        if(pair1 == pair2) {
            pair1.setResult(result == true ? Pair.RIGHT : Pair.WRONG);
            System.out.println("Ceremony " + id + ": " + pair1);
        }
        //Ceremony doesn't have this booth
        else {
            if(result == true) {
                pair1.setResult(Pair.WRONG);
                pair2.setResult(Pair.WRONG);
                
                System.out.println("Ceremony " + id + ": " + pair1);
                System.out.println("Ceremony " + id + ": " + pair2);
            }
        }
    }

    void updateKnownResults() throws Exception {
        for(Person p : pairs.keySet()) {
            if(p.getGender() == Person.FEMALE) {
                continue;
            }
            
            Pair pair = pairs.get(p);
            
            if(pair.getResult() == Pair.WRONG) {
                nAssumedWrongMatches++;
                
                if(nAssumedWrongMatches > nPairs - nMatches) {
                    throw new Exception("nAssumedWrongMatches > nPairs - nMatches");
                }
            }
            else if(pair.getResult() == Pair.RIGHT) {
                nAssumedRightMatches++;
                
                if(nAssumedRightMatches > nMatches) {
                    throw new Exception("nAssumedRightMatches > nMatches");
                }
            }
        }
    }
}