package pl.mp.collections.model;

/**
 * Dragon egg representation.
 */
public class DragonEgg {

    private Dragon.Color color;

    public Dragon.Color getColor() {
        return color;
    }

    public void setColor(Dragon.Color color) {
        this.color = color;
    }

    public DragonEgg (Dragon dragon){
        this.color = dragon.getColor();
    }
}
