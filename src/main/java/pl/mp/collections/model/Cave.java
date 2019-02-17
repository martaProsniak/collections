package pl.mp.collections.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Cave representation.
 */
public class Cave {

    /**
     * New list to store dragons.
     */
    private List<Dragon> dragonList = new ArrayList<>();

    public List<Dragon> getDragonList() {
        return dragonList;
    }

    public void setDragonList(List<Dragon> dragonList) {
        this.dragonList = dragonList;
    }

    /**
     * Adds new dragon to the list.
     *
     * @param dragon Dragon to be added to the list.
     */
    public void add(Dragon dragon) {
        dragonList.add(dragon);
    }

    public void remove(Dragon dragon) {
        dragonList.remove(dragon);
    }

    /**
     * Prints info about all dragons.
     */
    public void printAll() {
        dragonList.forEach(System.out::println);
    }

    /**
     * Prints dragon names.
     */
    public void printNames() {
        dragonList.stream().map(Dragon::getName).forEach(System.out::println);
    }

    /**
     * Sorts dragons by name, prints name and color.
     */
    public void printNamesAndColors() {
        dragonList.stream()
                .sorted(Comparator.comparing(Dragon::getName))
                .map(dragon -> dragon.getName() + ", " +
                        dragon.getColor().toString().toLowerCase())
                .forEach(System.out::println);
    }

    /**
     * @return the oldest dragon.
     */
    public Dragon checkOldest() {
        return dragonList.stream()
                .max(Comparator.comparingInt(Dragon::getAge))
                .orElse(new Dragon());
    }

    /**
     * Finds the largest wingspawn.
     *
     * @return largest wingspawn.
     */
    public int checkLargestWings() {
        return dragonList.stream()
                .mapToInt(Dragon::getWingspan).max()
                .orElse(0);
    }

    /**
     * Finds the longest dragon name.
     *
     * @return number of letters in the longest name.
     */
    public int signsInLongestName() {
        return dragonList.stream()
                .map(Dragon::getName)
                .mapToInt(String::length)
                .max().orElse(0);
    }

    /**
     * @param color dragon color (enum).
     * @return new dragon list with specified color.
     */
    public List<Dragon> fetchByColor(Dragon.Color color) {
        List<Dragon.Color> colorList = Arrays.asList(color);
        return dragonList.stream()
                .filter(dragon -> colorList.contains(dragon.getColor()))
                .collect(Collectors.toList());
    }

    /**
     * @return list of dragon's names.
     */
    public List<String> fetchByName() {
        return dragonList.stream()
                .map(Dragon::getName)
                .collect(Collectors.toList());
    }

    /**
     * @return list of dragon's colors.
     */
    public List<Dragon.Color> createColorList() {
        return dragonList.stream()
                .map((Dragon::getColor))
                .collect(Collectors.toList());
    }

    /**
     * @return dragon list sorted according to natural order.
     */
    public List<Dragon> sortNatural() {
        return dragonList.stream()
                .sorted().collect(Collectors.toList());
    }

    /**
     * @return dragon list sorted by age.
     */
    public List<Dragon> sortByAGe() {
        return dragonList.stream()
                .sorted(Comparator.comparingInt(Dragon::getAge))
                .collect(Collectors.toList());
    }

    /**
     * checks if dragon with specified age exists.
     *
     * @param age age to be checked.
     * @return true or false.
     */
    public boolean checkAge(int age) {
        boolean res = dragonList.stream()
                .map(Dragon::getAge)
                .allMatch(value -> value>age);
        return res;
    }

    /**
     * checks if dragon with specified color.
     *
     * @param color to be checked.
     * @return true or false.
     */
    public boolean checkColor(Dragon.Color color) {
        boolean res = dragonList.stream()
                .map(Dragon::getColor)
                .anyMatch(value -> value.equals(color));
        return res;
    }

    /**
     * Creates list of dragon eggs according to all dragons
     *
     * @return new list of all ,dragon eggs.
     */
    public List<Egg> eggList() {
        return dragonList.stream()
                .map(Egg::new)
                .collect(Collectors.toList());
    }

    /**
     * Creates new Egg list which only contains dragons with wingspan higher then given one.
     *
     * @param wings Dragon wingspan.
     * @return fetched list of dragon eggs.
     */
    public List<Egg> wingspanEggList(int wings) {
        List<Dragon> wingspanDragonList;
     return  dragonList.stream()
                .filter(dragon -> dragon.getWingspan() > wings)
                .map(Egg::new)
                .collect(Collectors.toList());
    }
}
