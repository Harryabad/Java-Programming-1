
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        try ( Scanner path = new Scanner(Paths.get(file))) {

            while (path.hasNextLine()) {

                String[] pieces = path.nextLine().split(",");

                if (Integer.valueOf(pieces[1]) == 1) {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");


                } else {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " years");


                }
            }

        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
