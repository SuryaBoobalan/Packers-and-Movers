package com.pma.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.Entity.Item;
import com.pma.service.ItemService;

@RestController
@CrossOrigin("http://localhost:3000")

@RequestMapping("/api/rest/")
public class ItemController {

	private ItemService service;
	
	
	
	public ItemController(ItemService service) {
		this.service = service;
	}

	@PostMapping("/Item")
	public String addItem(@RequestBody Item Item)
	
	{
		System.out.println(Item);
		return service.addItem(Item);
	}
	
	@GetMapping("/Item/{ItemId}")
	public List<Item> findItem(@PathVariable("ItemId") final int ItemId)
	{
		return service.findItem(ItemId);
	}
	
	@PutMapping("/Item")
	public String updateItem(@RequestBody Item Item)
	{
		return service.updateItem(Item);
	}
	
	@DeleteMapping("/Item/{ItemId}")
	public String deleteItem(@PathVariable("ItemId") final int ItemId)
	{
		return service.deleteItem(ItemId);
	}
	
	@PutMapping("item/{ItemId}")
	public String updateQuantity(@PathVariable("ItemId") int ItemId)
	{
		return service.updateQuantity(ItemId);
	}
	
	@PutMapping("/itemDecrease/{ItemId}")
	public String decreaseQuantity(@PathVariable("ItemId") int ItemId)
	{
		return service.decreaseQuantity(ItemId);
	}
	
}
