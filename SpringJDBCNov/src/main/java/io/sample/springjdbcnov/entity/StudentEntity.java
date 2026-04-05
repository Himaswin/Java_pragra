package io.sample.springjdbcnov.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentEntity {
    int id;
    String firstName;
    String lastName;
}
