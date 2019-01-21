package pl.mp.collections;

import pl.mp.collections.model.Cave;
import pl.mp.collections.model.Dragon;

/**
 * Application main class.
 *
 * @author Marta
 */
public class DragonsMain {

    /**
     * Application main method.
     *
     * @param args Command line application starting arguments.
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Dragonland!");

        //Create new dragon cave
        Cave cave = addDragons();

        //Task 8
        cave.printAll();
        printInterval();
        cave.printNames();
        printInterval();
        cave.printNamesAndColors();
        printInterval();
        //Task 9
        System.out.println(cave.checkOldest());
        printInterval();
        System.out.println("Largest wingspan is: " + cave.checkLargestWings());
        printInterval();
        System.out.println("Longest name has " + cave.signsInLongestName() + " letters.");
        printInterval();
        //Task 10
        cave.fetchByColor(Dragon.Color.BLACK).forEach(System.out::println);
        printInterval();
        cave.fetchByName().forEach(System.out::println);
        printInterval();
        cave.createColorList().forEach(System.out::println);
        printInterval();
        //Task 11
        cave.sortNatural().forEach(System.out::println);
        printInterval();
        cave.sortByAGe().forEach(System.out::println);
        printInterval();
        //Task 12
        System.out.println(cave.checkAge(120));
        printInterval();
        System.out.println(cave.checkColor(Dragon.Color.BLACK));
        printInterval();
        //Task 14
        cave.eggList().forEach(System.out::println);
        printInterval();
        cave.wingspanEggList(9).forEach(System.out::println);
        printInterval();
    }

    /**
     * Creates cave with new dragons.
     *
     * @return new cave.
     */
    public static Cave addDragons() {
        Cave cave = new Cave();

        //Add some dragons to the list
        Dragon dragon1 = new Dragon("Ysera", 50, 7, Dragon.Color.BLUE);
        cave.add(dragon1);

        Dragon dragon2 = new Dragon("Villentretenmerth", 100, 8, Dragon.Color.GOLD);
        cave.add(dragon2);

        Dragon dragon3 = new Dragon("Smaug", 120, 10, Dragon.Color.BLACK);
        cave.add(dragon3);

        Dragon dragon4 = new Dragon("Norbert", 20, 4, Dragon.Color.RED);
        cave.add(dragon4);

        Dragon dragon5 = new Dragon("Deathwing", 75, 13, Dragon.Color.BLACK);
        cave.add(dragon5);

        Dragon dragon6 = new Dragon("Alexstraza", 86, 9, Dragon.Color.GREEN);
        cave.add(dragon6);

        Dragon dragon7 = new Dragon("Saskia", 150, 15, Dragon.Color.GOLD);
        cave.add(dragon7);

        return cave;
    }

    /**
     * Prints break between methods output.
     */
    public static void printInterval() {
        System.out.println("------  ------  ------  ------");
    }

}
