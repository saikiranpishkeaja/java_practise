package singleton;

public  class Shape {
	
	final void displayinfo() {
		System.out.println("It depends on different structure");
	}

}

class Circle extends Shape{
	void displayinfo() {
		System.out.println("It's one of the shape");
	}
}

