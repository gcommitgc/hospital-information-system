package data;

import java.io.Serializable;

public class Medicine implements Serializable{

	private String name;
	private double price;
	private String discribe;

	public Medicine(String name, double price,String discribe) {
		this.name = name;
		this.price = price;
		this.discribe=discribe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDiscribe() {
		return discribe;
	}

	public void setDiscribe(String discribe) {
		this.discribe = discribe;
	}
	
}
