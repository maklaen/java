package Lab_1;

abstract public class Vertebrate extends Animal {
    private String TypeOfVertebrate;

    public Vertebrate(String name) {
        super(name);
        this.TypeOfVertebrate="Chord";
    }

    public Vertebrate(String name, String vertebrate){
        super(name);
        this.TypeOfVertebrate=vertebrate;
    }

    public String getVertebrate() {
        return TypeOfVertebrate;
    }

    public void setVertebrate(String vertebrate) {
        this.TypeOfVertebrate = vertebrate;
    }
}
