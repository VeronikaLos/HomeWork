package Pack2;

public class Drum implements Instrument{
    private int sizeOfStrings;
    private String name;

    public Drum(String name, int sizeOfStrings) {
        this.name=name;
        this.sizeOfStrings=sizeOfStrings;
    }


    @Override
    public void play() {
        System.out.println(("Играет " + name + " с размером струн = " + sizeOfStrings));
    }
}
