package br.com.testapi.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.testapi.api.model.Products;
import br.com.testapi.api.repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	private ProductRepository repository;

	@GetMapping("/user-products")
	public List<Products> getProduct() {
		return repository.findAll();
	}
	
	@GetMapping("/user-products/{id}")
	public Optional<Products> getProduct(@PathVariable int id) {
		return repository.findById(id);
	}
}
