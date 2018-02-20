package com.dudinka;

import com.dudinka.model.Person;

public class Pair {
    public static final int UNKNOWN = 0;
    public static final int RIGHT = 1;
    public static final int WRONG = -1;

    private Person p1;
    private Person p2;
    private int result;

    public Pair(Person p1, Person p2) throws Exception {
        if(p1.getGender() != Person.MALE) {
            throw new Exception("P1 must be male");
        }
        if(p2.getGender() != Person.FEMALE) {
            throw new Exception("P2 must be female");
        }

        this.p1 = p1;
        this.p2 = p2;
        this.result = UNKNOWN;
    }

    @Override
    public String toString() {
        return p1.getName() + ", " + p2.getName() + ": " + (result == 1 ? "RIGHT" : result == -1 ? "WRONG" : "UNKNOWN");
    }

    @Override
    public boolean equals(Object obj) {
        Pair pair = (Pair) obj;

        return p1 == pair.p1 && p2 == pair.p2;
    }

    public Person getP1() {
        return p1;
    }

    public void setP1(Person p1) {
        this.p1 = p1;
    }

    public Person getP2() {
        return p2;
    }

    public void setP2(Person p2) {
        this.p2 = p2;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
    
    public void addWrongResult() throws Exception {
        if(result == Pair.RIGHT) {
            throw new Exception("Removing WRONG directly from RIGHT");
        }
        
        this.result--;
    }
    
    public void removeWrongResult() throws Exception {
        this.result++;
                
        if(result == Pair.RIGHT) {
            throw new Exception("Removing WRONG turned to RIGHT");
        }
    }
}
