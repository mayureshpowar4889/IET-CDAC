package com.demo.service;

import java.util.List;

import com.demo.beans.Product;

public interface ProductService {

	boolean addNewProduct();

	List<Product> getAllProducts();

	boolean deleteById(int id);

	boolean modifyById(int id, int qty, double price);

	void closeMyConnection();

	Product getById(int id);

	List<Product> sortByPrice();

}
