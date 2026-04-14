package io.sample.springjpaproject.repo;

import io.sample.springjpaproject.entity.AccountTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<AccountTransaction, Long> {
}
