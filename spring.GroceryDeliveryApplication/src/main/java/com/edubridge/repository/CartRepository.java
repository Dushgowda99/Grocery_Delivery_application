package com.edubridge.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.edubridge.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart , Integer> {

	public Cart findByCartItemName(String cartItemName);
	
	public List<Cart> findByUserUserId(int userId);

}
