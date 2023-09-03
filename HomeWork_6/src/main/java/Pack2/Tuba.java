package Pack2;

public class Tuba implements Instrument{
    private int diameterOfStrings;
    private String name;

    public Tuba(String name, int diameterOfStrings) {
        this.name = name;
        this.diameterOfStrings = diameterOfStrings;
    }

    @Override
    public void play() {
        System.out.println(("Играет " + name + " с диаметром струн = " + diameterOfStrings));
    }
}
