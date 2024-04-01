package onlineStoreManagmentSystem;

import java.util.HashMap;
import java.util.Set;

public class OSMS {

	static HashMap<String, Double> osms = new HashMap<>();

	static void addProduct(String product, double price) {
		osms.put(product, price);
	}

	static void buyProduct(String product) {

		if (osms.containsKey(product)) {
			osms.remove(product);
		} else {
			System.out.println("theres no product named: "+ product);
		}
	}

	static void showProducts() {
		Set<String> keys = osms.keySet();

		for (String key : keys) {
			System.out.println(key + ": " + osms.get(key));
		}
	}

	public static void main(String[] args) {
		addProduct("gaming car", 995.4);
		addProduct("gaming cat", 92);

		showProducts();

		buyProduct("gaming car");
		buyProduct("gaming dog");

		addProduct("gaming ?", 14);
		addProduct("gaming !", 2);

		showProducts();

	}

}
