package com.dudinka.model;

import com.dudinka.Ceremony;
import java.util.HashSet;
import java.util.LinkedList;

public class Person {
    public static final int MALE = 0;
    public static final int FEMALE = 1;

    private int id;
    private int gender;
    private String name;
    private Person assumedMatch;
    private HashSet<Person> forbiddenMatchSet;

    public Person(String name, int gender) {
        this.setName(name);
        this.setGender(gender);
        this.assumedMatch = null;
        this.forbiddenMatchSet = new HashSet<Person>();
    }

    public boolean assumeMatch(Person p, LinkedList<Ceremony> cerimonies) throws Exception {
        if(this.assumedMatch != null || p.assumedMatch != null) {
System.out.println(this.getName() + " / " + p.getName() + " = FALSE");
            return false;
        }
        if(this.forbiddenMatchSet.contains(p)) {
System.out.println(this.getName() + " / " + p.getName() + " = FORBIDDEN");
            return false;
        }

        this.setAssumedMatch(p);
        p.setAssumedMatch(this);

        LinkedList<Ceremony> cerimoniesToRollBack = new LinkedList<>();
        for(Ceremony c : cerimonies) {
            boolean ok = c.addAssumedMatch(this, p);

            if(!ok) {
                rollBackMatch(p, cerimoniesToRollBack);
                return false;
            }

            cerimoniesToRollBack.add(c);
        }

        return true;
    }

    public void rollBackMatch(Person p, LinkedList<Ceremony> cerimonies) throws Exception {
        this.setAssumedMatch(null);
        p.setAssumedMatch(null);

        for(Ceremony c : cerimonies) {
            c.removeAssumedMatch(this, p);
        }
    }

    public void addForbiddenMatch(Person p) {
        forbiddenMatchSet.add(p);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public Person getAssumedMatch() {
        return assumedMatch;
    }

    public void setAssumedMatch(Person match) throws Exception {
        this.assumedMatch = match;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMatch(Person p2) {
        return assumedMatch != null && assumedMatch == p2;
    }

    public boolean isForbidden(Person p) {
        return forbiddenMatchSet.contains(p);
    }
}
