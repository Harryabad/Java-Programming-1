
import static java.lang.Math.abs;

public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (this.squares > compared.squares) {
            return true;
        } else {
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        int ap1 = this.squares * this.princePerSquare;
        int ap2 = compared.squares * compared.princePerSquare;

        return abs(ap1 - ap2);
    }

    public boolean moreExpensiveThan(Apartment compared) {
        int ap1 = this.squares * this.princePerSquare;
        int ap2 = compared.squares * compared.princePerSquare;
        if(ap1 > ap2){
            return true;
        }else{
            return false;
        }
    }

}
