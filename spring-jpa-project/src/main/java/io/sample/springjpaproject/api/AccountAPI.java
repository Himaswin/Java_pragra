package io.sample.springjpaproject.api;

import io.sample.springjpaproject.entity.Account;
import io.sample.springjpaproject.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountAPI {
    private AccountService accountService;

    public AccountAPI(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping("/api/customer/{id}/account")
    public Account createAccount(@RequestBody Account bankAccount, @PathVariable Integer id){
        return accountService.createAccount(bankAccount, id);
    }

    @PostMapping("/api/account/{id}")
    public Account closeAccount(@PathVariable long id){
        return accountService.deleteAccount(id);
    }

    @GetMapping("/api/customer/{id}/account")
    public List<Account> getAllAccounts(@PathVariable Integer id){
        System.out.println(accountService.findMinMaxBalance());
        return accountService.fetchActiveChekingAccounts(id);
    }

    @GetMapping("/api/customer/less-than-zero")
    public List<Account> getAllLessThanZero(){
        return accountService.fetchAccountsLessThanZero();
    }
}
