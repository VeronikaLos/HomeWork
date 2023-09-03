package Pack2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instrument guiter = new Guiter("Guiter1", 10);
        Instrument drum = new Drum("Drum1", 12);
        Instrument tuba = new Tuba("Tuba1", 15);

        List<Instrument> instruments = Arrays.asList(guiter, drum, tuba);
        for (Instrument i:instruments) {
            i.play();
        }
    }
}
