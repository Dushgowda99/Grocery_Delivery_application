package com.edubridge.service;

import java.util.List;

import com.edubridge.model.Item;

public interface ItemService {
	public Item saveItem(Item item);
	public List<Item> getAllItems();
	public Item getItemById(int item_id);
	public void deleteItemById(int item_id);
	public Item updateItemById(int item_id,Item item);
    public Item getItemByName(String itemname);
}
	


