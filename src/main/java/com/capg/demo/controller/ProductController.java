package com.capg.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
<<<<<<< HEAD

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.Product;
import com.capg.demo.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("/all")
	public List<Product>  findAll()
	{
		  return productService.findAll();
	}

	@GetMapping("/product/id/{id}")
	public Product getOne(@PathVariable int id) 
	{
		  return productService.getOne(id);
	}
	
	@PostMapping("/add")
	public Product  save(@RequestBody Product product)
	{
		return  productService.save(product);
	}
	
	@DeleteMapping("/product/id/{id}")
	public boolean  deleteById(@PathVariable int id)
	{
		return  productService.deleteById(id);
	}

	@PutMapping("/product")
	public Product  updateProduct(@RequestBody Product product)
	{
		return  productService.updateProduct(product);
	}
	
	
	
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.Product;
import com.capg.demo.service.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("product")
	public List<Product>  getAllProducts()
	{
		  return productService.findAllProducts();
	}
	
	@PostMapping("product")
	public Product  createProduct(@RequestBody Product product)
	{
		return  productService.createProduct(product);
	}
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
=======
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capg.demo.model.Product;
import com.capg.demo.service.ProductService;

@RestController

public class ProductController {

	@Autowired
	ProductService  productService;
	
	@GetMapping("product")
	public List<Product>  getAllProducts()
	{
		  return productService.findAllProducts();
	}
	
	@PostMapping("product")
	public Product  createProduct(@RequestBody Product product)
	{
		return  productService.createProduct(product);
	}
>>>>>>> branch 'master' of https://github.com/eee16255/capg_virtual_class.git
	
	
}
