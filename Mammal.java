package Lab_1;

abstract public class Mammal extends Vertebrate {

    private boolean Vegetarian;

    public Mammal(String name, String vertebrate) {
        super(name, vertebrate);
        this.Vegetarian = true;
    }

    public Mammal(String name, String vertebrate, boolean vegan) {
        super(name, vertebrate);
        this.Vegetarian = vegan;
    }

    public boolean getVegetarian() {
        return Vegetarian;
    }

    public void setVegetarian(boolean vegan) {
        this.Vegetarian = vegan;
    }
}
