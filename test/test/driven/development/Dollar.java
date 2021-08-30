package test.driven.development;

public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }


    public void time(int multiplier) {
        amount *= multiplier;
    }
}
