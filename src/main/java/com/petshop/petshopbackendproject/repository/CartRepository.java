package com.petshop.petshopbackendproject.repository;


import com.petshop.petshopbackendproject.model.Cart;
import com.petshop.petshopbackendproject.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {

    public List<Cart> findByUser(User user);


}
