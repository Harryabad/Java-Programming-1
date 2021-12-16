
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0, count=0;
        
        while(true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num != 0){
                count++;
                sum += num;
            } else{
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((double)sum/count));

    }
}
