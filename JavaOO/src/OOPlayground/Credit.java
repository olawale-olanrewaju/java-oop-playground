package OOPlayground;

import java.math.BigDecimal;

public class Credit extends Account{

    private BigDecimal balance;

    public Credit(String id, BigDecimal balance){

        super(id);
        this.balance = balance;

    }

    public Credit(Credit source){
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
    public Account clone() {
        return new Credit(this.getId(), this.balance);
    }
    
}
