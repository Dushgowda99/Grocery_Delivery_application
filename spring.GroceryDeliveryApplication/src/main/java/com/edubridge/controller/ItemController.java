package com.edubridge.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.model.Item;
import com.edubridge.service.ItemService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
//http://localhost:8089/api/item
@RequestMapping("/api/item")
public class ItemController {
	@Autowired
	private ItemService itemService;
	public ItemController(ItemService itemService) {
		this.itemService= itemService;
	}
	@PostMapping()
		public ResponseEntity<Item> saveItem(@Validated @RequestBody Item item) {
		System.out.println(item);
		return new ResponseEntity<Item> (itemService.saveItem(item),HttpStatus.CREATED);
	}
	@GetMapping()

	public List<Item> getAllItems(){
		return itemService.getAllItems();
	}
	@GetMapping("/{item_id}")
	public ResponseEntity<Item> getItemById(@PathVariable("item_id") int item_id){
		return new ResponseEntity<Item> (itemService.getItemById(item_id),HttpStatus.OK);
	}
	@DeleteMapping("/{item_id}")
	public ResponseEntity<String> deleteItemById(@PathVariable("item_id") int item_id){
		itemService.deleteItemById(item_id);
		return new ResponseEntity<String>("Deleted Successfully",HttpStatus.OK);
		
	}
	@PutMapping("/{item_id}")
	public ResponseEntity<Item> updateItemById(@PathVariable("item_id") int item_id,@RequestBody Item item){
		return new ResponseEntity<Item>(itemService.updateItemById(item_id, item),HttpStatus.OK);
	}

	  @GetMapping("/getItem/{itemname}")
	  public ResponseEntity<Item> findMenuItemByItem_name(@PathVariable("itemname") String itemname)
	  {
	  	return new ResponseEntity<Item>(itemService.getItemByName(itemname),HttpStatus.OK);
	  } 

	}
	


