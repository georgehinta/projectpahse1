package org.example;
public class MazeGame {
    public Maze createMaze(MazeFactory factory) {
        //maze creation
        Maze maze = factory.create("maze");
        Maze mazeDoor = factory.create("door");
        Maze mazeWall = factory.create("wall");
        Maze mazeRoom = factory.create("room");

        System.out.println(maze.enter() + "\n" +
                mazeRoom.enter() + "\n" +
                mazeWall.enter() + "\n" +
                mazeDoor.enter() + "\n" +
                mazeRoom.enter() + "\n" +
                maze.enter());
        //
        return maze;
    }
    public Maze createEnhantedMaze(EnchantedMazeFactory factory) {
        //enchanted maze creation
        Maze enchantedroomMazeRoom = factory.create("enchantedRoom");
        Maze doorNeedingSpell = factory.create("DoorNeedingSpell");
        System.out.println(enchantedroomMazeRoom.enter() + "\n" +
                enchantedroomMazeRoom.toString());
        System.out.println(doorNeedingSpell.enter() + "\n" +
                doorNeedingSpell.toString());
        //
        return enchantedroomMazeRoom;
    }
    public Maze createMaze3() {
        //maze3 creation
        MazeImpl aMaze = new MazeImpl();
        RoomImpl r1 = new RoomImpl();
        RoomImpl r2 = new RoomImpl();
        DoorImpl theDoor = new DoorImpl(r1, r2);
        aMaze.addRoom(r1);
        aMaze.addRoom(r2);
        r1.setSide(Direction.North, new WallImpl());
        r1.setSide(Direction.East, theDoor);
        r1.setSide(Direction.South, new WallImpl());
        r1.setSide(Direction.West, new WallImpl());
        r2.setSide(Direction.North, new WallImpl());
        r2.setSide(Direction.East, new WallImpl());
        r2.setSide(Direction.South, new WallImpl());
        r2.setSide(Direction.West, theDoor);
        return aMaze;
    }
}
