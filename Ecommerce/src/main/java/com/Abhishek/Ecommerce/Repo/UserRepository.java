package com.Abhishek.Ecommerce.Repo;

import com.Abhishek.Ecommerce.Entity_Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
