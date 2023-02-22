package org.example;
//wall impl extented from mapsite implementing maze
public class WallImpl extends MapSite implements Maze{
    //param
    private int wallNr;
    private static int WALL_CNT = 1;
    public WallImpl() {
        wallNr = WALL_CNT++;
        System.out.println("creating Wall #" + new Integer(wallNr).toString());
    }
    @Override
    public String enter() {
        return "player has hit a wall";
    }
    public String toString() {
        return "Wall #" + new Integer(wallNr).toString();
    }
}
