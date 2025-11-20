package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.dao.ProductDao;
import com.demo.dao.ProductDaoImpl;
import com.demo.beans.*;

public class ProductServiceImpl implements ProductService {

	
	 private ProductDao pdao;
	   
	   public ProductServiceImpl() {
		   
		   pdao=new ProductDaoImpl();
	   }
	   
	@Override
	public boolean addNewProduct() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Pid");
		int pid = sc.nextInt();
		System.out.println("Enter product name");
		String pname=sc.next();
		System.out.println("Enter qty");
		int qty=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		System.out.println("Enter mfgdate (dd/MM/yyyy)");
		String dt=sc.next();
		LocalDate ldt = LocalDate.parse(dt,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Product p = new Product(pid,pname,qty,price,ldt);
		
     
		return pdao.save(p);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return pdao.findAllProducts();
	}

	@Override
	public boolean deleteById(int id) {
		
		return pdao.removeById(id);
	}

	@Override
	public boolean modifyById(int id, int qty, double price) {
		// TODO Auto-generated method stub
		return pdao.updateById(id,qty,price);
	}

	@Override
	public void closeMyConnection() {
		pdao.closeConnection();
		
	}

	@Override
	public Product getById(int id) {
		
		return pdao.findbyId(id);
	}

	@Override
	public List<Product> sortByPrice() {
		
		return pdao.arrangeByPrice();
	}

	
	
}
