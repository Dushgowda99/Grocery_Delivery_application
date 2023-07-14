package com.edubridge.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.edubridge.model.Cart;
import com.edubridge.service.CartService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartService cartService;
	
	public CartController(CartService cartService) {
		this.cartService=cartService;
	}
	
	@PostMapping("/{item_id}/{user_id}")
	public ResponseEntity<Cart> saveCartItem(@PathVariable("item_id") int item_id,@PathVariable("user_id") int user_id ,@RequestBody Cart cart)
	{
		System.out.println("inside cart controller");
		Cart cartItem1 = cartService.saveCartItem(item_id,user_id,cart);
		return new ResponseEntity<Cart>(cartItem1,HttpStatus.CREATED);
	}
	@GetMapping("/{user_id}")
	public List<Cart> getCartItemByUserId(@PathVariable("user_id") int user_id){
		System.out.println("in cart controller user_id");
		return cartService.getCartItemByUserId(user_id);
	}
	@GetMapping()
	public List<Cart> getAllCartItems(){
		return cartService.getAllCarts();
	}
	@GetMapping("/getByCartId/{cart_id}")
	public ResponseEntity<Cart> getCartItemByCartId(@PathVariable int cart_id){
		return new ResponseEntity<Cart>(cartService.getCartItemByCartId(cart_id),HttpStatus.OK);
	}
	@DeleteMapping("/{cart_id}")
	public ResponseEntity<String> deleteCartItemByCartId(@PathVariable("cart_id")int cart_id){
		cartService.deleteCartItemByCartId(cart_id);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
	}
	@PutMapping("/{cart_id}")
	public ResponseEntity<Cart> updateCartItemByCartId(@PathVariable int cart_id,@RequestBody Cart cart){
		return new ResponseEntity<Cart>(cartService.updateCartItemByCartId(cart_id, cart),HttpStatus.OK);
	}
	
	 @GetMapping("/getItem/{cartItemName}")
	  public ResponseEntity<Cart> getCartByCartItemName(@PathVariable("cartItemName") String cartItemName)
	  {
	  	return new ResponseEntity<Cart>(cartService.getCartByCartItemName(cartItemName),HttpStatus.OK);
	  }

}
