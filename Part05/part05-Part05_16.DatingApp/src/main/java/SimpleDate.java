
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {

        this.day++;

        if (this.day > 30) {
            this.month++;
            this.day = 1;
        }

        if (this.month > 12) {
            this.year++;
            this.month = 1;
        }

    }

    public void advance(int howManyDays) {

        for (int i = 0; i < howManyDays; i++) {
            advance();
        }

    }

    public SimpleDate afterNumberOfDays(int days) {

        int years = 0, months = 0;

        if (days > 365) {
            years = days / 365;
            days = days % 365;
        }

        if (days > 30) {
            months = days / 30;
            days = days % 30;
        }
        //

        if ((days + this.day) > 30) {
            days = (days + this.day) - 30;
            months++;
        } else {
            days += this.day;
        }

        if ((months + this.month) > 12) {
            months = (months + this.month) - 12;
            years++;
        } else {
            months += this.month;
        }

        years += this.year;

        SimpleDate newDate = new SimpleDate(days, months, years);

        return newDate;
    }

}
