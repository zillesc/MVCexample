package ninja.zilles.MVCexample;

import java.util.Observable;

/**
 * Created by zilles on 10/27/16.
 */

public class RandomStringGenerator extends Observable {
    private String string;

    public RandomStringGenerator(String string) {
        this.string = (string != null) ? string : "";
    }

    public void addLetter() {
        char letter = (char) ('a' + Math.floor(Math.random() * 26));
        string += letter;
        setChanged();
        notifyObservers();
    }

    public void addNumber() {
        int number = (int) Math.floor(Math.random() * 10);
        string += number;
        setChanged();
        notifyObservers();
    }

    public String getString() {
        return string;
    }

    public void clear() {
        string = "";
        setChanged();
        notifyObservers();
    }
}
