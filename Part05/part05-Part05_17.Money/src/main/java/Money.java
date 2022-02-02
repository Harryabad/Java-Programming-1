
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {

        int euros = this.euros;
        int cents = this.cents;
        if ((this.cents + addition.cents) > 99) {
            euros = euros + (addition.cents + this.cents) / 100;
            cents = (addition.cents + this.cents) % 100;
        }

        euros += addition.euros;

        Money newMoney = new Money(euros, cents);

        return newMoney;
    }

    public boolean lessThan(Money compared) {

        double thisTotal = (this.euros + this.cents / (double)100);
        double comparedTotal = (compared.euros + compared.cents / (double)100);

        return thisTotal < comparedTotal;
    }

    public Money minus(Money decreaser) {
        int euros = this.euros - decreaser.euros;
        int cents = this.cents - decreaser.cents;

        if (cents < 0) {
            cents += 100;
            euros--;
        }

        if (euros < 0) {
            return new Money(0, 0);
        }
        
        
        
        return new Money(euros, cents);

    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
