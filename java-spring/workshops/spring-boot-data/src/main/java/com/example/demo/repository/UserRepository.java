package com.example.demo.repository;
import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.User;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface UserRepository extends JpaRepository<User, Long> {
  @Query("SELECT u FROM User u WHERE u.username = :username")
  ArrayList<User> findByUsername(@Param("username") String username);

  @Modifying 
  @Query("INSERT INTO User u (username, email, lastName) VALUES (:username, :email, :lastName)")
  void createNewUserByName(@Param("username") String username, @Param("email") String email, @Param("lastName") String lastName);

}
