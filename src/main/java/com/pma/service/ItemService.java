package com.pma.service;

import java.util.List;

import com.pma.Entity.Item;

public interface ItemService {
	
	public String addItem(Item Item);
	
	public List<Item> findItem(int ItemId);
	
	public String updateItem(Item Item);
	
	public String deleteItem(int id);
	
	public List<Item> getAllItem();
	
	public String updateQuantity(int id);
	
	public String decreaseQuantity(int id);
}
