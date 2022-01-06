
public class Statistics {

    private int count, sum;

    public Statistics() {
        // initialize the variable numberCount here
        this.count = 0;
        this.sum = 0;

    }

    public void addNumber(int number) {
        // write code here
        count++;
        this.sum += number;

    }

    public int getCount() {
        // write code here
        return this.count;
    }

    public int sum() {
        return this.sum += 0;
    }

    public double average() {
        if (count > 0) {

            return ((double) (sum) / count);
        } else {
            return 0;
        }
    }
}
