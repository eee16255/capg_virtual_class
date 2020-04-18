package com.capg.demo.service;

import java.util.List;

<<<<<<< HEAD
<<<<<<< HEAD
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.model.Product;
import com.capg.demo.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	ProductRepo  productRepo;
	public List<Product> findAll()
	{
		return productRepo.findAll();
	}
    
	public Product getOne(int productId)
	{
        return productRepo.getOne(productId);
	}
	
	@Transactional
	public Product save(Product product)
	{
		return productRepo.save(product);
	}
	
	@Transactional
	public boolean deleteById(int productId)
	{
		productRepo.deleteById(productId);
		return !productRepo.existsById(productId);
	}
	
	@Transactional
	public Product updateProduct(Product newProduct)
	{
		Product oldProduct=getOne(newProduct.getProductId());
		oldProduct.setProductName(newProduct.getProductName());
		oldProduct.setPrice(newProduct.getPrice());
		productRepo.save(oldProduct);
		return oldProduct;
	}

=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.model.Product;
import com.capg.demo.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private  ProductRepo  productRepo;
	
	public List<Product> findAllProducts() {
		 
		return productRepo.findAll();
	}

	public Product createProduct(Product product) {
		
		return productRepo.saveAndFlush(product);
	}
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.demo.model.Product;
import com.capg.demo.repo.ProductRepo;
@Service
public class ProductService {
	@Autowired
	private  ProductRepo  productRepo;
	
	public List<Product> findAllProducts() {
		 
		return productRepo.findAll();
	}

	public Product createProduct(Product product) {
		
		return productRepo.saveAndFlush(product);
	}
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
 
}
