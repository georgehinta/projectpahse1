package org.example;
//doorneedingspell extended from door class
public class DoorNeedingSpell extends DoorImpl {
    //string for spellname
    public String spellName;
    //parameter spell s - spell fed into it
    public DoorNeedingSpell(Spell s) {
        super();
        spellName = s.toString();
    }
    public String toString() {
        String result = "doorneedingspell " + spellName + " " + super.toString();
        System.out.println(result);
        return result;
    }
}
