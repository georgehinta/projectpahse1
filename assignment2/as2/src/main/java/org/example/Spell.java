package org.example;

public class Spell {
    //spell param
    public String spellName;
    //constructor
    public Spell(String spellName){
        this.spellName = spellName;
    }
    //spell getter
    public String getSpellName() {
        return spellName;
    }
    //spell setter
    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }
    @Override
    public String toString() {
        return getSpellName() + " has been cast";
    }
}
