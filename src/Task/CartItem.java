package Task;

import java.util.Scanner;

public class CartItem {

	private String itemName;
	private String itemCode;
	private double price;
	private int quantity;

	public CartItem(String itemName, String itemCode, double price, int quantity) {
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.price = validatePrice(price);
		this.quantity = validateQuantity(quantity);
	}

	private double validatePrice(double price) {
		return price > 0 ? price : 0;
	}

	private int validateQuantity(int quantity) {
		return quantity > 0 ? quantity : 0;

//		int quantity1=quantity;
//		if (quantity < 0) {
//			return 0;
//		}
//		return quantity;
	}

	void updateQuatity(int newQuantity) {
		this.quantity = newQuantity;
	}

	double calculatetotalprice() {
		return price * quantity;
	}

	void applyDiscount(double discountPercentage) {
		if (discountPercentage < 0 || discountPercentage > 100) {
			throw new IllegalArgumentException("Discount percentage must be between 0 and 100.");
		}
		price -= price * (discountPercentage / 100);
	}

	public void getItemDetails() {
		System.out.println("ItemName :" + itemName);
		System.out.println("ItemCode :" + itemCode);
		System.out.println("Price :" + price);
		System.out.println("Quantity :" + quantity);
		System.out.println("Totalprice :" + calculatetotalprice());
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuatity() {
		return quantity;
	}

	public void setQuatity(int quantity) {
		this.quantity = quantity;
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter Item Name : ");
		String itemName = scanner.next();

		System.out.println("Enter Item Code :");
		String itemCode = scanner.next();

		System.out.println("Enter Item Price :");
		double price = scanner.nextDouble();

		System.out.println("Enter Item quantity :");
		int quantity = scanner.nextInt();

		System.out.println("Enter Discount(%):");
		double applyDiscount = scanner.nextDouble();
	

		System.out.println("The total price of customer :");
		

		CartItem cart = new CartItem(itemName, itemCode, price, quantity);
		cart.applyDiscount(applyDiscount);
		System.out.println(cart.calculatetotalprice());
//		cart.getItemDetails();
//		cart.setItemCode("TY234");
//		cart.applyDiscount(10);
//		System.out.println("After discount");
//		cart.getItemDetails();

	}

}
