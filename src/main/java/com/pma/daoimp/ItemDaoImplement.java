package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Item;
import com.pma.dao.ItemDao;

import jakarta.persistence.EntityManager;

@Repository
public class ItemDaoImplement implements ItemDao {
	
	public ItemDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addItem(Item Item) {
		eMan.persist(Item);
		return "Item Saved";
	}
	
	

	@Override
	public List<Item> findItem(int id) {
		
	 return eMan.createQuery("from Item item where user.userId = ?1").setParameter(1, id).getResultList();
	 
	}

	@Override
	public String updateItem(Item Item) {
		eMan.persist(Item);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteItem(int id) {
		Item obj = eMan.find(Item.class, id);
		eMan.remove(obj);
		return "Item Deleted";
	}

	@Override
	public List<Item> getAllItem() {
		return eMan.createQuery("from Item").getResultList();
	}
	
	@Override
	public String updateQuantity(int id) {
		 eMan.createQuery("Update Item i SET i.quantity = quantity + 1 WHERE i.itemId = ?1").setParameter(1, id).executeUpdate();
		 
		 return "Updated";
	}



	@Override
	public String decreaseQuantity(int id) {
		 eMan.createQuery("Update Item i SET i.quantity = quantity - 1 WHERE i.itemId = ?1").setParameter(1, id).executeUpdate();

		return "Decrement Done";
	}

}
