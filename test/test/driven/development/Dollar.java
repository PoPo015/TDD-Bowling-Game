package test.driven.development;

public class Dollar extends Money {

//    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar time(int multiplier) {
        return new Dollar(amount * multiplier);
    }

}
