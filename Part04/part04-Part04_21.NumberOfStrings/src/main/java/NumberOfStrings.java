
import java.util.ArrayList;
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> stringies = new ArrayList<>();
        
        while(true){
            
            String x = scanner.nextLine();
            
            if(x.equals("end")){
                break;
            }
            
            stringies.add(x);
        }
        
        System.out.println(stringies.size());
        

    }
}
