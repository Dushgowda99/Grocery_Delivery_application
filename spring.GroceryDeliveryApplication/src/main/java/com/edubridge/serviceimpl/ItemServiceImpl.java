package com.edubridge.serviceimpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.model.Item;
import com.edubridge.repository.ItemRepository;
import com.edubridge.service.ItemService;
import com.edubridge.exception.ResourceNotFoundException;
@Service
public class ItemServiceImpl implements ItemService{
	@Autowired
private ItemRepository itemRepository;

public ItemServiceImpl(ItemRepository itemRepository) {
	this.itemRepository=itemRepository;
}
	@Override
	public Item saveItem(Item item) {
		
		return itemRepository.save(item);
	}
	@Override
	public List<Item> getAllItems() {
		return itemRepository.findAll();
	}
	@Override
	public Item getItemById(int item_id) {
		
		return itemRepository.findById(item_id).orElseThrow(()->new ResourceNotFoundException("Item","Item_Id",item_id));
	}
	@Override
	public void deleteItemById(int item_id) {
		Item item = getItemById(item_id);
		itemRepository.deleteById(item.getItem_id());
		
	}
	@Override
	public Item updateItemById(int item_id, Item item) {
		Item item1 = getItemById(item_id);
		item1.setItemName(item.getItemName());
		item1.setItem_quantity(item.getItem_quantity());
		item1.setItem_cost(item.getItem_cost());
		return itemRepository.save(item1);
		
	}
	@Override
	public Item getItemByName(String itemname) {
		// TODO Auto-generated method stub
		Item item= itemRepository.findByItemName(itemname);
		if(item!=null) {
			return item;
		}else {
			throw new ResourceNotFoundException("Items","itemname",itemname);
		}
	}
	
	
	

}
