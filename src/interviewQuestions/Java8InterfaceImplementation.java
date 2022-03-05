package interviewQuestions;

public class Java8InterfaceImplementation implements DefaultInterface1,DefaultInterface{
	
	public static void main(String[] args) {
		
		new Java8InterfaceImplementation().method1();
		new Java8InterfaceImplementation().method2();
		DefaultInterface1.method3();
		DefaultInterface.method3();
		
		DefaultInterface df1 = () -> {System.out.println("Default interface lamda");} ;
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		DefaultInterface.super.method2();
	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
