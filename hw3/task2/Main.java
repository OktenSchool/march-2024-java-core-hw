package hw3.task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Instrument[] instruments = {
                new Drum(25),
                new Trumpet(25.3),
                new Guitar(5)
        };

        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }
}
