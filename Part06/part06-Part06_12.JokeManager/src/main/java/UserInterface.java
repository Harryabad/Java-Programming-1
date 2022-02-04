
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author harry
 */
public class UserInterface {

    private JokeManager jManager;
    private Scanner scan;

    public UserInterface(JokeManager jManager, Scanner scan) {
        this.jManager = jManager;
        this.scan = scan;
    }

    public void start() {

        while (true) {

            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String input = scan.nextLine();
            
            if(input.toLowerCase().equals("x")){
                break;
            } else if(input.toLowerCase().equals("1")){
                System.out.println("Write the joke to be added:");
                final String joke = scan.nextLine();
                jManager.addJoke(joke);
            } else if(input.toLowerCase().equals("2")){
                System.out.println("Drawing a joke.");
                System.out.println(jManager.drawJoke());
            } else if(input.toLowerCase().equals("3")){
                System.out.println("Printing the jokes.");
                jManager.printJokes();
            }
            

        }
    }

}
