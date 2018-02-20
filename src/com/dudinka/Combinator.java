package com.dudinka;

import com.dudinka.model.Person;
import java.util.LinkedList;

public class Combinator {
    public int nSolutions = 0;
    private Person[] maleParticipants;
    private Person[] femaleParticipants;
    private LinkedList<Ceremony> cerimonies;

    public Combinator(Person[] maleParticipants, Person[] femaleParticipants, LinkedList<Ceremony> cerimonies) throws Exception {
        if(maleParticipants == null || femaleParticipants == null) {
            throw new Exception("Null set of participants");
        }
        if(maleParticipants.length != femaleParticipants.length) {
            throw new Exception("Different size of male and female participants");
        }

        this.maleParticipants = maleParticipants;
        this.femaleParticipants = femaleParticipants;
        this.cerimonies = cerimonies;
    }

    public void run(int currentId) throws Exception {
System.out.println("Level: " + (currentId+1));
        
        if(currentId == maleParticipants.length) {
            System.out.println("Solution ("+ (nSolutions+1) +") found:");

            for(int i = 0; i < maleParticipants.length; i++) {
                System.out.println(
                    maleParticipants[i].getName() + ", "
                    + maleParticipants[i].getAssumedMatch().getName());
            }

            System.out.println("--------------------");

            nSolutions++;
            if(nSolutions >= 50000) {
                System.out.println("EXIT");
                System.exit(0);
            }

            return;
        }

        Person p1 = maleParticipants[currentId];
        
        if(p1.getAssumedMatch() != null) {
System.out.println(p1.getName() + " / " + p1.getAssumedMatch().getName() + " = TRUE");
            run(currentId + 1);
System.out.println("Level: " + (currentId+1));
System.out.println(p1.getName() + " / " + p1.getAssumedMatch().getName() + " = TRUE");
        }
        else {
            for(Person p2 : femaleParticipants) {
                boolean isPossibleMatch = p1.assumeMatch(p2, cerimonies);

                if(!isPossibleMatch) {
                    continue;
                }
                
System.out.println(p1.getName() + " / " + p1.getAssumedMatch().getName() + " = MAYBE");
                run(currentId + 1);
System.out.println(p1.getName() + " / " + p1.getAssumedMatch().getName() + " = UNDO");
System.out.println("Level: " + (currentId+1));

                p1.rollBackMatch(p2, cerimonies);
            }
        }
    }
}
