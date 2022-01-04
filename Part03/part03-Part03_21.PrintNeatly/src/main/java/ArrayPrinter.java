
public class ArrayPrinter {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(array.length);
        printNeatly(array);
    }

    public static void printNeatly(int[] array) {
        // Write some code in here
        String x = "";

        for (int i = 0; i < array.length; i++) {
            x += array[i];
            if (i < array.length-1) {

                x += ", ";
            }
        }
        for (int num : array) {

        }
        System.out.println(x);

    }
}
