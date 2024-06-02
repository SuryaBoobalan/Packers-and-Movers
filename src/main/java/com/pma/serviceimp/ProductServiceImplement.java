package com.pma.serviceimp;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pma.Entity.Product;
import com.pma.Entity.User;
import com.pma.dao.ProductDao;
import com.pma.service.ProductService;

@Service
@Transactional
public class ProductServiceImplement implements ProductService{
	
	
	ProductDao udao;
	
	
	
	public ProductServiceImplement(ProductDao udao) {
		super();
		this.udao = udao;
	}

	@Override
	public String addProduct(Product Product) {
		
		return udao.addProduct(Product);
	}

	@Override
	public Product findProduct(int id) {
		
		return udao.findProduct(id);
	}

	@Override
	public String updateProduct(Product Product) {
		
		return udao.updateProduct(Product);
	}

	@Override
	public String deleteProduct(int id) {
		
		return udao.deleteProduct(id);
	}

	@Override
	public List<Product> getAllProduct() {
		return udao.getAllProduct();
	}
	
	

}
