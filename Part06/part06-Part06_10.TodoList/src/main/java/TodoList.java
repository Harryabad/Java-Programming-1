
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author harry
 */
public class TodoList {
    
    private ArrayList<String> toDo;
    
    public TodoList(){ 
        toDo = new ArrayList<>();
    }
    
    public void add(String task){
        toDo.add(task);
    }
    
    public void print(){

        for(String i : toDo){
            System.out.println(toDo.indexOf(i)+1 + ": " + i);
        }
    }
    
    public void remove(int number){
        toDo.remove(number-1);
    }
}
