package com.petshop.petshopbackendproject.service;



import com.petshop.petshopbackendproject.model.Cart;
import com.petshop.petshopbackendproject.model.User;

import java.util.List;

public interface CartService {

    public void SaveCart(Cart cart);

    public List<Cart> getCartByUser(User user);

    public List<Cart> getAllCartItems();

    public void deleteCart(long cartId);
}
