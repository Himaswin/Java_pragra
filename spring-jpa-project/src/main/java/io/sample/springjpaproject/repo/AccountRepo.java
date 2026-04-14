package io.sample.springjpaproject.repo;

import io.sample.springjpaproject.entity.Account;
import io.sample.springjpaproject.entity.AccountStatusEnum;
import io.sample.springjpaproject.entity.AccountTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


/*
    Spring data JPA allow you to generate method with convention
 */
@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {

    //SELECT * FROM ACCOUNT WHERE ACCOUNT_TYPE = ? AND STATUS = ?
    List<Account> findAccountByAccountTypeAndAccountStatus(AccountTypeEnum accountType, AccountStatusEnum status);
    List<Account> findAccountByCustomerIdAndAccountStatusAndAccountType(Integer customerId, AccountStatusEnum status, AccountTypeEnum accountType);

    List<Account> findAllByBalanceIsLessThanEqual(double balanceIsLessThan);

    @Query("SELECT A FROM Account A WHERE A.balance > :minbal AND A.balance < :maxbal")
    List<Account> accountsWithZeroToHundred(@Param("minbal")double minbalance, @Param("maxbal")double maxbalance);
}
