package test7.sub5;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		ShoppingMall shoppingmall = new ShoppingMall();
		
		Customer customer1 = new Customer("A101","김유신");
		Customer customer2 = new Customer("A102","김춘추");
		
		shoppingmall.addCustomer(customer1);
		shoppingmall.addCustomer(customer2);
		
		Product tshirt = new Clothes("티셔츠",15000);
		Product orange = new Food("오렌지",3000);
		Product banana = new Food("바나나",3500);
		
		Order order1 = new Order(1,customer1);
		order1.addProduct(orange);
		order1.addProduct(tshirt);
		
		Order order2 = new Order(2,customer2);
		order2.addProduct(tshirt);
		order2.addProduct(banana);
		
		shoppingmall.addOrder(order1);
		shoppingmall.addOrder(order2);
		
		List<Order> orders = shoppingmall.getOrders();
		
		for(Order order : orders) {
			System.out.println("주문번호: " + order.getOrderNo());
			System.out.println("고객이름: " + order.getCustomer().getName());
			System.out.println("주문금액: " + "₩" + order.getTotalPrice());
			System.out.println("주문목록");
			for(Product product : order.getProducts()) {
				System.out.println(" - " + product.getName() + " ₩" + product.getPrice());
			}
			System.out.println();
		}
	}
}