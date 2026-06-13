package com.payflow.repository;

import com.payflow.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUpiId(String upiId);
}