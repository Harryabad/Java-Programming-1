
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

    private TodoList toDo;
    private Scanner scan;

    public UserInterface(TodoList toDo, Scanner scan) {
        this.toDo = toDo;
        this.scan = scan;

    }

    public void start() {

        while (true) {
            System.out.println("Command: ");
            String command = scan.nextLine();

            if (command.toLowerCase().equals("stop")) {
                break;
            } else if (command.toLowerCase().equals("add")) {
                System.out.println("To add: ");
                final String addTask = scan.nextLine();
                toDo.add(addTask);
            } else if(command.toLowerCase().equals("list")){
                toDo.print();

            } else if(command.toLowerCase().equals("remove")){
                System.out.println("Which one is removed?");
                int x = Integer.valueOf(scan.nextLine());
                toDo.remove(x);
            }

        }
    }

}
