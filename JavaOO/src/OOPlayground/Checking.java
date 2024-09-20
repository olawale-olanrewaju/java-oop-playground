package OOPlayground;

import java.math.BigDecimal;

public class Checking extends Account {

    private BigDecimal balance;

    public Checking(String id, BigDecimal balance){
        super(id);
        this.balance = balance;
    }

    public Checking(Checking source){
        super(source);
        this.balance = source.balance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public Account clone(){
        return new Checking(this.getId(), this.balance);
    }
    
}
