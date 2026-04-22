package io.sample.springwebdemo.repo;

import io.sample.springwebdemo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
