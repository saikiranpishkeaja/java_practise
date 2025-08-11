package array_task;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Poduct_Main {

	public static void main(String[] args) {
		
		        List<Product_List> products = new ArrayList<>();
		        products.add(new Product_List(101, "Laptop", 4.5));
		        products.add(new Product_List(102, "Smartphone", 4.7));
		        products.add(new Product_List(103, "Tablet", 4.7));
		        products.add(new Product_List(104, "Monitor", 4.3));

		        // Sorting with anonymous inner class
//		        Collections.sort(products, new Comparator<Product_List>() {
//		            @Override
//		            public int compare(Product_List p1, Product_List p2) {
//		                if (Double.compare(p2.getRating(), p1.getRating()) != 0) {
//		                    return Double.compare(p2.getRating(), p1.getRating()); // Descending rating
//		                } else {
//		                    return p1.getProductName().compareTo(p2.getProductName()); // Ascending name
//		                }
//		            }
//		        });

		        
//		        Collections.sort(products, new Comparator<Product_List>() {
//		            @Override
//		            public int compare(Product_List p1, Product_List p2) {
//		                int ratingCompare = Double.compare(p2.getRating(), p1.getRating()); // Descending
//		                if (ratingCompare != 0) {
//		                    return ratingCompare;
//		                }
//		                return p1.getProductName().compareTo(p2.getProductName()); // Ascending
//		            }
//		        });
		        
		        
		        // lambda expression
		        products.sort((p1, p2) -> {
		            int ratingCompare = Double.compare(p2.getRating(), p1.getRating());
		            return (ratingCompare != 0) ? ratingCompare : p1.getProductName().compareTo(p2.getProductName());
		        });
		        
		        
		        
		        // Print sorted list
		        for (Product_List pro : products) {
		            System.out.println(pro);
		        }

	}

}
