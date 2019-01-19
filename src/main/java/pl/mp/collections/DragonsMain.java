package pl.mp.collections;

import pl.mp.collections.model.Cave;
import pl.mp.collections.model.Dragon;

/**
 * Application main class.
 * @author Marta
 */
public class DragonsMain {

    /**
     * Application main method.
     * @param args Command line application starting arguments.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Dragonland!");

        //Create new dragon cave
        Cave cave = addDragons();

        cave.getDragonList().forEach(System.out::println);
    }

    /**
     * Creates cave with new dragons.
     * @return new cave.
     */
    public static Cave addDragons(){
        Cave cave = new Cave();

        //Add some dragons to the list
        Dragon dragon1 = new Dragon("Ysera", 50, 7, Dragon.Color.BLUE );
        cave.add(dragon1);

        Dragon dragon2 = new Dragon ("Villentretenmerth", 100, 8, Dragon.Color.GOLD);
        cave.add(dragon2);

        Dragon dragon3 = new Dragon("Smaug", 120, 10, Dragon.Color.BLACK);
        cave.add(dragon3);

        Dragon dragon4 = new Dragon("Norbert", 20, 4, Dragon.Color.RED);
        cave.add(dragon4);

        Dragon dragon5 = new Dragon("Deathwing", 75, 13, Dragon.Color.BLACK);
        cave.add(dragon5);

        Dragon dragon6 = new Dragon("Alexstraza", 86, 9, Dragon.Color.GREEN);
        cave.add(dragon6);

        return cave;
    }

}
