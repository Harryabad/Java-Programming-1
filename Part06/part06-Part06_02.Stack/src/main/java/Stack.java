
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
public class Stack {
    
    private ArrayList<String> stack; 
    
    public Stack(){
        
        stack = new ArrayList<>();
        
    }
    
    public boolean isEmpty(){

        return stack.isEmpty();
    }
    
    public void add(String value){
        stack.add(value);
    }
    
    public ArrayList<String> values(){
        
        return stack;

    }
    
    public String take(){
        
        
        int lastIt = stack.size() -1;
        String take = stack.get(lastIt);
        stack.remove(lastIt);
        
        return take;
    }
    
    
    
}
