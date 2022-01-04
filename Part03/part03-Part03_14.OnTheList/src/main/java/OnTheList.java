
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }

        System.out.println("Search for? ");
        String name = scanner.nextLine();
        int i = 0;

        while (true) {

            if (i == list.size()) {
                System.out.println(name + " was not found!");
                break;
            } else if (name.equals(list.get(i))) {
                System.out.println(name + " was found!");
                break;
            }
            i++;
            
        }

    }
}
