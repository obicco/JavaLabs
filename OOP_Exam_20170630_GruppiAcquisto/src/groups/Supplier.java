package groups;

import java.util.TreeSet;

public class Supplier {
	
	String name;
	int nBids = 0;
	Supplier(String name) {this.name = name;}
	TreeSet<String> products = new TreeSet<>();
	int getNBids() {return nBids;}
	String getName() {return name;}
	
}
