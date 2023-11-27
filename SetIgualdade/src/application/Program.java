package application;

import entities.Product;

import java.util.HashSet;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Set<Product> set = new HashSet<>();
		
		set.add(new Product("tv",900.0));
		set.add(new Product("notebook", 1200.0));
		set.add(new Product("tablet", 400.0));
		
		Product product = new Product("notebook", 1200.0);
		
		System.out.println(set.contains(product));
	}

}
