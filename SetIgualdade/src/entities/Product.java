package entities;

import java.util.Objects;;

public class Product {
	
	private String name;
	private double price;
	
	public Product() {
		
	}
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice() {
		this.price = price;
	}
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return name.equals(product.name) && price ==(product.price);
    }
	
	@Override
	public int hashCode() {
		return Objects.hash(name, price);
	}
	

}
