package com.pma.dao;

import java.util.List;

import com.pma.Entity.Item;



public interface ItemDao {
	
	public String addItem(Item Item);
	
	public List<Item> findItem(int id);
	
	public String updateItem(Item Item);
	
	public String deleteItem(int id);
	
	public List<Item> getAllItem();
	
	public String updateQuantity(int id);
	
	public String decreaseQuantity(int id);
}
