package com.pma.dao;

import java.util.List;

import com.pma.Entity.Product;

public interface ProductDao {

	
	public String addProduct(Product Product);
	
	public Product findProduct(int id);
	
	public String updateProduct(Product Product);
	
	public String deleteProduct(int id);
	
	public List<Product> getAllProduct();
}
