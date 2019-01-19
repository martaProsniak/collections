package pl.mp.collections.model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Cave representation.
 */
public class Cave {

    /**
     * New list to store dragons.
     */
    private List <Dragon> dragonList = new ArrayList<>();

    public List<Dragon> getDragonList() {
        return dragonList;
    }

    public void setDragonList(List<Dragon> dragonList) {
        this.dragonList = dragonList;
    }

    /**
     * Adds new dragon to the list.
     * @param dragon Dragon to be added to the list.
     */
    public void add (Dragon dragon){
        dragonList.add(dragon);
    }

    public void remove (Dragon dragon){
        dragonList.remove(dragon);
    }

    /**
     * Prints info about all dragons.
     */
    public void printAll (){
        dragonList.forEach(System.out::println);
    }

    /**
     * Prints dragon names.
     */
    public void printNames (){
        dragonList.stream().map(Dragon::getName).forEach(System.out::println);
    }

    /**
     * Sorts dragons by name, prints name and color
     */
    public void printNamesAndColors(){
        dragonList.stream()
                .sorted(Comparator.comparing(Dragon::getName))
                .map(dragon -> dragon.getName() + ", " +
                        dragon.getColor().toString().toLowerCase())
                .forEach(System.out::println);
    }


}
