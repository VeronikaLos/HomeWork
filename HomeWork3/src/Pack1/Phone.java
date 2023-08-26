package Pack1;

public class Phone {
    private int number;
    private String model;
    private int weight;

    Phone(int number, int weight, String model) {
        this (number, weight);
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    Phone(int number, int weight) {
        this.number = number;
        this.weight = weight;
    }
    Phone () {};

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public int getWeigh() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    void receiveCall(String name) {
        System.out.print("Звонит " + name);
    }
    void receiveCall(int number, String name) {
        System.out.print("Звонит " + name + " Номер " + number);
    }
}
