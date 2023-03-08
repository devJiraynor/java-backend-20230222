package hello;

class Example {
	String destination;
	
	Example() {
		destination = "서면";
	}
	
	Example(String destination) {
		this.destination = destination;
	}
}

public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
		System.out.println("Hello Java");
		
		Example example = new Example();
		example.destination = "부산역";
	}

}
