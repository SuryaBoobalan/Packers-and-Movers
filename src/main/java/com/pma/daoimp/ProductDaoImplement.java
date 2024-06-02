package com.pma.daoimp;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.pma.Entity.Product;
import com.pma.dao.ProductDao;

import jakarta.persistence.EntityManager;

@Repository
public class ProductDaoImplement implements ProductDao {
	

	public ProductDaoImplement(EntityManager eMan) {
		this.eMan = eMan;
		
	}
	
	EntityManager eMan;

	@Override
	public String addProduct(Product Product) {
		eMan.persist(Product);
		return "Product Saved";
	}
	
	

	@Override
	public Product findProduct(int id) {
		
		return eMan.find(Product.class, id);
	}

	@Override
	public String updateProduct(Product Product) {
		eMan.persist(Product);
		return "Object Saved Successfully";
	}

	@Override
	public String deleteProduct(int id) {
		Product obj = eMan.find(Product.class, id);
		eMan.remove(obj);
		return "Product Deleted";
	}

	@Override
	public List<Product> getAllProduct() {
		return eMan.createQuery("from Product").getResultList();
	}
	
}
