package com.petshop.petshopbackendproject.repository;


import com.petshop.petshopbackendproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    public User findByEmail(String email);
}
