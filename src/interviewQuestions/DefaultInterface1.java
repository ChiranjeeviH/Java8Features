package interviewQuestions;

public interface DefaultInterface1 {
	
	// Before JDK 1.8 inteface methods
	
		public void method1();
		
		// From JDK 1.8 default methods and static mthods
		
		public default void method2() {
			System.out.println("DefaultInterface1");
		}
		
		static void method3() {
			System.out.println("DefaultInterface1, static method");
			DefaultInterface.method3();
		}

}
