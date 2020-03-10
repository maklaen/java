package Lab_1;

abstract public class Predator extends Mammal {

    private int NumOfLegs;

    public Predator(String name, String vertebrate, boolean vegan) {
        super(name, vertebrate, vegan);
        this.NumOfLegs = 4;
    }

    public Predator(String food, String vertebrate, boolean vegan, int numoflegs) {
        super(food, vertebrate, vegan);
        this.NumOfLegs = numoflegs;
    }

    public int getNumoflegs() {
        return NumOfLegs;
    }

    public void setNumoflegs(int num) {
        this.NumOfLegs = num;
    }
}
