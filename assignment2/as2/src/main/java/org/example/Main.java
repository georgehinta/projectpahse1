package org.example;
public class Main {
    public static void main(String ... args) {
        System.out.println("Maze game");

        // Init factory provider - CREATING FACTORY PROVIDER
        FactoryProvider factoryProvider = new FactoryProvider();
        // From the factory provider get the desired factory, in this case we want the maze factory
        AbstractFactory mazeAbstractFactory = factoryProvider.getFactoryProvider(MazeFactory.class.getSimpleName());
        // Init the maze game to start
        MazeGame mazeGame = new MazeGame();
        // Pass in the maze factory to create the maze
        mazeGame.createMaze((MazeFactory) mazeAbstractFactory);

        System.out.println("\n");

        AbstractFactory enchantedAbstractFactory = factoryProvider.getFactoryProvider(EnchantedMazeFactory.class.getSimpleName());
        mazeGame.createEnhantedMaze((EnchantedMazeFactory) enchantedAbstractFactory);
        System.out.println("\n");
        mazeGame.createMaze3();
    }
}

