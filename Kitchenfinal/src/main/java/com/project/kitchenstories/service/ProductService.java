package com.project.kitchenstories.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.kitchenstories.model.Product;
import com.project.kitchenstories.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		
		return productRepository.findAll();
		
	}

	public void addProduct(Product product) {
		
		productRepository.save(product);
		
	}
	
	public void removeProductById(int id) {
		
		productRepository.deleteById(id);
	}
	
	public Optional<Product> getProductById(int id){
		return productRepository.findById(id);
	}
	
	public List<Product> getAllProductsByCategoryId(int id){
		return productRepository.findAllByCategory_Id(id);
		
	}
	
	
	
}
