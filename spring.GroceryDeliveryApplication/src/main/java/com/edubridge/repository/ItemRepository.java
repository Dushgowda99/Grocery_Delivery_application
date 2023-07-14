package com.edubridge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.model.Item;
@Repository
public interface ItemRepository extends JpaRepository<Item , Integer>{

	public Item findByItemName(String itemName);

  

}
