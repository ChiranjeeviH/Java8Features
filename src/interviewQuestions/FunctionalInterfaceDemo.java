package interviewQuestions;


@FunctionalInterface
public interface FunctionalInterfaceDemo {
	
	// Introduced in 1.8 in java.lang.FunctionalInterface- allows only one abstract method
	public abstract void firstMethod();
	
	public static void thirdMethod() {
		// allows a static method since its implemented 
	}
	
	public default void SecondMethod() {
		// allows a default method since its implemented too
	}
	
	
	
	
	

}
