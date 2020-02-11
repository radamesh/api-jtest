package br.com.testapi.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.testapi.api.model.Products;

public interface ProductRepository  extends MongoRepository<Products, Integer> {

}
