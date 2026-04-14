package io.sample.httpclientsnov.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

    private Long id;
    private String productName;
    private Double price;
    private Integer quantity;
}
