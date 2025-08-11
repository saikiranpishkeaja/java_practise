package Task;

public class Vehicle {
	void brand() {
		System.out.println("It Brand do u need");
	}
	void model() {
		System.out.println("It model do u need");
	}

}

class Car extends Vehicle {
	void brand() {
		System.out.println("I need car Brand Ferrari");
	}
	void model() {
		System.out.println("It model Ferrari 488");
	}
}

class Bike extends Vehicle {
	void brand() {
		System.out.println("I need Bike KTM ");
	}
	void model() {
		System.out.println("It model KTM 200 Duke");
	}
}
