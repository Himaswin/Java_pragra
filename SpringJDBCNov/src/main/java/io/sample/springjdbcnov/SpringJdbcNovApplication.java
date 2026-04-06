package io.sample.springjdbcnov;

import io.sample.springjdbcnov.entity.Employee;
import io.sample.springjdbcnov.entity.StudentEntity;
import io.sample.springjdbcnov.repo.EmployeeRepo;
import io.sample.springjdbcnov.repo.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringJdbcNovApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(SpringJdbcNovApplication.class, args);
        StudentRepo bean = context.getBean(StudentRepo.class);


//        StudentRepo bean1 = context.getBean(StudentRepo.class);
//        StudentEntity student1 = new StudentEntity();
//        student1.setId(10);
//        student1.setFirstName("John");
//        student1.setLastName("Doe");
//        bean1.saveStudent(student1);
//
        StudentRepo bean2 = context.getBean(StudentRepo.class);
        StudentEntity student2 = new StudentEntity(11, "Nick", "wick");
//        bean2.saveStudent(student2);


        StudentRepo bean3 = context.getBean(StudentRepo.class);
        StudentEntity student3 =  StudentEntity.builder()
                .id(12)
                .firstName("Bryan")
                .lastName("Johnson").build();
//        bean3.saveStudent(student3);


        EmployeeRepo employeeRepo = context.getBean(EmployeeRepo.class);
        Employee employee = Employee.builder().id(1L).name("Sham").dept("HR").salary(20000d).build();
        employeeRepo.save(employee);

        bean.getAllStudents().forEach(System.out::println);


    }


}
