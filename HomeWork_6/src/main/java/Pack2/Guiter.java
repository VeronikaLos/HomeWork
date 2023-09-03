package Pack2;

public class Guiter implements Instrument {
    private int numberOfStrings;
    private String name;

    public Guiter(String name, int numberOfStrings) {
        this.name = name;
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public void play() {
        System.out.println(("Играет " + name + " с количеством струн = " + numberOfStrings));
    }
}
