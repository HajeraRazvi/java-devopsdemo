/**
 * 
 */
package com.demo.service;

import java.util.ArrayList;

import com.demo.model.Product;

/**
 * @author Hajera Razvi
 *
 */
public class ProductService {
	
	ArrayList<Product> list = new ArrayList();
	
		
	public ProductService() {
		Product product = new Product(100, "Book" , 12.34);
		list.add(product);
	}
	
	public ArrayList<Product> getAllProducts() {
		return list;
		}
	}
	
	
