package test7.sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ShoppingMall {
	private List<Customer> customers;
	private List<Order> orders;
	private HashMap<String,List<Order>> customerOrders;
	
	public ShoppingMall() {
		this.customers = new ArrayList<>();
		this.orders = new ArrayList<>();
		this.customerOrders = new HashMap<>();
	}
	
	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
	
	public void addOrder(Order order) {
		orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}
}