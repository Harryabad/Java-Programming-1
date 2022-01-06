
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<String> data = new ArrayList<>();
        
        System.out.println("File");
        String file = scan.nextLine();
        System.out.println("Team:");
        String team = scan.nextLine();
        
        int games = 0, wins = 0, losses = 0;
        
        
        try(Scanner path = new Scanner(Paths.get(file))){
            while(path.hasNextLine()){
                
                String[] pieces = path.nextLine().split(",");
                
                if(team.equals(pieces[0])){
                    games++;
                    if(Integer.valueOf(pieces[2]) > Integer.valueOf(pieces[3])){
                        wins++;
                    } else{
                        losses++;
                    }
                }
                if(team.equals(pieces[1])){
                    games++;
                    if(Integer.valueOf(pieces[3]) > Integer.valueOf(pieces[2])){
                        wins++;
                    } else{
                        losses++;
                    }
                }
            }
            
        }catch(Exception e){
            System.out.println("Error " + e.getMessage());
        }
        
        System.out.println("Games: " + games);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
        
        
    }

}
