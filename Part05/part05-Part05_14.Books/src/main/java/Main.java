
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);

//            if(!(books.contains(book))){
//                books.add(book);
//            }else{
//                
//            }

            boolean existsInList = false;
            for(Book b : books){
                if(b.equals(book)){
                    existsInList = true;
                    System.out.println("The book is already on the list. Let's not add the same book again.");
                    break;
                }
            }
            if(!existsInList){
                books.add(book);
            }
            
            
            


        }

        // NB! Don't alter the line below!
        System.out.println("Thank you! Books added: " + books.size());
    }
}
