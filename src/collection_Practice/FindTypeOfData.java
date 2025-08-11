package collection_Practice;

class Container<T> {
	T value;
	
	public void show() {
		System.out.println(value.getClass().getName());
	}
}

public class FindTypeOfData {

	public static void main(String[]args) {
		Container<Integer> obj= new Container();
		obj.value=123;
		obj.show();
	}
	
}


// The output will be represented Integer while enter the value as int based 
//on that generics it shows