package test.driven.development;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    public Franc time(int multiplier) {
        return new Franc(amount * multiplier, null);
    }

    @Override
    String currency() {
        return "CHF";
    }


}
