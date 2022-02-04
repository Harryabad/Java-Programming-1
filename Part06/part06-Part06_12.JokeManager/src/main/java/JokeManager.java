
import java.util.ArrayList;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harry
 */
public class JokeManager {

    private ArrayList<String> jokeBank;

    public JokeManager() {

        this.jokeBank = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokeBank.add(joke);
    }

    public String drawJoke() {

        if (!(jokeBank.isEmpty())) {
            Random randInt = new Random();
            int x = randInt.nextInt(jokeBank.size());
            return jokeBank.get(x);

        } else {
            return "Jokes are in short supply.";
        }
    }

    public void printJokes() {
        for (String j : jokeBank) {
            System.out.println(j);
        }
    }
}
