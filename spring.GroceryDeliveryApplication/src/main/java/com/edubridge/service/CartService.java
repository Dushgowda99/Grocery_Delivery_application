package com.edubridge.service;

import java.util.List;
import org.springframework.web.bind.annotation.RequestBody;
import com.edubridge.model.Cart;

public interface CartService {
	public Cart saveCartItem(int item_id,int user_id,@RequestBody Cart cart);
	public List<Cart> getAllCarts();
	public List<Cart> getCartItemByUserId(int userId); 
	public Cart getCartItemByCartId(int cart_id);
    public void deleteCartItemByCartId(int cart_id);
    public Cart updateCartItemByCartId(int cart_id,Cart cart);
    public Cart getCartByCartItemName(String cartItemName);
    
}
