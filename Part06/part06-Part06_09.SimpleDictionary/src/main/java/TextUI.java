
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
public class TextUI {

    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start() {

        while (true) {
            System.out.println("Command:");
            String scan = scanner.nextLine();

            if (scan.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (scan.equals("add")) {
                System.out.println("Word:");
                final String word = scanner.nextLine();
                System.out.println("Translation:");
                final String translation = scanner.nextLine();
                dictionary.add(word, translation);
                
            } else if (scan.equals("search")) {
                System.out.println("To be translated:");
                final String wordToTranslate = scanner.nextLine();
                final String translation = dictionary.translate(wordToTranslate);
                if(translation == null){
                    System.out.println("Word " + wordToTranslate + " was not found");
                } else{
                    System.out.println("Translation: " + translation);
                }
                
            } else {
                System.out.println("Unknown Command");
            }

        }
    }
}
