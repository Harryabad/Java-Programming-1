
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        
        Counter counter = new Counter(5);
        Counter count = new Counter();
        
        counter.increase(5);
        count.increase();
        
        System.out.println(counter.value());
        System.out.println(count.value());
        
    }
}
