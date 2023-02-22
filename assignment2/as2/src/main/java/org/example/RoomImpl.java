package org.example;

public class RoomImpl extends MapSite implements Maze {
    //room parameters
    private int roomNr;
    private static int ROOM_CNT = 1;
    private MapSite northSide;
    private MapSite southSide;
    private MapSite eastSide;
    private MapSite westSide;
    public RoomImpl() {
        roomNr = ROOM_CNT++;
        System.out.println("creating Room #" + roomNr);
    }
    @Override
    public String enter() {
        return "player has entered the room";
    }
    @Override
    public String mapLocation(){ return "player has entered the room on mapsite";}
    public String toString() {
        return "Room #" + new Integer(roomNr).toString();
    }
    public void setSide(Direction d, MapSite site) {
        switch (d) {
            case North:
                northSide = site;
            case South:
                southSide = site;
            case East:
                eastSide = site;
            case West:
                westSide = site;
        }
    }
    public MapSite getSide(Direction d) {
        MapSite result = null;
        switch(d){
            case North:
                result = northSide;
            case South:
                result = southSide;
            case East:
                result = eastSide;
            case West:
                result = westSide;
        }
        return result;
    }
}

