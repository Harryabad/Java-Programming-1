
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        divisibleByThreeInRange(2,10);
    }
    
    public static void divisibleByThreeInRange(int lRange, int uRange){
        
        for(int i = lRange; i <= uRange; i++){
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }

}
