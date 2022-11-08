package com.cybage.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cybage.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
	List<Product> findByPrice(int price);
	List<Product> findByProductName(String name);
	
	List<Product> findByProductNameStartingWith(String name);
	
	List<Product>findByPriceBetween(int price,int price2);
	
	List<Product>findByPriceLessThan(int price);
	List<Product>findByPriceGreaterThan(int price);
	
/*	@Query("From Product WHERE productName = ?1 And price = ?2")
	List<Product> getByName(String productName, int price);
*/
	
	@Query("From Product WHERE productName =:name And price =:pr")
	List<Product> getByName(@Param("name")String productName, @Param("pr") int price);

}
