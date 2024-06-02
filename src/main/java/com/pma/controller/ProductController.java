package com.pma.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pma.Entity.Product;
import com.pma.service.ProductService;

@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("/api/rest/")
public class ProductController {
	
private ProductService service;
	
	
	
	public ProductController(ProductService service) {
		this.service = service;
	}

	@PostMapping("/Product")
	public String addProduct(@RequestBody Product Product)
	
	{
		System.out.println(Product);
		return service.addProduct(Product);
	}
	
	@GetMapping("/Product/{ProductId}")
	public Product findProduct(@PathVariable("ProductId") final int ProductId)
	{
		return service.findProduct(ProductId);
	}
	
	@GetMapping("/Product")
	public List<Product> findAllProduct()
	{
		return service.getAllProduct();
	}
	
	
	
	
	
	@PutMapping("/Product")
	public String updateProduct(@RequestBody Product Product)
	{
		return service.updateProduct(Product);
	}
	
	@DeleteMapping("/Product/{ProductId}")
	public String deleteProduct(@PathVariable("ProductId") final int ProductId)
	{
		return service.deleteProduct(ProductId);
	}
	
}
