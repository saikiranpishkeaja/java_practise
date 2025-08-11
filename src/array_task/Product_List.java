package array_task;

public class Product_List {

	    private int productId;
	    private String productName;
	    private double rating;

	    public Product_List(int productId, String productName, double rating) {
	        this.productId = productId;
	        this.productName = productName;
	        this.rating = rating;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public double getRating() {
	        return rating;
	    }

	    @Override
	    public String toString() {
	        return "Product{" +
	               "productId=" + productId +
	               ", productName='" + productName + '\'' +
	               ", rating=" + rating +
	               '}';
	    }
	}

	
