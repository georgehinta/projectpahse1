package org.example;
//enchanted room extended from room class
class EnchantedRoom extends RoomImpl {
    //spell name parameter
    public String spellName;
    public EnchantedRoom(Spell s) {
        super();
        spellName = s.toString();
    }
    public String toString() {
        String result = "enchanted " + spellName + " " + super.toString();
        System.out.println(result);
        return result;
    }
}


