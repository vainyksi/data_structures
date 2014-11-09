package core;

import java.util.List;

public class ProductPlace {
	protected String name;
	protected int id;
	protected String address;
	protected List<Product> arrivedItems;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Product> getArrivedItems() {
		return arrivedItems;
	}

	public void setArrivedItems(List<Product> arrivedItems) {
		this.arrivedItems = arrivedItems;
	}

}