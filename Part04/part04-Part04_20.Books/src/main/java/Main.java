import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.println("Title: ");
            String t = scanner.nextLine();
            if(t.equals("")){
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int pY = Integer.valueOf(scanner.nextLine());
            
            books.add(new Book(t, pages, pY));
        }
        
        System.out.println("What information will be printed? ");
        String info = scanner.nextLine();
        
        for(Book book: books){
        if(info.equals("name")){
            System.out.println(book.getName());
        } else if (info.equals("pages")){
            System.out.println(book.getPages());
        } else if(info.equals("publication year")){
            System.out.println(book.getYear());
        } else{
            System.out.println(book.toString());
        }
    }
        
    }
}
