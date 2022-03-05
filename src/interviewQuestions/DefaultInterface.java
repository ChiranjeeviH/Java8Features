package interviewQuestions;

public interface DefaultInterface {
	
	// Before JDK 1.8 inteface methods
	
	public void method1();
	
	// From JDK 1.8 default methods and static mthods
	
	public default void method2() {
		System.out.println("DefaultInterface");
	}
	
	static void method3() {
		System.out.println("DefaultInterface, static method");
	}
	
	public static void main () {
		System.out.println("Will run this program through this");
		DefaultInterface.method3();
	}
	
	
	
	DefaultInterface df1 = () -> {System.out.println("Default interface lamda");} ;
	

}
