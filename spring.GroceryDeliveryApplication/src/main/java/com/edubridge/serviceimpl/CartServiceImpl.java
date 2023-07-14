package com.edubridge.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.exception.ResourceNotFoundException;
import com.edubridge.model.Cart;
import com.edubridge.model.Item;
import com.edubridge.model.User;
import com.edubridge.repository.CartRepository;
import com.edubridge.service.CartService;
import com.edubridge.service.ItemService;
import com.edubridge.service.UserService;
@Service
public class CartServiceImpl implements CartService{
@Autowired
private CartRepository cartRepository;
@Autowired
private ItemService itemService;

@Autowired
private UserService userService;
public CartServiceImpl(CartRepository cartRepository) {
	this.cartRepository=cartRepository;
}
	@Override
	public Cart saveCartItem(int item_id,int user_id,Cart cart) {
		System.out.println("inside cart service");
		double total_price=0.0;
	User user=	userService.getUserById(user_id);
	Item item=	itemService.getItemById(item_id);
	cart.setUser(user);
	cart.setItem(item);
	cart.setCartItemName(item.getItemName());
	cart.setQuantity(item.getItem_quantity());
	
	total_price=item.getItem_cost()*item.getItem_quantity();
	cart.setTotal_cost(total_price);
	return cartRepository.save(cart);
	}
	@Override
	public List<Cart> getAllCarts() {
		return cartRepository.findAll();
	}
	@Override
	public Cart getCartItemByCartId(int cart_id) {
		return cartRepository.findById(cart_id).orElseThrow(()->new ResourceNotFoundException("Cart","cartServiceNo",cart_id));
	}
	@Override
	public void deleteCartItemByCartId(int cart_id) {
		Cart cart = getCartItemByCartId(cart_id);
		cartRepository.deleteById(cart.getCart_id());
	}
	@Override
	public Cart updateCartItemByCartId(int cart_id,Cart cart) {
		Cart cart1 = getCartItemByCartId(cart_id);
		cart1.setCartItemName(cart.getCartItemName());
		cart1.setQuantity(cart.getQuantity());
		cart1.setTotal_cost(cart.getTotal_cost());
		return cartRepository.save(cart1);
	}
	@Override
	public Cart getCartByCartItemName(String cartItemName) {
		
		Cart cart= cartRepository.findByCartItemName(cartItemName);
		if(cartItemName!=null) {
			return cart;
		}else {
			throw new ResourceNotFoundException("Cart","cartItemName",cartItemName);
		}
	}
	@Override
	public List<Cart> getCartItemByUserId(int userId) {
		// TODO Auto-generated method stub
		System.out.println("in cart service user_id");
		return cartRepository.findByUserUserId(userId);
	}
		

	
	
	
	

}
