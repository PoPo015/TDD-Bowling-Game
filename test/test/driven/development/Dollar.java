package test.driven.development;

public class Dollar extends Money {

    public Dollar(int amount, String currency) {
        super(amount, currency);
    }


    public Money time(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    @Override
    String currency() {
        return "USD";
    }


}
