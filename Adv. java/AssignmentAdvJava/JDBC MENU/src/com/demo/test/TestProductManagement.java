package com.demo.test;
import java.util.*;

import com.demo.beans.Product;
import com.demo.service.*;

public class TestProductManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ProductService service = new ProductServiceImpl();
		
		
		while(true) {
			System.out.println("\n======================================");
			
			System.out.println("1. add new product\n2. delete product\n3. modify product");
			System.out.println("4. find by Id\n5. display all\n6. display in price sorted order"
					+ "\n7. exit");
			
			System.out.println("Enter choice :");
			int ch=sc.nextInt();
			switch(ch) {
			
			case 1->{
				
			 boolean sts =	service.addNewProduct();
			 if(sts) {
					System.out.println("product addedd successfully");
				}else {
					System.out.println("Not added!!!");
				}
			 
			}
			case  2->{
				System.out.println("Enter id");
				int id=sc.nextInt();
				
				boolean sts=service.deleteById(id);
				
				if(sts) {
					System.out.println("product deleted successfully");
				}else {
					System.out.println("Not deleted");
				}
			}
			case 3->{
				System.out.println("enter id");
				int id=sc.nextInt();
				System.out.println("enter qty");
				int qty=sc.nextInt();
				System.out.println("enter price");
				double price=sc.nextDouble();
				boolean sts=service.modifyById(id,qty,price);
				if(sts) {
					System.out.println("product updated successfully");
				}else {
					System.out.println("Not updated");
				}
			}
			case 4->{
				System.out.println("enter id");
				int id=sc.nextInt();
				
				Product p=service.getById(id);
				
				if(p==null) {
					System.out.println("not found");
				}else {
					System.out.println(p);
				}
			}
			
			case 5->{
				List<Product> plist = service.getAllProducts();
				plist.forEach(System.out::println);
			}
			case 6->{
				List<Product> plst =service.sortByPrice();
				plst.forEach(System.out::println);
			}
			
			
			case 7->{
				System.out.println("Thank You!!!!!!!");
				sc.close();
				service.closeMyConnection();
				System.exit(0);
			}
			default ->{
				System.out.println("Invalid Choice !!!");
			}
		
			}
		}
	}

}
