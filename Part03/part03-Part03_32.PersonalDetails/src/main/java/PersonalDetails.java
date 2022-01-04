
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String name = "";
        
        int avg = 0, nameLength = 0, count = 0;

        while(true){
            
            String text = scanner.nextLine();
            
            if(text.equals("")){
                break;
            }
            
            String[] pieces = text.split(",");
            
            if(pieces[0].length() > nameLength){
                name = pieces[0];
                nameLength = pieces[0].length();
                
            }
            avg += Integer.valueOf(pieces[1]);
            count++;

        }
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + ((double)avg/ count));
        
        
    }
}
