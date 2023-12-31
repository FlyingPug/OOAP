package com.dron.storeAPI.repository;

import com.dron.storeAPI.repository.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long>, JpaSpecificationExecutor<Product> {
    Product getProduct(Long id);

	void deleteProducts(Long id);
	
	void setProducts(Long id, Product product)
}
