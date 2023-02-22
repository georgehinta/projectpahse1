package org.example;
import org.apache.commons.lang3.StringUtils;
//enchanted maze factory is extension of maze factory
public class EnchantedMazeFactory extends MazeFactory {
    @Override
    public Maze create(String createSomething) {
        if (StringUtils.equalsIgnoreCase(createSomething, "enchantedRoom"))
            return new EnchantedRoom(new Spell("type one enchanted room spell"));
        else if (StringUtils.equalsIgnoreCase(createSomething, "DoorNeedingSpell"))
            return new DoorNeedingSpell(new Spell("type two enchanted door spell"));
           else
            return null;
    }
}