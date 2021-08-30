package test.driven.development;

public class Franc extends Money {

//    public int amount;

    public Franc(int amount){
        this.amount = amount;
    }

    public Franc time(int multiplier){
        return new Franc(amount * multiplier);
    }

//    public boolean equals(Object object){
//        Franc franc = (Franc) object;
//        return amount == franc.amount;
//    }




}
