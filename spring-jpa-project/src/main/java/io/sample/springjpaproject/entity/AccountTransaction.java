package io.sample.springjpaproject.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import lombok.EqualsAndHashCode;

import java.time.Instant;
import java.util.Date;

@Entity
@Data
public class AccountTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant transactionDate;
    private Double trxAmount;
    private TrxType trxType;

    @ManyToOne()
    @JoinColumn(name = "account_id")
    @JsonIgnore
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private Account account;
}
