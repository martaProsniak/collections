package pl.mp.collections.model;

/**
 * Dragon egg representation.
 */
public class Egg {

    private Dragon.Color color;

    public Dragon.Color getColor() {
        return color;
    }

    public void setColor(Dragon.Color color) {
        this.color = color;
    }

    public Egg(Dragon dragon) {
        this.color = dragon.getColor();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Egg egg = (Egg) o;

        return getColor() == egg.getColor();
    }

    @Override
    public int hashCode() {
        return getColor() != null ? getColor().hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Egg{" +
                "color=" + color +
                '}';
    }
}
