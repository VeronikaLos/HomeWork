package Pack1;

import Pack1.Cat;
import Pack1.Dog;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Dog dog = new Dog();
        Rat rat = new Rat();

        cat.makeNoise();
        dog.makeNoise();
        rat.makeNoise();
    }
}
