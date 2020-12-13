package warehouse;

import java.util.LinkedList;
import java.util.List;
import static java.util.stream.Collectors.*;
import static warehouse.Warehouse.*;
import static java.util.Comparator.*;

public class Product {
	
	private String code;
	private String description;
	private int quantity = 0;
	private List<Supplier> suppliers = new LinkedList<>();
	private List<Order> orders = new LinkedList<>();
	
	public Product(String code, String description) {
		this.code = code;
		this.description = description;
	}

	
	public String getCode(){
		return code;
	}

	public String getDescription(){
		return description;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

	public void decreaseQuantity(){
		quantity--;
	}

	public int getQuantity(){
		return quantity;
	}

	public List<Supplier> suppliers(){
		return suppliers;
	}

	public List<Order> pendingOrders(){
		return orders.stream().
	            filter(not(Order::delivered)).
	            sorted(comparing(Order::getQuantity).reversed()).
	            collect(toList());
	}
	
	public void addSupplier(Supplier supplier) {
        suppliers.add(supplier);
    }
	
	public void addOrder(Order order) {
        orders.add(order);
    }
}
