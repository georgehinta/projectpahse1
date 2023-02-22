package org.example;
public class DoorImpl extends MapSite implements Maze {
    //door parameters
    private static int DOOR_CNT = 1;
    private int doorNr;
    private RoomImpl room1;
    private RoomImpl room2;
    //door constructor
    public DoorImpl() {
    }
    //door creation - two rooms needed
    public DoorImpl(RoomImpl r1, RoomImpl r2) {
        doorNr = DOOR_CNT++;
        System.out.println("creating a Door #" + doorNr + " between " + r1
                + " and " + r2);
        room1 = r1;
        room2 = r2;
    }
    @Override
    public String enter() {
        return "player has entered a door";
    }
    public String toString() {
        String result = "on door";
        return result;
    }
}
