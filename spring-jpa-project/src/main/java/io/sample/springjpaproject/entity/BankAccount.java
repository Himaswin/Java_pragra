package io.sample.springjpaproject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "CUSTOMER_ACCOUNT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BankAccount {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "account_sequence")
    @SequenceGenerator(name = "account_sequence", sequenceName = "account_seq",initialValue = 800000001, allocationSize = 1)
    @Column(name = "ACCOUNT_NUMBER")
    private Long number;
    private double balance;
    private AccountTypeEnum accountType;
    private AccountStatusEnum accountStatus;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
}
