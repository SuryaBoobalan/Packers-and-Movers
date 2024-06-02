package com.pma.service;

import java.util.List;

import com.pma.Entity.Product;
import com.pma.Entity.User;

public interface ProductService {

	public String addProduct(Product Product);
	
	public Product findProduct(int ProductId);
	
	public String updateProduct(Product Product);
	
	public String deleteProduct(int id);
	
	public List<Product> getAllProduct();
	

}
