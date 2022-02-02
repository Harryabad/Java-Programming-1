
public class Main {

    public static void main(String[] args) {
        // test your program here!

        int days = 385;
        
        int months = days/30;
        
        int newDays = days%30;

        System.out.println(days / 365);
        System.out.println(days % 365);
        System.out.println(months);
        System.out.println(newDays);

    }
}
