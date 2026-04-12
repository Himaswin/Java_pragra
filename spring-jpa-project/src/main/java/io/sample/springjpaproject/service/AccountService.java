package io.sample.springjpaproject.service;

import io.sample.springjpaproject.entity.AccountStatusEnum;
import io.sample.springjpaproject.entity.BankAccount;
import io.sample.springjpaproject.entity.Customer;
import io.sample.springjpaproject.repo.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AccountService {
    // dependency injection from the interface -- constructor based
    private final AccountRepo accountRepo;
    private CustomerService customerRepo;

    public AccountService(AccountRepo accountRepo, CustomerService customerRepo) {
        this.accountRepo = accountRepo;
        this.customerRepo = customerRepo;
    }

    public BankAccount createAccount(BankAccount account, int customer_id){
        Optional<Customer> customerById = customerRepo.getCustomerById(customer_id);
        if(!customerById.isPresent()){
            throw new RuntimeException("Customer not found");
        }
        account.setCustomer(customerById.get());
        return accountRepo.save(account);
    }

    public BankAccount deleteAccount(long accountNumber){
        Optional<BankAccount> account = accountRepo.findById(accountNumber);
        if(account.isPresent()){
            BankAccount bankAccount = account.get();
            bankAccount.setAccountStatus(AccountStatusEnum.CLOSED);
            accountRepo.save(bankAccount);
        }
        return null;
    }


}
