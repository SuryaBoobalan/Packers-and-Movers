package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Item;
import com.pma.dao.ItemDao;
import com.pma.service.ItemService;

@Service
@Transactional
public class ItemServiceImplement implements ItemService {
	

	ItemDao udao;
	
	
	
	public ItemServiceImplement(ItemDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addItem(Item Item) {
		
		return udao.addItem(Item);
	}

	@Override
	public List<Item> findItem(int id) {
		
		return udao.findItem(id);
	}

	@Override
	public String updateItem(Item Item) {
		
		return udao.updateItem(Item);
	}

	@Override
	public String deleteItem(int id) {
		
		return udao.deleteItem(id);
	}

	@Override
	public List<Item> getAllItem() {
		return udao.getAllItem();
	}

	@Override
	public String updateQuantity(int id) {
		
		return udao.updateQuantity(id);
	}

	@Override
	public String decreaseQuantity(int id) {
		
		return udao.decreaseQuantity(id);
	}

	
	
	
}
