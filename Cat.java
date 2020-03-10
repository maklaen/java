package Lab_1;

public class Cat extends Predator {

    private String Color;

    public Cat(String name, String vertebrate, boolean vegan, int numoflegs) {
        super(name, vertebrate, vegan, numoflegs);
        this.Color = "White";
    }

    public Cat(String name, String vertebrate, boolean vegan, int numoflegs, String color) {
        super(name, vertebrate, vegan, numoflegs);
        this.Color = color;
    }

    public String getColor() {
        return Color;
    }

    public void serColor(String color) {
        this.Color = color;
    }
}
