package objectOriented.interfaceProject;

import objectOriented.interfaceProject.pojo.Account;
import objectOriented.interfaceProject.pojo.Checking;
import objectOriented.interfaceProject.pojo.Credit;
import objectOriented.interfaceProject.repository.AccountRepository;
import objectOriented.interfaceProject.service.CheckingService;
import objectOriented.interfaceProject.service.CreditService;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        AccountRepository repository = new AccountRepository();
        CheckingService checkingService = new CheckingService(repository);
        CreditService creditService = new CreditService(repository);

        List<Account> accounts = Arrays.asList(
                new Checking("A1234B", new BigDecimal("500.00")),
                new Checking("E345F", new BigDecimal("300.50")),
                new Checking("I5678J", new BigDecimal("100.25")),
                new Credit("A1234B", new BigDecimal("0.50")),
                new Credit("G4567H", new BigDecimal("200.00"))
        );

//        accounts.stream().forEach(repository::createAccount);

//        accounts.stream().forEach(account -> {
//            repository.createAccount(account);
//        });

        accounts.forEach(account -> {
            if(account instanceof Checking){
                checkingService.createAccount((Checking) account);
            }
            else {
                creditService.createAccount((Credit) account);
            }
        });


        Checking checking = (Checking) repository.retrieveAccount("E345F");
//        Checking checking = CheckingService.retrieveAccount("E345F");
        System.out.println(checking.getBalance());

        checking.setBalance(checking.getBalance().add(new BigDecimal("100.00")));
        repository.updateAccount(checking);

        Checking updatedChecking = (Checking) repository.retrieveAccount("E345F");
        System.out.println(updatedChecking.getBalance());

        repository.deleteAccount("E345F");

        System.out.println(repository.getDatastore().size());
    }

}
