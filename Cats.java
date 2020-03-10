package Lab_1;

public class Cats {
    public static void main(String[] args) {
        int num = (int)(Math.random()*10);
        int rnd;
        for(int i = 0; i < num; i++)
        {
            rnd = (int)(Math.random()*5);
            switch (rnd) {
                case  (1):
                    Cat cat = new Cat("Cat", "skeleton", false, 4);
                    System.out.println("Name is " + cat.getName() + ". Type of vertebrate is " + cat.getVertebrate() + ". Animal is vegetaring? " + cat.getVegetarian() + " Number of legs is " + cat.getNumoflegs());
                    break;
                case (2):
                    Cat tiger = new Cat("Tiger", "spine", false, 4);
                    System.out.println("Name is " + tiger.getName() + ". Type of vertebrate is " + tiger.getVertebrate() + ". Animal is vegetaring? " + tiger.getVegetarian() + " Number of legs is " + tiger.getNumoflegs());
                    break;
                case (3):
                    Cat lion = new Cat("Lion", "skeleton", false, 4);
                    System.out.println("Name is " + lion.getName() + ". Type of vertebrate is " + lion.getVertebrate() + ". Animal is vegetaring? " + lion.getVegetarian() + " Number of legs is " + lion.getNumoflegs());
                    break;
                case (4):
                    Cat pantera = new Cat("Pantera", "spine", true, 4);
                    System.out.println("Name is " + pantera.getName() + ". Type of vertebrate is " + pantera.getVertebrate() + ". Animal is vegetaring? " + pantera.getVegetarian() + " Number of legs is " + pantera.getNumoflegs());
                    break;
                case (5):
                    Cat yaguar = new Cat("Yaguar", "bones", false, 4);
                    System.out.println("Name is " + yaguar.getName() + ". Type of vertebrate is " + yaguar.getVertebrate() + ". Animal is vegetaring? " + yaguar.getVegetarian() + " Number of legs is " + yaguar.getNumoflegs());
                    break;
            }
        }
    }
}
