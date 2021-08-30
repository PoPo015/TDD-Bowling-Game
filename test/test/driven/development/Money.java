package test.driven.development;

public abstract class Money {

    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    static Dollar dollar(int amount) {
        return new Dollar(amount, "CHF");
    }

    static Franc franc(int amount) {
        return new Franc(amount, "USD");
    }

    abstract Money time(int multiplier);

    abstract String currency();


}
