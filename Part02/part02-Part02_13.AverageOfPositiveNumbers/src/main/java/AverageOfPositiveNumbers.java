
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum=0, count=0;
        
        while(true){
            
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num > 0){
                count++;
                sum += num;
            } else if (num <0){
                continue;
            } else{
                break;
            }
        }
        
        if(sum <= 0){
            System.out.println("Cannot calculate the average");
        } else{
            System.out.println((double)sum/count);
        }

    }
}
