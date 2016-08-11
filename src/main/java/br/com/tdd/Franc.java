package br.com.tdd;

public class Franc extends Money{

    public Franc() {
    }

    public Franc(int amount) {
        super(amount);
    }

    Money times(int multiplier){
        return new Franc(amount * multiplier);
    }
}