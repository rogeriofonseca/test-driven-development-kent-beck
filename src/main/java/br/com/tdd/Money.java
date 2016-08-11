package br.com.tdd;

public abstract class Money {
    
    protected int amount;
    
    public Money(){
    }

    public Money(int amount) {
        this.amount = amount;
    }

    abstract Money times(int multipler);
    
    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
   }

    static Money dollar(int amount){
        return new Dollar(amount);
    }
}