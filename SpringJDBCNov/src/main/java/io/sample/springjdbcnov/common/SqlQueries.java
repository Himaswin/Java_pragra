package io.sample.springjdbcnov.common;

public interface SqlQueries {
    String getAllStudents = "select * from student";
    String saveStudents = "insert into student values (?,?,?)";
    String firstNameClause = "where FIRST_NAME = ?";
//    String deleteStudents = "";
}
