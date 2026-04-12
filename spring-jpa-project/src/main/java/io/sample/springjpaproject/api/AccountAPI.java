package io.sample.springjpaproject.api;

import io.sample.springjpaproject.entity.BankAccount;
import io.sample.springjpaproject.repo.AccountRepo;
import io.sample.springjpaproject.service.AccountService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountAPI {
    private AccountService accountService;

    public AccountAPI(AccountService accountService){
        this.accountService = accountService;
    }

    @PostMapping("/api/customer/{id}/account")
    public BankAccount createAccount(@RequestBody BankAccount bankAccount, @PathVariable Integer id){
        return accountService.createAccount(bankAccount, id);
    }

    @PostMapping("/api/account/{id}")
    public BankAccount closeAccount(@PathVariable long id){
        return accountService.deleteAccount(id);
    }
}
