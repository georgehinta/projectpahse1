package org.example;
import java.util.HashSet;
import java.util.Set;
public class MazeImpl implements Maze{
    //mazeimpl implements base maze interface
    private Set<RoomImpl> rooms = new HashSet<>();
    public MazeImpl() {
        System.out.println("creating a Maze");
    }
    @Override
    public String enter() {
        return "player has entered a maze";
    }
    void addRoom(RoomImpl r) {
        if (!rooms.contains(r)) {
            rooms.add(r);
        }
    }

}
