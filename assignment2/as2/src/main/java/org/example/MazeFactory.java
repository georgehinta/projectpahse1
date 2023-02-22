package org.example;
import org.apache.commons.lang3.StringUtils;
public class MazeFactory implements AbstractFactory<Maze> {
    /**
     * Maze factory to return desired type
     * @param createSomething
     * @return Maze
     */
    public Maze create(String createSomething) {
        // switch based on type, default will return null
        // using apache StringUtils, an industry standard, efficient, gracefully handles nulls, etc...
        if (StringUtils.equalsIgnoreCase(createSomething, "maze"))
            return new MazeImpl();
        else if (StringUtils.equalsIgnoreCase(createSomething, "room"))
            return new RoomImpl();
        else if (StringUtils.equalsIgnoreCase(createSomething, "wall"))
            return new WallImpl();
        else if (StringUtils.equalsIgnoreCase(createSomething, "door"))
            return new DoorImpl();
        else
            return null;
    }
}