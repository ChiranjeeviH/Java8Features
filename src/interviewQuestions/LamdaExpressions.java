package interviewQuestions;

public interface LamdaExpressions {
	
	public void add(int a);
	
	default void display() {
		System.out.println("display something");
	}

}
