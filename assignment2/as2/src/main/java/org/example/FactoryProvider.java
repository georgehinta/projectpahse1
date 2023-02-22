package org.example;
import org.apache.commons.lang3.StringUtils;
public class FactoryProvider {
    public AbstractFactory getFactoryProvider(String factory) {
        //mazefactory check
        if (StringUtils.equalsIgnoreCase(factory, "mazefactory"))
            return new MazeFactory();
        //enchanted maze factory check
        else if (StringUtils.equalsIgnoreCase(factory, "enchantedmazefactory"))
            return new EnchantedMazeFactory();
        //else return null
        else
            return null;
    }
}
