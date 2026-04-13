package io.sample.springjpaproject.service;

import io.sample.springjpaproject.entity.AccountStatusEnum;
import io.sample.springjpaproject.entity.Account;
import io.sample.springjpaproject.entity.AccountTypeEnum;
import io.sample.springjpaproject.entity.Customer;
import io.sample.springjpaproject.repo.AccountRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AccountService {
    // dependency injection from the interface -- constructor based
    private final AccountRepo accountRepo;
    private CustomerService customerRepo;

    public AccountService(AccountRepo accountRepo, CustomerService customerRepo) {
        this.accountRepo = accountRepo;
        this.customerRepo = customerRepo;
    }

    public Account createAccount(Account account, int customer_id){
        Optional<Customer> customerById = customerRepo.getCustomerById(customer_id);
        if(!customerById.isPresent()){
            throw new RuntimeException("Customer not found");
        }
        account.setCustomer(customerById.get());
        return accountRepo.save(account);
    }

    public Account deleteAccount(long accountNumber){
        Optional<Account> account = accountRepo.findById(accountNumber);
        if(account.isPresent()){
            Account bankAccount = account.get();
            bankAccount.setAccountStatus(AccountStatusEnum.CLOSED);
            accountRepo.save(bankAccount);
        }
        return null;
    }

    public List<Account> accountWithZeroBalance(){
        return accountRepo.findAll().stream().filter(account -> account.getBalance()<= 0.0).collect(Collectors.toUnmodifiableList());
    }
    //fetch account which are active and chequing

    public List<Account> fetchActiveChekingAccounts(Integer id){
        List<Account> accountsByAccountTypeAndStatus = accountRepo.findAccountByAccountTypeAndAccountStatus(AccountTypeEnum.CHECKING, AccountStatusEnum.ACTIVE);
        return accountsByAccountTypeAndStatus.stream().filter(account -> account.getCustomer().getId() == id).collect(Collectors.toUnmodifiableList());
    }

    public List<Account> fetchAccountsLessThanZero(){
        return accountRepo.findAllByBalanceIsLessThanEqual(0.0);
    }
}
