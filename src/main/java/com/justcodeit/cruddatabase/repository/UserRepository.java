package com.justcodeit.cruddatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justcodeit.cruddatabase.pojo.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
