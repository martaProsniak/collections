package pl.mp.collections.model;


/**
 * Dragon representation.
 */
public class Dragon implements Comparable<Dragon> {

    /**
     * New type - Color
     */
    public enum Color {
        BLUE, BLACK, GREEN, GOLD, RED
    }

    /**
     * Dragon name.
     */
    private String name;

    /**
     * Dragon age.
     */
    private int age;

    /**
     * Dragon wingspan.
     */
    private int wingspan;

    /**
     * Dragon color.
     */
    private Color color;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Dragon() {
    }

    public Dragon(String name, int age, int wingspan, Color color) {
        this.name = name;
        this.age = age;
        this.wingspan = wingspan;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dragon dragon = (Dragon) o;

        if (age != dragon.age) return false;
        if (wingspan != dragon.wingspan) return false;
        if (!name.equals(dragon.name)) return false;
        return color == dragon.color;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        result = 31 * result + wingspan;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", wingspan=" + wingspan +
                ", color=" + color +
                '}';
    }

    @Override
    public int compareTo(Dragon dragon) {
        int check = color.compareTo(dragon.color);
        if (check == 0) {
            check = age - dragon.age;
        }
        if (check == 0) {
            check = wingspan - dragon.wingspan;
        }
        if (check == 0) {
            check = name.compareTo(dragon.name);
        }
        return check;
    }
}
