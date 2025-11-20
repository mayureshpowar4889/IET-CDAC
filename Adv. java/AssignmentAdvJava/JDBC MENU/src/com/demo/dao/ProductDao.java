package com.demo.dao;

import java.util.List;

import com.demo.beans.Product;

public interface ProductDao {

	boolean save(Product p);

	List<Product> findAllProducts();

	boolean removeById(int id);

	boolean updateById(int id, int qty, double price);

	void closeConnection();

	Product findbyId(int id);

	List<Product> arrangeByPrice();

}
