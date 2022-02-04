
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
public class Hold {

    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        suitcases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        int totalW = 0;

        for (Suitcase s : suitcases) {
            totalW += s.totalWeight();
        }

        if ((suitcase.totalWeight() + totalW) <= this.maxWeight) {
            suitcases.add(suitcase);
        }
    }
    
    public void printItems(){
        
        for(Suitcase s : suitcases){
            s.printItems();
        }
    }
    
    

    public String toString() {

        int totalW = 0;
        for (Suitcase s : suitcases) {
            totalW += s.totalWeight();
        }

        if (suitcases.size() > 1) {
            return suitcases.size() + " suitcases (" + totalW + " kg)";
        } else if (suitcases.size() == 1) {
            return suitcases.size() + " suitcase (" + totalW + " kg)";
        } else {
            return "no suitcases (" + totalW + " kg)";
        }
    }
}
