package io.sample.springjpaproject.api;

import io.sample.springjpaproject.entity.AccountTransaction;
import io.sample.springjpaproject.service.TransactionService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionAPI {

    private TransactionService transactionService;

    public TransactionAPI(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping("/api/account/{id}/trx")
    public AccountTransaction createAccountTransaction(@RequestBody AccountTransaction accountTransaction, @PathVariable Long id){
        return transactionService.createTransaction(accountTransaction, id);
    }
}
