package io.sample.springjpaproject.service;

import io.sample.springjpaproject.entity.Account;
import io.sample.springjpaproject.entity.AccountTransaction;
import io.sample.springjpaproject.entity.TrxType;

import io.sample.springjpaproject.repo.TransactionRepo;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class TransactionService {
    private  AccountService accountService;
    private  TransactionRepo transactionRepo;

    public TransactionService(AccountService accountService, TransactionRepo transactionRepo) {
        this.accountService = accountService;
        this.transactionRepo = transactionRepo;
    }

    public AccountTransaction createTransaction(AccountTransaction accountTransaction, Long accountId){
        if(accountService.findAccountById(accountId).isPresent()){
            Account account = accountService.findAccountById(accountId).get();
            accountTransaction.setAccount(account);
            accountTransaction.setTransactionDate(Instant.now());
            if(accountTransaction.getTrxType() == TrxType.DEBIT){
                account.setBalance(account.getBalance()-accountTransaction.getTrxAmount());
            }else{
                account.setBalance(account.getBalance()+accountTransaction.getTrxAmount());
            }
            accountService.updateAccount(account);
            return transactionRepo.save(accountTransaction);
        }else{
            throw new RuntimeException("Account not found");
        }
    }
}
