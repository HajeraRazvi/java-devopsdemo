/**
 * 
 */
package com.demo.main;

import java.util.ArrayList;

import com.demo.model.Product;
import com.demo.service.ProductService;

/**
 * @author Hajera Razvi
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ProductService service = new ProductService();
		ArrayList<Product> list = service.getAllProducts();
		list.forEach(System.out::println);
	}

}
