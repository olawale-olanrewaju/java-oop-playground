package OOPlayground;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class EntryPoint {

    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        
        List<Account> accounts = Arrays.asList(
            new Checking("CHK123", new BigDecimal("100.00")),
            new Checking("CHK456", new BigDecimal("56.00")),
            new Credit("CRT234", new BigDecimal("20.00")),
            new Credit("CRT345", new BigDecimal("30.00"))
        );

        accounts.stream().forEach(account -> repository.createAccount(account));

        System.out.println("All account added to repository");
    }
    
}
