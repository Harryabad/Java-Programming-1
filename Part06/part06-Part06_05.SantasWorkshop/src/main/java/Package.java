
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
public class Package {

    private ArrayList<Gift> packages;
    
    public Package(){
        packages = new ArrayList<>();
    }
    
    // Method public void addGift(Gift gift), which adds the gift passed as a
    // parameter to the package. The method returns no value.
    public void addGift(Gift gift){
        packages.add(gift);
    }
    
    // Method public int totalWeight(), which returns the total weight 
    // of the package's gifts.
    public int totalWeight(){
        int tW = 0;
        
        for(Gift g : packages){
            tW += g.getWeight();
        }
        
        return tW;
    }

    
}

