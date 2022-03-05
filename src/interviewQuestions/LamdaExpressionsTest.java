package interviewQuestions;

public class LamdaExpressionsTest {
	
	public static void main(String[] args) {
		LamdaExpressions lamdaInterfaceObj = (int x)->System.out.println("value: "+x*2);
		lamdaInterfaceObj.add(5);
		lamdaInterfaceObj.display();
		LamdaExpressions lamdaInterfaceObj1 = (int y)->{
			//y=2;
			if(y%2==0) {
				System.out.println("Even Number: "+y);
			}
		};
		lamdaInterfaceObj1.add(4);
	}

}
