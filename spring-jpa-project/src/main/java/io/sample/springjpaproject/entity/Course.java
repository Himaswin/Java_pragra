package io.sample.springjpaproject.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Title;
    private String Description;

    @ManyToMany(mappedBy = "courses")
    private List<Student> students;


}
