package com.petshop.petshopbackendproject.service;


import com.petshop.petshopbackendproject.model.Cart;
import com.petshop.petshopbackendproject.model.User;
import com.petshop.petshopbackendproject.repository.CartRepository;
import com.petshop.petshopbackendproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImpl implements CartService{

    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private UserRepository userRepository;

    @Override
    public void SaveCart(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> getCartByUser(User user) {

        return cartRepository.findByUser(user);
    }

    @Override
    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    @Override
    public void deleteCart(long cartId) {
        cartRepository.deleteById(cartId);
    }
}
