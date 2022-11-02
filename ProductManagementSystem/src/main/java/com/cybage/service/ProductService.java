package com.cybage.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cybage.model.Product;

@Service
public class ProductService {
private List<Product> productList = new ArrayList<>();
public ProductService(){
	productList.add(new Product(1001,"Shampoo", 90000));
	productList.add(new Product(1002,"Soap", 20000));
	productList.add(new Product(1003,"Face wash", 20000));
	productList.add(new Product(1004,"Perfume", 70000));
	productList.add(new Product(1005,"Coffee", 10000));	
}

public List<Product> getAllProduct(){
	return productList;
}
}
